package defpackage;
/* compiled from: PG */
/* renamed from: dikd  reason: default package */
/* loaded from: classes.dex */
public enum dikd implements dsrb {
    NO_IMAGE_MOD(0),
    ATTRIB_LINK(3),
    NO_SYNDICATION(5),
    UGC(7),
    NO_LOCAL_HOSTING(8),
    CRAWLED(9),
    LIMITED_SYNDICATION(11);
    
    private final int h;

    dikd(int i2) {
        this.h = i2;
    }

    public static dikd b(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                return ATTRIB_LINK;
            }
            if (i2 == 5) {
                return NO_SYNDICATION;
            }
            if (i2 == 11) {
                return LIMITED_SYNDICATION;
            }
            if (i2 == 7) {
                return UGC;
            }
            if (i2 == 8) {
                return NO_LOCAL_HOSTING;
            }
            if (i2 == 9) {
                return CRAWLED;
            }
            return null;
        }
        return NO_IMAGE_MOD;
    }

    public static dsrd c() {
        return dikc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
