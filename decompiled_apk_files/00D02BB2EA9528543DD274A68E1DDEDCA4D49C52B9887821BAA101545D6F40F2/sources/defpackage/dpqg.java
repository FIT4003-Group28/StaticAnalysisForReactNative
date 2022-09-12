package defpackage;
/* compiled from: PG */
/* renamed from: dpqg  reason: default package */
/* loaded from: classes6.dex */
public enum dpqg implements dsrb {
    TYPE_UNKNOWN(0),
    TYPE_NOT_INTERESTED(1),
    TYPE_PARTIALLY_INTERESTED(3),
    TYPE_INTERESTED(2);
    
    public final int e;

    dpqg(int i) {
        this.e = i;
    }

    public static dpqg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TYPE_NOT_INTERESTED;
            }
            if (i == 2) {
                return TYPE_INTERESTED;
            }
            if (i == 3) {
                return TYPE_PARTIALLY_INTERESTED;
            }
            return null;
        }
        return TYPE_UNKNOWN;
    }

    public static dsrd c() {
        return dpqf.a;
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
