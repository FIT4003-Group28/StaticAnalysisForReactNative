package defpackage;
/* compiled from: PG */
/* renamed from: dwvd  reason: default package */
/* loaded from: classes6.dex */
public final class dwvd extends dsqw<dwvd, dwvc> implements dssk {
    public static final dwvd l;
    private static volatile dssr<dwvd> m;
    public int a;
    public dspd b = dspd.b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        dwvd dwvdVar = new dwvd();
        l = dwvdVar;
        dsqw.cc(dwvd.class, dwvdVar);
    }

    private dwvd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\u0000\u0001ည\u0000\u0004ဇ\u0003\u0006ဇ\u0005\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0012ဇ\u0011\u0013ဇ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dwvd();
            }
            if (i2 == 4) {
                return new dwvc();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvd> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dwvd.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
