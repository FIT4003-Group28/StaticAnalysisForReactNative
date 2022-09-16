package defpackage;
/* compiled from: PG */
/* renamed from: digv  reason: default package */
/* loaded from: classes6.dex */
public final class digv extends dsqw<digv, digu> implements dssk {
    public static final digv b;
    private static volatile dssr<digv> c;
    public dsrj<djws> a = dssu.b;

    static {
        digv digvVar = new digv();
        b = digvVar;
        dsqw.cc(digv.class, digvVar);
    }

    private digv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", djws.class});
            }
            if (i2 == 3) {
                return new digv();
            }
            if (i2 == 4) {
                return new digu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (digv.class) {
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
