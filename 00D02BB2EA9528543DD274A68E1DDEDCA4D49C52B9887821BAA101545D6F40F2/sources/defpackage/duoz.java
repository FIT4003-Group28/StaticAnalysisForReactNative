package defpackage;
/* compiled from: PG */
/* renamed from: duoz  reason: default package */
/* loaded from: classes6.dex */
public final class duoz extends dsqw<duoz, duoy> implements dssk {
    public static final duoz c;
    private static volatile dssr<duoz> d;
    public int a;
    public String b = "";

    static {
        duoz duozVar = new duoz();
        c = duozVar;
        dsqw.cc(duoz.class, duozVar);
    }

    private duoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duoz();
            }
            if (i2 == 4) {
                return new duoy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duoz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duoz.class) {
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
