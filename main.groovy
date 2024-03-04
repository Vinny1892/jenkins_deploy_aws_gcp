import hudson.model.*
import hudson.slaves.*

def nodeDescription = "Descrição do novo nó"

// Crie um nó permanente
def nodeMode = Node.Mode.NORMAL

def taskListener = TaskListener.NULL

//ComputerLauncher launcher = new Launcher.LocalLauncher(taskListener)
// Crie um novo nó
def node = new DumbSlave(
    "teste2314",
    "/home/jenkins",
    new JNLPLauncher()
)

Jenkins.instance.addNode(node)
def createdNode = Jenkins.instance.getNode('teste2314')

def nodeName = createdNode.getNodeName()
println("Nome do nó criado: $nodeName")


println hudson.model.Hudson.instance.getComputer(nodeName).getJnlpMac()