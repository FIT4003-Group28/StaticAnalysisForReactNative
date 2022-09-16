package defpackage;
/* compiled from: PG */
/* renamed from: dhjd  reason: default package */
/* loaded from: classes6.dex */
public final class dhjd extends dsqw<dhjd, dhjc> implements dssk {
    public static final dhjd d;
    private static volatile dssr<dhjd> e;
    public int a;
    public dtai b;
    public int c;

    static {
        dhjd dhjdVar = new dhjd();
        d = dhjdVar;
        dsqw.cc(dhjd.class, dhjdVar);
    }

    private dhjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhjd();
            }
            if (i2 == 4) {
                return new dhjc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhjd.class) {
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
