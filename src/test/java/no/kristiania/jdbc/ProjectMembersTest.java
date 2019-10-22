package no.kristiania.jdbc;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectMembersTest {

    @Test
    void shouldFindProjectMember() {
        MemberDao dao = new MemberDao();
        String memberName = pickOne(new String[] {"Hussain", "Hans", "PK", "Rahil"});
        dao.insertMember(memberName);
        assertThat(dao.listAll()).contains(memberName);
    }

    private String pickOne(String[] strings) {
        return strings[new Random().nextInt(strings.length)];
    }

}
