package defpackage;
/* compiled from: PG */
/* renamed from: dhfo  reason: default package */
/* loaded from: classes6.dex */
public final class dhfo extends dsqw<dhfo, dhfm> implements dssk {
    public static final dhfo b;
    private static volatile dssr<dhfo> c;
    public int a;

    static {
        dhfo dhfoVar = new dhfo();
        b = dhfoVar;
        dsqw.cc(dhfo.class, dhfoVar);
    }

    private dhfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhfo();
            }
            if (i2 == 4) {
                return new dhfm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhfo.class) {
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
