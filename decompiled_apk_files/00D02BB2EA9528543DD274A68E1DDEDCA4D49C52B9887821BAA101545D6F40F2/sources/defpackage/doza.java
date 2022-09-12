package defpackage;
/* compiled from: PG */
/* renamed from: doza  reason: default package */
/* loaded from: classes6.dex */
public enum doza implements dsrb {
    ALERT(0),
    WARNING(1),
    INFORMATION(2),
    CRITICAL(3);
    
    public final int e;

    doza(int i) {
        this.e = i;
    }

    public static doza b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WARNING;
            }
            if (i == 2) {
                return INFORMATION;
            }
            if (i == 3) {
                return CRITICAL;
            }
            return null;
        }
        return ALERT;
    }

    public static dsrd c() {
        return doyz.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
