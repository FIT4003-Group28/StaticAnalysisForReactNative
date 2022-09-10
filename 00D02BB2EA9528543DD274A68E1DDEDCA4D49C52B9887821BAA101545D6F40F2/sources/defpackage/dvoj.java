package defpackage;
/* compiled from: PG */
/* renamed from: dvoj  reason: default package */
/* loaded from: classes6.dex */
public final class dvoj extends dsqw<dvoj, dvoi> implements dssk {
    public static final dvoj d;
    private static volatile dssr<dvoj> e;
    public int a;
    public dsrj<dspd> b = dssu.b;
    public String c = "";

    static {
        dvoj dvojVar = new dvoj();
        d = dvojVar;
        dsqw.cc(dvoj.class, dvojVar);
    }

    private dvoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvoj();
            }
            if (i2 == 4) {
                return new dvoi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvoj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvoj.class) {
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
