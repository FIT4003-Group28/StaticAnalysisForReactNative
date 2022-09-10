package defpackage;
/* compiled from: PG */
/* renamed from: dayc  reason: default package */
/* loaded from: classes5.dex */
public final class dayc extends dsqw<dayc, dayb> implements dssk {
    public static final dayc e;
    private static volatile dssr<dayc> g;
    private byte f = 2;
    public dsrj<daya> a = dssu.b;
    public dsrj<dayi> b = dssu.b;
    public dsrj<dayl> c = dssu.b;
    public dsrj<daxy> d = dssu.b;

    static {
        dayc daycVar = new dayc();
        e = daycVar;
        dsqw.cc(dayc.class, daycVar);
    }

    private dayc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[]{"a", daya.class, "b", dayi.class, "c", dayl.class, "d", daxy.class});
            }
            if (i2 == 3) {
                return new dayc();
            }
            if (i2 == 4) {
                return new dayb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dayc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dayc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
