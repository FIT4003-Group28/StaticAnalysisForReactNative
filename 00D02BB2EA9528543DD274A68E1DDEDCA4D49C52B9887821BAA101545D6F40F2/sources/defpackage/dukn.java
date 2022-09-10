package defpackage;
/* compiled from: PG */
/* renamed from: dukn  reason: default package */
/* loaded from: classes6.dex */
public final class dukn extends dsqw<dukn, dukm> implements dssk {
    public static final dukn e;
    private static volatile dssr<dukn> f;
    public int a;
    public int b;
    public dwvb c;
    public dqwa d;

    static {
        dukn duknVar = new dukn();
        e = duknVar;
        dsqw.cc(dukn.class, duknVar);
    }

    private dukn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", dwzg.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dukn();
            }
            if (i2 == 4) {
                return new dukm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dukn.class) {
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
