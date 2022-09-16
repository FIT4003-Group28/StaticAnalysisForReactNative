package defpackage;
/* compiled from: PG */
/* renamed from: dieo  reason: default package */
/* loaded from: classes6.dex */
public final class dieo extends dsqw<dieo, diej> implements dssk {
    public static final dieo d;
    private static volatile dssr<dieo> e;
    public int a;
    public String b = "";
    public dsrj<dien> c = dssu.b;

    static {
        dieo dieoVar = new dieo();
        d = dieoVar;
        dsqw.cc(dieo.class, dieoVar);
    }

    private dieo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dien.class});
            }
            if (i2 == 3) {
                return new dieo();
            }
            if (i2 == 4) {
                return new diej();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dieo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dieo.class) {
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
