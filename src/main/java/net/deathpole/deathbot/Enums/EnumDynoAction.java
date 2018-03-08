package net.deathpole.deathbot.Enums;

/**
 * Created by nicolas on 28/09/17.
 */
public enum EnumDynoAction {

    AFK,
    // AIDE,
    ARTEFACTS,
    AVATAR,
    BAN,
    CLEAN,
    DIAGNOSE,
    DYNO,
    ELF,
    FION,
    GEM,
    GOOGLE,
    GVG,
    HELP,
    HUMAN,
    IGNORED,
    INFO,
    KICK,
    KL,
    MEMBERCOUNT,
    MODLOGS,
    MUTE,
    NINJA,
    ORC,
    OW,
    PERVERS,
    PET,
    PETSHEET,
    PETUNIT,
    PURGE,
    PUSH,
    QUOTA,
    RANDOMCOLOR,
    RAID,
    RANKS,
    REZ,
    ROLEINFO,
    ROLES,
    ROLL,
    RPS,
    SERVERINVITE,
    SHEETS,
    SOFTBAN,
    SR,
    TOUR,
    TRANS,
    UNBAN,
    UNDEAD,
    UNDEAFEN,
    UNIT1,
    UNIT2,
    UNMUTE,
    UPTIME,
    WARN,
    WARNINGS,
    WHOIS;

    public static EnumDynoAction fromValue(String v) {
        return EnumDynoAction.valueOf(v.toUpperCase());
    }
}
