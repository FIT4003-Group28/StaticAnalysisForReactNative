package defpackage;
/* compiled from: PG */
/* renamed from: dwgc  reason: default package */
/* loaded from: classes6.dex */
public final class dwgc extends dsqw<dwgc, dwgb> implements dssk {
    public static final dwgc c;
    private static volatile dssr<dwgc> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dwgc dwgcVar = new dwgc();
        c = dwgcVar;
        dsqw.cc(dwgc.class, dwgcVar);
    }

    private dwgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwgc();
            }
            if (i2 == 4) {
                return new dwgb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwgc.class) {
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
