package net.deathpole.deathbot.Dao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Set;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Role;

/**
 * Created by nicolas on 24/10/17.
 */
public interface IAssignableRanksDao {

    Connection getConnectionToDB();

    HashMap<String, Set<String>> initAssignableRanksbyGuild(boolean single);

    void saveAssignableRanksForGuild(Guild guild, Set<Role> selfAssignableRanks, boolean single);

    void saveWelcomeMessage(Guild guild, String message);

    void saveActivationState(Guild guild, boolean activated);

    boolean getActivationState(Guild guild);

    String getWelcomeMessage(Guild guild);
}
