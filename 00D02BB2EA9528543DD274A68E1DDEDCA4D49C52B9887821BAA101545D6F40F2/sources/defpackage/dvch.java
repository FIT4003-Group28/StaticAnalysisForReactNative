package defpackage;
/* compiled from: PG */
/* renamed from: dvch  reason: default package */
/* loaded from: classes6.dex */
public final class dvch extends dsqw<dvch, dvce> implements dssk {
    public static final dvch b;
    private static volatile dssr<dvch> c;
    public dsrj<dvbt> a = dssu.b;

    static {
        dvch dvchVar = new dvch();
        b = dvchVar;
        dsqw.cc(dvch.class, dvchVar);
    }

    private dvch() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", dvbt.class});
            }
            if (i2 == 3) {
                return new dvch();
            }
            if (i2 == 4) {
                return new dvce();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvch> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvch.class) {
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
