package defpackage;
/* compiled from: PG */
/* renamed from: chua  reason: default package */
/* loaded from: classes4.dex */
public final class chua extends dsqw<chua, chtz> implements dssk {
    public static final chua c;
    private static volatile dssr<chua> d;
    public int a;
    public dqkf b;

    static {
        chua chuaVar = new chua();
        c = chuaVar;
        dsqw.cc(chua.class, chuaVar);
    }

    private chua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chua();
            }
            if (i2 == 4) {
                return new chtz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chua> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chua.class) {
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
