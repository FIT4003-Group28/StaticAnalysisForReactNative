package defpackage;
/* compiled from: PG */
/* renamed from: difv  reason: default package */
/* loaded from: classes6.dex */
public final class difv extends dsqw<difv, difu> implements dssk {
    public static final difv b;
    private static volatile dssr<difv> d;
    public long a;
    private int c;

    static {
        difv difvVar = new difv();
        b = difvVar;
        dsqw.cc(difv.class, difvVar);
    }

    private difv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002စ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new difv();
            }
            if (i2 == 4) {
                return new difu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<difv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (difv.class) {
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
