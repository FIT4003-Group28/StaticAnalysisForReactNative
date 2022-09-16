package defpackage;
/* compiled from: PG */
/* renamed from: dnjf  reason: default package */
/* loaded from: classes.dex */
public final class dnjf extends dsqw<dnjf, dnjc> implements dssk {
    public static final dnjf d;
    private static volatile dssr<dnjf> f;
    public int a;
    public dsrj<doex> b = dssu.b;
    public String c = "";
    private int e;

    static {
        dnjf dnjfVar = new dnjf();
        d = dnjfVar;
        dsqw.cc(dnjf.class, dnjfVar);
    }

    private dnjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\u001b\u0004ဈ\u0001\u0005ဌ\u0000", new Object[]{"e", "b", doex.class, "c", "a", dnjd.a});
            }
            if (i2 == 3) {
                return new dnjf();
            }
            if (i2 == 4) {
                return new dnjc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnjf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
