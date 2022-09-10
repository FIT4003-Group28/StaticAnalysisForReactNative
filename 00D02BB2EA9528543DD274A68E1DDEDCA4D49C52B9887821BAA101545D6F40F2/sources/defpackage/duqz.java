package defpackage;
/* compiled from: PG */
/* renamed from: duqz  reason: default package */
/* loaded from: classes6.dex */
public final class duqz extends dsqw<duqz, duqy> implements dssk {
    public static final duqz f;
    private static volatile dssr<duqz> h;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        duqz duqzVar = new duqz();
        f = duqzVar;
        dsqw.cc(duqz.class, duqzVar);
    }

    private duqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duqz();
            }
            if (i2 == 4) {
                return new duqy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duqz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
