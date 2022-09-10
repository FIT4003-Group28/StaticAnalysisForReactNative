package defpackage;
/* compiled from: PG */
/* renamed from: dljd  reason: default package */
/* loaded from: classes6.dex */
public final class dljd extends dsqw<dljd, dlja> implements dssk {
    public static final dljd d;
    private static volatile dssr<dljd> e;
    public int a;
    public dnsc b;
    public dljc c;

    static {
        dljd dljdVar = new dljd();
        d = dljdVar;
        dsqw.cc(dljd.class, dljdVar);
    }

    private dljd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dljd();
            }
            if (i2 == 4) {
                return new dlja();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dljd.class) {
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
