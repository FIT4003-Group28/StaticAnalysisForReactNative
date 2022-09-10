package defpackage;
/* compiled from: PG */
/* renamed from: dorq  reason: default package */
/* loaded from: classes6.dex */
public final class dorq extends dsqw<dorq, dorp> implements dssk {
    public static final dorq d;
    private static volatile dssr<dorq> e;
    public int a;
    public String b = "";
    public dspd c = dspd.b;

    static {
        dorq dorqVar = new dorq();
        d = dorqVar;
        dsqw.cc(dorq.class, dorqVar);
    }

    private dorq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dorq();
            }
            if (i2 == 4) {
                return new dorp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dorq.class) {
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
