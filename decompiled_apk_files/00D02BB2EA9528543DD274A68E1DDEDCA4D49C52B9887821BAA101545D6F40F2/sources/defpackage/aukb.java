package defpackage;
/* compiled from: PG */
/* renamed from: aukb  reason: default package */
/* loaded from: classes2.dex */
public enum aukb implements dsrb {
    UNKNOWN(0),
    CLICKED(1),
    DISMISSED(2),
    CONVERTED(3),
    SHOWN(4);
    
    public final int f;

    aukb(int i) {
        this.f = i;
    }

    public static aukb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CLICKED;
            }
            if (i == 2) {
                return DISMISSED;
            }
            if (i == 3) {
                return CONVERTED;
            }
            if (i == 4) {
                return SHOWN;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return auka.a;
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
