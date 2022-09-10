package defpackage;
/* compiled from: PG */
/* renamed from: drsf  reason: default package */
/* loaded from: classes6.dex */
public final class drsf extends dsqw<drsf, drse> implements dssk {
    public static final drsf d;
    private static volatile dssr<drsf> e;
    public int a;
    public String b = "";
    public dspd c = dspd.b;

    static {
        drsf drsfVar = new drsf();
        d = drsfVar;
        dsqw.cc(drsf.class, drsfVar);
    }

    private drsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drsf();
            }
            if (i2 == 4) {
                return new drse();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drsf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drsf.class) {
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
