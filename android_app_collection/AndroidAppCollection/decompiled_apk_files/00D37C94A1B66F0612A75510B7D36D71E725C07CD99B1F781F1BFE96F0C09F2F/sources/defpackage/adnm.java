package defpackage;
/* compiled from: PG */
/* renamed from: adnm  reason: default package */
/* loaded from: classes.dex */
public enum adnm {
    UNSTARTED(-1),
    ENDED(0),
    PLAYING(1),
    PAUSED(2),
    BUFFERING(3),
    VIDEO_CUED(5),
    AD_UNSTARTED(1080),
    AD_PLAYING(1081),
    AD_SKIPPED(1082),
    AD_ENDED(1083),
    AD_PAUSED(1084),
    AD_BUFFERING(1085),
    ERROR(-1000);
    
    public static final String n = zep.a("MDX.remote");
    public final int o;

    adnm(int i) {
        this.o = i;
    }

    public final boolean a() {
        return this == PLAYING || this == AD_PLAYING;
    }

    public final boolean b() {
        return this == AD_UNSTARTED || this == AD_PLAYING || this == AD_PAUSED || this == AD_BUFFERING || this == AD_SKIPPED || this == AD_ENDED;
    }
}
