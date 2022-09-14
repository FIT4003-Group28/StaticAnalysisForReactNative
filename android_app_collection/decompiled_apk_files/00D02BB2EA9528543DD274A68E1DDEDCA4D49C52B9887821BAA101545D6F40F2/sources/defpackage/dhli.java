package defpackage;
/* compiled from: PG */
/* renamed from: dhli  reason: default package */
/* loaded from: classes6.dex */
public final class dhli extends dsqw<dhli, dhlh> implements dssk {
    public static final dhli a;
    private static volatile dssr<dhli> b;

    static {
        dhli dhliVar = new dhli();
        a = dhliVar;
        dsqw.cc(dhli.class, dhliVar);
    }

    private dhli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhli();
            }
            if (i2 == 4) {
                return new dhlh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhli> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhli.class) {
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
