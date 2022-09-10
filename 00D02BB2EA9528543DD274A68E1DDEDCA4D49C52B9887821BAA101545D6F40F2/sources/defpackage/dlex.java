package defpackage;
/* compiled from: PG */
/* renamed from: dlex  reason: default package */
/* loaded from: classes6.dex */
public final class dlex extends dsqw<dlex, dleu> implements dssk {
    public static final dlex e;
    private static volatile dssr<dlex> f;
    public int a;
    public dhjz b;
    public int c;
    public int d;

    static {
        dlex dlexVar = new dlex();
        e = dlexVar;
        dsqw.cc(dlex.class, dlexVar);
    }

    private dlex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", dlev.a});
            }
            if (i2 == 3) {
                return new dlex();
            }
            if (i2 == 4) {
                return new dleu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlex> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlex.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
