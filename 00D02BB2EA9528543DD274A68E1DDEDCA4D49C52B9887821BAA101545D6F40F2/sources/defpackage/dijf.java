package defpackage;
/* compiled from: PG */
/* renamed from: dijf  reason: default package */
/* loaded from: classes6.dex */
public final class dijf extends dsqw<dijf, dijc> implements dssk {
    public static final dijf d;
    private static volatile dssr<dijf> e;
    public int a;
    public String b = "";
    public dije c;

    static {
        dijf dijfVar = new dijf();
        d = dijfVar;
        dsqw.cc(dijf.class, dijfVar);
    }

    private dijf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dijf();
            }
            if (i2 == 4) {
                return new dijc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dijf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dijf.class) {
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
