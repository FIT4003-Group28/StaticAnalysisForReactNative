package defpackage;
/* compiled from: PG */
/* renamed from: djkk  reason: default package */
/* loaded from: classes6.dex */
public final class djkk extends dsqw<djkk, djkj> implements dssk {
    public static final djkk a;
    private static volatile dssr<djkk> b;

    static {
        djkk djkkVar = new djkk();
        a = djkkVar;
        dsqw.cc(djkk.class, djkkVar);
    }

    private djkk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djkk();
            }
            if (i2 == 4) {
                return new djkj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djkk.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
