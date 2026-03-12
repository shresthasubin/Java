package dao.impl;

import Model.Topic;
import com.mysql.cj.protocol.Resultset;
import dao.interfaces.TopicInterface;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class TopicImpl implements TopicInterface {
    @Override
    public ArrayList<Topic> viewTopics() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM topics";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Topic> topics = new ArrayList<>();
        while(rs.next()) {
            Topic topic = new Topic();
            topic.setId(rs.getInt("id"));
            topic.setName(rs.getString("name"));
            topic.setCreatedAt(rs.getTimestamp("created_at"));
            topic.setUpdatedAt(rs.getTimestamp("updated_at"));
            topics.add(topic);
        }

        return topics;
    }

    @Override
    public boolean addTopic(Topic topic) {
        return false;
    }

    static void main() throws SQLException, ClassNotFoundException {
        TopicImpl topicsImpl = new TopicImpl();
        ArrayList<Topic> topics = topicsImpl.viewTopics();

        for (Topic topic:topics) {
            System.out.println(topic.getName());
        }
    }
}
