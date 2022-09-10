package defpackage;
/* compiled from: PG */
/* renamed from: dsfe  reason: default package */
/* loaded from: classes6.dex */
public final class dsfe extends dsqw<dsfe, dsfd> implements dssk {
    public static final dsfe f;
    private static volatile dssr<dsfe> h;
    public float a;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    private int g;

    static {
        dsfe dsfeVar = new dsfe();
        f = dsfeVar;
        dsqw.cc(dsfe.class, dsfeVar);
    }

    private dsfe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dsfe();
            }
            if (i2 == 4) {
                return new dsfd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsfe.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
