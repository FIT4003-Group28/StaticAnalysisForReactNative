package defpackage;
/* compiled from: PG */
/* renamed from: dvqg  reason: default package */
/* loaded from: classes6.dex */
public final class dvqg extends dsqw<dvqg, dvqf> implements dssk {
    public static final dvqg d;
    private static volatile dssr<dvqg> e;
    public int a;
    public int b;
    public int c;

    static {
        dvqg dvqgVar = new dvqg();
        d = dvqgVar;
        dsqw.cc(dvqg.class, dvqgVar);
    }

    private dvqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dvqi.a});
            }
            if (i2 == 3) {
                return new dvqg();
            }
            if (i2 == 4) {
                return new dvqf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvqg.class) {
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
