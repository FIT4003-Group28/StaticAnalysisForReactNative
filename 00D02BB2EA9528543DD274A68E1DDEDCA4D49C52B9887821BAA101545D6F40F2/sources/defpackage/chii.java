package defpackage;
/* compiled from: PG */
/* renamed from: chii  reason: default package */
/* loaded from: classes4.dex */
public final class chii extends dsqw<chii, chih> implements dssk {
    public static final chii c;
    private static volatile dssr<chii> d;
    public int a;
    public djhq b;

    static {
        chii chiiVar = new chii();
        c = chiiVar;
        dsqw.cc(chii.class, chiiVar);
    }

    private chii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chii();
            }
            if (i2 == 4) {
                return new chih();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chii> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chii.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
