package defpackage;
/* compiled from: PG */
/* renamed from: dlsw  reason: default package */
/* loaded from: classes.dex */
public final class dlsw extends dsqw<dlsw, dlsv> implements dssk {
    public static final dlsw d;
    private static volatile dssr<dlsw> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dlsw dlswVar = new dlsw();
        d = dlswVar;
        dsqw.cc(dlsw.class, dlswVar);
    }

    private dlsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlsw();
            }
            if (i2 == 4) {
                return new dlsv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlsw.class) {
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
