package defpackage;
/* compiled from: PG */
/* renamed from: dutq  reason: default package */
/* loaded from: classes6.dex */
public final class dutq extends dsqw<dutq, dutp> implements dssk {
    public static final dutq d;
    private static volatile dssr<dutq> e;
    public int a;
    public String b = "";
    public String c;

    static {
        dutq dutqVar = new dutq();
        d = dutqVar;
        dsqw.cc(dutq.class, dutqVar);
    }

    private dutq() {
        dspd dspdVar = dspd.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဈ\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dutq();
            }
            if (i2 == 4) {
                return new dutp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dutq.class) {
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
