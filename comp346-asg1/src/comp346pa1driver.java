/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Kerly Titus
 */
public class comp346pa1driver {

    /**
     * main class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        Network objNetwork = new Network();            /* Activate the network */
        objNetwork.start();
        Server objServer1 = new Server("server1");
        objServer1.start();
        Server objServer2 = new Server("server2");
        objServer2.start();
        Client objClient1 = new Client("sending");              /* Start the sending client */
        objClient1.start();
        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        objClient2.start();
    }
}
