package defpackage;
/* compiled from: PG */
/* renamed from: chxd  reason: default package */
/* loaded from: classes4.dex */
public final class chxd extends dsqw<chxd, chxc> implements dssk {
    public static final chxd d;
    private static volatile dssr<chxd> e;
    public int a;
    public String b = "";
    public float c;

    static {
        chxd chxdVar = new chxd();
        d = chxdVar;
        dsqw.cc(chxd.class, chxdVar);
    }

    private chxd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chxd();
            }
            if (i2 == 4) {
                return new chxc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chxd.class) {
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
