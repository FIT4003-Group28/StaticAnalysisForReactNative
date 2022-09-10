package defpackage;
/* compiled from: PG */
/* renamed from: diqw  reason: default package */
/* loaded from: classes6.dex */
public final class diqw extends dsqw<diqw, diqv> implements dssk {
    public static final diqw c;
    private static volatile dssr<diqw> d;
    public int a;
    public dnwb b;

    static {
        diqw diqwVar = new diqw();
        c = diqwVar;
        dsqw.cc(diqw.class, diqwVar);
    }

    private diqw() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new diqw();
            }
            if (i2 == 4) {
                return new diqv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diqw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diqw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
