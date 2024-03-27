package com.timbuchalka;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\vzay1\\Desktop\\JavaMasterClass\\Databases\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {


        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("drop table if exists " + TABLE_CONTACTS);

            statement.execute("create table if not exists " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement, "Tim", 6545678, "tim@email.com");
            insertContact(statement, "Joe", 45632, "joe@anywhere.com");
            insertContact(statement, "Jane", 4829484, "jane@somewhere.com");
            insertContact(statement, "Fido", 9038, "dog@email.com");

            statement.execute("update " + TABLE_CONTACTS + " set " +
                    COLUMN_PHONE + "=5566789" +
                    " where " + COLUMN_NAME + "='Jane'");

            statement.execute("delete from " + TABLE_CONTACTS +
                    " where " + COLUMN_NAME + "='Joe'");

            ResultSet results = statement.executeQuery("select * from " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("insert into " + TABLE_CONTACTS +
                "(" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ")" +
                "values('" + name + "', " + phone + ", '" + email + "')");
    }
}

//
//        try {
//                Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\vzay1\\Desktop\\JavaMasterClass\\Databases\\TestDB\\testjava.db");
////            conn.setAutoCommit(false);
//                Statement statement = conn.createStatement();
//                statement.execute("create table if not exists contacts " +
//                " (name text, phone integer, email text)");
//
//                statement.execute("insert into contacts (name, phone, email)" +
//                "values('joe', 45632, 'joe@anywhere.com')");
//
//                statement.execute("insert into contacts (name, phone, email)" +
//                "values('jane', 4829484, 'jane@somewhere.com')");
//
//                statement.execute("insert into contacts (name, phone, email)" +
//                "values('Fido', 23632, 'dog@email.com')");
//
//                statement.execute("update contacts set phone=5566789 where name='jane'");
//                statement.execute("delete from contacts where name='joe'");
//
//                statement.execute("select * from contacts");
//                ResultSet results = statement.getResultSet();
//                ResultSet results = statement.executeQuery("select * from contacts"); // above two lines and this line same thing!
//                while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                results.getInt("phone") + " " +
//                results.getString("email"));
//                }
//
//                results.close();
//
//                statement.close();
//                conn.close();
//
//                } catch (SQLException e) {
//
//                System.out.println("Something went wrong: " + e.getMessage());
//                }