package defpackage;
/* compiled from: PG */
/* renamed from: dvon  reason: default package */
/* loaded from: classes.dex */
public final class dvon extends dsqw<dvon, dvok> implements dssk {
    public static final dvon d;
    private static volatile dssr<dvon> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dvon dvonVar = new dvon();
        d = dvonVar;
        dsqw.cc(dvon.class, dvonVar);
    }

    private dvon() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dvom.a(), "c"});
            }
            if (i2 == 3) {
                return new dvon();
            }
            if (i2 == 4) {
                return new dvok();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvon> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvon.class) {
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
