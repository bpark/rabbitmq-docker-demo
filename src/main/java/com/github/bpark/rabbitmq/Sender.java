package com.github.bpark.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Sender {

    private static final String QUEUE_NAME = "my-queue";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.77.8");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        for (int i=0; i<10; i++) {
            String message = "Message No. " + i;

            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" Sent " + message + "");
        }

        channel.close();
        connection.close();
    }
}
