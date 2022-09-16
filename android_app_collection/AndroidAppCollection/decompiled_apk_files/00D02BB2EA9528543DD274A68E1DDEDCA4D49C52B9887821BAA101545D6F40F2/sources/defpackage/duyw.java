package defpackage;
/* compiled from: PG */
/* renamed from: duyw  reason: default package */
/* loaded from: classes6.dex */
public final class duyw extends dsqw<duyw, duyv> implements dssk {
    public static final duyw c;
    private static volatile dssr<duyw> d;
    public int a;
    public int b;

    static {
        duyw duywVar = new duyw();
        c = duywVar;
        dsqw.cc(duyw.class, duywVar);
    }

    private duyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqki.a});
            }
            if (i2 == 3) {
                return new duyw();
            }
            if (i2 == 4) {
                return new duyv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duyw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
