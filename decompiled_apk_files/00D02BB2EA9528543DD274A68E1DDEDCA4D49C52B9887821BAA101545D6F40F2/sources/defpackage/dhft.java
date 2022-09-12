package defpackage;
/* compiled from: PG */
/* renamed from: dhft  reason: default package */
/* loaded from: classes6.dex */
public final class dhft extends dsqw<dhft, dhfs> implements dssk {
    public static final dhft b;
    private static volatile dssr<dhft> c;
    public String a = "";

    static {
        dhft dhftVar = new dhft();
        b = dhftVar;
        dsqw.cc(dhft.class, dhftVar);
    }

    private dhft() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhft();
            }
            if (i2 == 4) {
                return new dhfs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhft> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhft.class) {
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
