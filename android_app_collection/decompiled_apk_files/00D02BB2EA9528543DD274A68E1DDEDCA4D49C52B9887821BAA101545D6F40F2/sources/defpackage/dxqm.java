package defpackage;
/* compiled from: PG */
/* renamed from: dxqm  reason: default package */
/* loaded from: classes6.dex */
public final class dxqm extends dsqw<dxqm, dxql> implements dssk {
    public static final dxqm d;
    private static volatile dssr<dxqm> e;
    public dxpv a;
    public int b;
    public int c;

    static {
        dxqm dxqmVar = new dxqm();
        d = dxqmVar;
        dsqw.cc(dxqm.class, dxqmVar);
    }

    private dxqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxqm();
            }
            if (i2 == 4) {
                return new dxql();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxqm.class) {
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
