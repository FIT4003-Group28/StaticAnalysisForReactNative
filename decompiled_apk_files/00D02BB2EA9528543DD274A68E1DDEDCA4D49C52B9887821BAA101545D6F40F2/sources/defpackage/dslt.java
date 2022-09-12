package defpackage;
/* compiled from: PG */
/* renamed from: dslt  reason: default package */
/* loaded from: classes6.dex */
public final class dslt extends dsqw<dslt, dslq> implements dssk {
    public static final dslt d;
    private static volatile dssr<dslt> e;
    public int a;
    public dsrj<dsls> b = dssu.b;
    public dsla c;

    static {
        dslt dsltVar = new dslt();
        d = dsltVar;
        dsqw.cc(dslt.class, dsltVar);
    }

    private dslt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dsls.class, "c"});
            }
            if (i2 == 3) {
                return new dslt();
            }
            if (i2 == 4) {
                return new dslq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dslt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dslt.class) {
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
