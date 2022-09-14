package defpackage;
/* compiled from: PG */
/* renamed from: dwkd  reason: default package */
/* loaded from: classes.dex */
public final class dwkd extends dsqw<dwkd, dwkc> implements dssk {
    public static final dwkd c;
    private static volatile dssr<dwkd> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dwkd dwkdVar = new dwkd();
        c = dwkdVar;
        dsqw.cc(dwkd.class, dwkdVar);
    }

    private dwkd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwkd();
            }
            if (i2 == 4) {
                return new dwkc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwkd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
