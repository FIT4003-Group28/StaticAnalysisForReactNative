package defpackage;
/* compiled from: PG */
/* renamed from: acke  reason: default package */
/* loaded from: classes2.dex */
public final class acke extends dsqw<acke, ackd> implements dssk {
    public static final acke c;
    private static volatile dssr<acke> d;
    public int a;
    public String b = "";

    static {
        acke ackeVar = new acke();
        c = ackeVar;
        dsqw.cc(acke.class, ackeVar);
    }

    private acke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new acke();
            }
            if (i2 == 4) {
                return new ackd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<acke> dssrVar = d;
            if (dssrVar == null) {
                synchronized (acke.class) {
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
