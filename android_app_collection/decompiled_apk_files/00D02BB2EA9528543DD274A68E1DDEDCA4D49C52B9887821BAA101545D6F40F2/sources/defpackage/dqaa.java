package defpackage;
/* compiled from: PG */
/* renamed from: dqaa  reason: default package */
/* loaded from: classes6.dex */
public final class dqaa extends dsqw<dqaa, dpzx> implements dssk {
    public static final dqaa d;
    private static volatile dssr<dqaa> e;
    public int a;
    public dsrj<dpzz> b = dssu.b;
    public int c;

    static {
        dqaa dqaaVar = new dqaa();
        d = dqaaVar;
        dsqw.cc(dqaa.class, dqaaVar);
    }

    private dqaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"a", "b", dpzz.class, "c", dqfc.c()});
            }
            if (i2 == 3) {
                return new dqaa();
            }
            if (i2 == 4) {
                return new dpzx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqaa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqaa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
