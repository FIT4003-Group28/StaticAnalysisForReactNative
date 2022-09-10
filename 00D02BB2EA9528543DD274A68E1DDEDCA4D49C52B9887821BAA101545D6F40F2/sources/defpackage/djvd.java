package defpackage;
/* compiled from: PG */
/* renamed from: djvd  reason: default package */
/* loaded from: classes6.dex */
public final class djvd extends dsqw<djvd, djva> implements dssk {
    public static final djvd d;
    private static volatile dssr<djvd> e;
    public int a;
    public int b;
    public String c = "";

    static {
        djvd djvdVar = new djvd();
        d = djvdVar;
        dsqw.cc(djvd.class, djvdVar);
    }

    private djvd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", djvc.c(), "c"});
            }
            if (i2 == 3) {
                return new djvd();
            }
            if (i2 == 4) {
                return new djva();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djvd.class) {
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
