package defpackage;
/* compiled from: PG */
/* renamed from: dttr  reason: default package */
/* loaded from: classes6.dex */
public final class dttr extends dsqw<dttr, dttq> implements dssk {
    public static final dttr b;
    private static volatile dssr<dttr> c;
    public dttp a;

    static {
        dttr dttrVar = new dttr();
        b = dttrVar;
        dsqw.cc(dttr.class, dttrVar);
    }

    private dttr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dttr();
            }
            if (i2 == 4) {
                return new dttq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dttr.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
