package defpackage;
/* compiled from: PG */
/* renamed from: dngm  reason: default package */
/* loaded from: classes6.dex */
public final class dngm extends dsqw<dngm, dngl> implements dssk {
    public static final dngm d;
    private static volatile dssr<dngm> e;
    public int a;
    public dnoh b;
    public dhjx c;

    static {
        dngm dngmVar = new dngm();
        d = dngmVar;
        dsqw.cc(dngm.class, dngmVar);
    }

    private dngm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dngm();
            }
            if (i2 == 4) {
                return new dngl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dngm.class) {
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
