package defpackage;
/* compiled from: PG */
/* renamed from: dins  reason: default package */
/* loaded from: classes6.dex */
public final class dins extends dsqw<dins, dinr> implements dssk {
    public static final dins d;
    private static volatile dssr<dins> e;
    public int a;
    public dsrj<dmbw> b = dssu.b;
    public String c = "";

    static {
        dins dinsVar = new dins();
        d = dinsVar;
        dsqw.cc(dins.class, dinsVar);
    }

    private dins() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", dmbw.class, "c"});
            }
            if (i2 == 3) {
                return new dins();
            }
            if (i2 == 4) {
                return new dinr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dins> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dins.class) {
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
