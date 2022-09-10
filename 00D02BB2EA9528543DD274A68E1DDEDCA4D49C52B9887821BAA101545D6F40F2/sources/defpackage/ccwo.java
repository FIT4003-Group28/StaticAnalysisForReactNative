package defpackage;
/* compiled from: PG */
/* renamed from: ccwo  reason: default package */
/* loaded from: classes4.dex */
public final class ccwo extends dsqw<ccwo, ccwn> implements dssk {
    public static final ccwo c;
    private static volatile dssr<ccwo> d;
    public int a;
    public ccwk b;

    static {
        ccwo ccwoVar = new ccwo();
        c = ccwoVar;
        dsqw.cc(ccwo.class, ccwoVar);
    }

    private ccwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ccwo();
            }
            if (i2 == 4) {
                return new ccwn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ccwo.class) {
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
