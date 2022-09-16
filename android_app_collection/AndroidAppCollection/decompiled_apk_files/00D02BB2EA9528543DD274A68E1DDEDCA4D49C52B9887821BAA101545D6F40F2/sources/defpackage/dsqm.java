package defpackage;
/* compiled from: PG */
/* renamed from: dsqm  reason: default package */
/* loaded from: classes6.dex */
public final class dsqm extends dsqw<dsqm, dsql> implements dssk {
    public static final dsqm b;
    private static volatile dssr<dsqm> c;
    public float a;

    static {
        dsqm dsqmVar = new dsqm();
        b = dsqmVar;
        dsqw.cc(dsqm.class, dsqmVar);
    }

    private dsqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dsqm();
            }
            if (i2 == 4) {
                return new dsql();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsqm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsqm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
