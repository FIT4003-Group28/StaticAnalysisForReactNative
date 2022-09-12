package defpackage;
/* compiled from: PG */
/* renamed from: ddwr  reason: default package */
/* loaded from: classes6.dex */
public final class ddwr extends dsqw<ddwr, ddwq> implements dssk {
    public static final ddwr f;
    private static volatile dssr<ddwr> g;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public dsrj<String> e;

    static {
        ddwr ddwrVar = new ddwr();
        f = ddwrVar;
        dsqw.cc(ddwr.class, ddwrVar);
    }

    private ddwr() {
        dsqz dsqzVar = dsqz.b;
        this.e = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0001\u0000\u0001စ\u0000\bဈ\u0007\u0010ဈ\u0001\u0011\u001a", new Object[]{"a", "b", "d", "c", "e"});
            }
            if (i2 == 3) {
                return new ddwr();
            }
            if (i2 == 4) {
                return new ddwq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddwr.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
