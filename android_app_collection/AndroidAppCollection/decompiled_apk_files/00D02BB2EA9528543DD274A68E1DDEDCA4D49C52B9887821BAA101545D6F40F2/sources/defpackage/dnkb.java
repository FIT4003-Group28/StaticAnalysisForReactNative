package defpackage;
/* compiled from: PG */
/* renamed from: dnkb  reason: default package */
/* loaded from: classes6.dex */
public enum dnkb implements dsrb {
    UNKNOWN(0),
    CUSTOM(1),
    HOME(2),
    WORK(3),
    OTHER(4);
    
    public final int f;

    dnkb(int i) {
        this.f = i;
    }

    public static dnkb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CUSTOM;
            }
            if (i == 2) {
                return HOME;
            }
            if (i == 3) {
                return WORK;
            }
            if (i == 4) {
                return OTHER;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dnka.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
