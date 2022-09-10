package defpackage;
/* compiled from: PG */
/* renamed from: dktd  reason: default package */
/* loaded from: classes.dex */
public final class dktd extends dsqw<dktd, dkta> implements dssk {
    public static final dktd c;
    private static volatile dssr<dktd> e;
    public int a = 1;
    public int b;
    private int d;

    static {
        dktd dktdVar = new dktd();
        c = dktdVar;
        dsqw.cc(dktd.class, dktdVar);
    }

    private dktd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004င\u0004", new Object[]{"d", "a", dktb.a, "b"});
            }
            if (i2 == 3) {
                return new dktd();
            }
            if (i2 == 4) {
                return new dkta();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dktd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dktd.class) {
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
