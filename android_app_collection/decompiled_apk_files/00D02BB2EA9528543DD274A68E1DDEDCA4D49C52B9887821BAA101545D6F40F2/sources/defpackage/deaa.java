package defpackage;
/* compiled from: PG */
/* renamed from: deaa  reason: default package */
/* loaded from: classes.dex */
public enum deaa implements dsrb {
    TOGGLE_UNDEFINED(0),
    TOGGLE_ON(1),
    TOGGLE_OFF(2);
    
    public final int d;

    deaa(int i) {
        this.d = i;
    }

    public static deaa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TOGGLE_ON;
            }
            if (i == 2) {
                return TOGGLE_OFF;
            }
            return null;
        }
        return TOGGLE_UNDEFINED;
    }

    public static dsrd c() {
        return ddzz.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
