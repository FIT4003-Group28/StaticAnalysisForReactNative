package defpackage;
/* compiled from: PG */
/* renamed from: aucb  reason: default package */
/* loaded from: classes2.dex */
public enum aucb implements aopm {
    UNKNOWN(0),
    STANDARD(1),
    FULLSCREEN(2),
    MINI(3),
    BACKGROUND(4);
    
    private final int g;

    aucb(int i) {
        this.g = i;
    }

    public static aopo a() {
        return auca.a;
    }

    public static aucb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STANDARD;
            }
            if (i == 2) {
                return FULLSCREEN;
            }
            if (i == 3) {
                return MINI;
            }
            if (i == 4) {
                return BACKGROUND;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
