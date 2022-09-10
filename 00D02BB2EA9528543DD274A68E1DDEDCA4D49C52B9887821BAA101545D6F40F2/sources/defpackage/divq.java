package defpackage;
/* compiled from: PG */
/* renamed from: divq  reason: default package */
/* loaded from: classes6.dex */
public final class divq extends dsqw<divq, divp> implements dssk {
    public static final divq b;
    private static volatile dssr<divq> d;
    public String a = "";
    private int c;

    static {
        divq divqVar = new divq();
        b = divqVar;
        dsqw.cc(divq.class, divqVar);
    }

    private divq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new divq();
            }
            if (i2 == 4) {
                return new divp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (divq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
