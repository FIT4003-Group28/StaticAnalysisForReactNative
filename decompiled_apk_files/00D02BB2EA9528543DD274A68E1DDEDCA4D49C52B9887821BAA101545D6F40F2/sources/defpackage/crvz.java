package defpackage;
/* compiled from: PG */
/* renamed from: crvz  reason: default package */
/* loaded from: classes5.dex */
public enum crvz implements dsrb {
    STAGING(0),
    TEST(1),
    PROD(2);
    
    public final int d;

    crvz(int i) {
        this.d = i;
    }

    public static crvz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TEST;
            }
            if (i == 2) {
                return PROD;
            }
            return null;
        }
        return STAGING;
    }

    public static dsrd c() {
        return crvy.a;
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
