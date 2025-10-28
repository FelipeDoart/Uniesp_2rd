/*
##INTERFACE##

É usada para implementar métodos que não seriam possiveis implementar nas classes "filhas"
pela classe "Pai".

Os métodos são mencionados para que nas classes possam ser possivel usar o "Override"

Ex.:

 */
// Declaração da interface
interface Animal {void comer();void dormir();}
// Classe que implementa a interface
class Cachorro implements Animal {
    @Override
    public void comer() {System.out.println("Cachorro comendo ração");}
    @Override
    public void dormir() {System.out.println("Cachorro dormindo");}
}
// Outra classe que implementa a mesma interface
class Gato implements Animal {
    @Override
    public void comer() {System.out.println("Gato comendo peixe");}
    @Override
    public void dormir() {System.out.println("Gato dormindo no sofá");}
}
