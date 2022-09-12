package defpackage;
/* compiled from: PG */
/* renamed from: dsxj  reason: default package */
/* loaded from: classes6.dex */
public final class dsxj extends dsqw<dsxj, dsxi> implements dssk {
    public static final dsxj b;
    private static volatile dssr<dsxj> c;
    public dsrj<String> a = dssu.b;

    static {
        dsxj dsxjVar = new dsxj();
        b = dsxjVar;
        dsqw.cc(dsxj.class, dsxjVar);
    }

    private dsxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dsxj();
            }
            if (i2 == 4) {
                return new dsxi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsxj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsxj.class) {
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
