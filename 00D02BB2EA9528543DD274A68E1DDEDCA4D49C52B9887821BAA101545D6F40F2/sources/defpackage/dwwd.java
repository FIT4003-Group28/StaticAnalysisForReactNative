package defpackage;
/* compiled from: PG */
/* renamed from: dwwd  reason: default package */
/* loaded from: classes.dex */
public final class dwwd extends dsqw<dwwd, dwwc> implements dssk {
    public static final dwwd b;
    private static volatile dssr<dwwd> d;
    public String a = "https://support.google.com/accounts?p=block_list";
    private int c;

    static {
        dwwd dwwdVar = new dwwd();
        b = dwwdVar;
        dsqw.cc(dwwd.class, dwwdVar);
    }

    private dwwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwwd();
            }
            if (i2 == 4) {
                return new dwwc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwwd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
