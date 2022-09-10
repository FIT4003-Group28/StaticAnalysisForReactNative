package defpackage;
/* compiled from: PG */
/* renamed from: dsxx  reason: default package */
/* loaded from: classes6.dex */
public final class dsxx extends dsqw<dsxx, dsxw> implements dssk {
    public static final dsxx a;
    private static volatile dssr<dsxx> f;
    private int b;
    private long d;
    private byte e = 2;
    private String c = "";

    static {
        dsxx dsxxVar = new dsxx();
        a = dsxxVar;
        dsqw.cc(dsxx.class, dsxxVar);
    }

    private dsxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔂ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsxx();
            }
            if (i2 == 4) {
                return new dsxw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dsxx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsxx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
