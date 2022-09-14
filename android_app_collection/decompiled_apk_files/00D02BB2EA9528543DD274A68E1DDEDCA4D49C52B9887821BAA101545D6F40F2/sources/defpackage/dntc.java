package defpackage;
/* compiled from: PG */
/* renamed from: dntc  reason: default package */
/* loaded from: classes6.dex */
public final class dntc extends dsqw<dntc, dntb> implements dssk {
    public static final dntc c;
    private static volatile dssr<dntc> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dntc dntcVar = new dntc();
        c = dntcVar;
        dsqw.cc(dntc.class, dntcVar);
    }

    private dntc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dntc();
            }
            if (i2 == 4) {
                return new dntb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dntc.class) {
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
