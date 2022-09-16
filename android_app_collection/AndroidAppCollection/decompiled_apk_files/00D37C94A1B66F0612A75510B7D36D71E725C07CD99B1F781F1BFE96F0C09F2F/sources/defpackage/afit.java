package defpackage;
/* compiled from: PG */
/* renamed from: afit  reason: default package */
/* loaded from: classes.dex */
enum afit {
    BUFFERING("B"),
    ERROR("ER"),
    ENDED("EN"),
    NOT_STARTED("N"),
    PAUSED("PA"),
    PLAYING("PL"),
    SEEKING("S"),
    NOT_VALID("X"),
    PAUSED_BUFFERING("PB"),
    SUSPENDED("SU");
    
    private final String l;

    afit(String str) {
        this.l = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.l;
    }
}
