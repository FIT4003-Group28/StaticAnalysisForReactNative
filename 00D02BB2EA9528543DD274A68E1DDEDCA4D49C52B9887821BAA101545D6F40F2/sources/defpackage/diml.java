package defpackage;
/* compiled from: PG */
/* renamed from: diml  reason: default package */
/* loaded from: classes6.dex */
public final class diml extends dsqw<diml, dimk> implements dssk {
    public static final diml d;
    private static volatile dssr<diml> e;
    public int a;
    public dspd b = dspd.b;
    public dspd c = dspd.b;

    static {
        diml dimlVar = new diml();
        d = dimlVar;
        dsqw.cc(diml.class, dimlVar);
    }

    private diml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diml();
            }
            if (i2 == 4) {
                return new dimk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diml> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diml.class) {
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
