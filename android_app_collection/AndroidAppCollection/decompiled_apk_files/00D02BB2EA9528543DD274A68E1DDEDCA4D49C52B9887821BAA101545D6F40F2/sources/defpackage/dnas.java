package defpackage;
/* compiled from: PG */
/* renamed from: dnas  reason: default package */
/* loaded from: classes.dex */
public final class dnas extends dsqw<dnas, dnao> implements dssk {
    public static final dnas d;
    private static volatile dssr<dnas> e;
    public int a;
    public int b;
    public dnar c;

    static {
        dnas dnasVar = new dnas();
        d = dnasVar;
        dsqw.cc(dnas.class, dnasVar);
    }

    private dnas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dnap.a, "c"});
            }
            if (i2 == 3) {
                return new dnas();
            }
            if (i2 == 4) {
                return new dnao();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnas> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnas.class) {
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
