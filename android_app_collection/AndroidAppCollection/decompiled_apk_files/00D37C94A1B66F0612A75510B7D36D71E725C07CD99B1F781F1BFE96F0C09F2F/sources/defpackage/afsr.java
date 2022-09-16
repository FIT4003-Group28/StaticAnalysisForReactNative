package defpackage;
/* compiled from: PG */
/* renamed from: afsr  reason: default package */
/* loaded from: classes.dex */
public enum afsr {
    DESKTOP("desktop"),
    MOBILE("mobile"),
    TV("tv"),
    TABLET("tablet"),
    BLURAY("bluray"),
    STB("stb"),
    GAME_CONSOLE("game_console"),
    UNKNOWN("unknown_platform");
    
    public final String i;

    afsr(String str) {
        this.i = str;
    }
}
