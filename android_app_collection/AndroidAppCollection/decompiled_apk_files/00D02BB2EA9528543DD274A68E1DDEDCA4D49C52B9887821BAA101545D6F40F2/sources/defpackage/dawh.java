package defpackage;
/* compiled from: PG */
/* renamed from: dawh  reason: default package */
/* loaded from: classes5.dex */
public final class dawh extends dsqw<dawh, dawg> implements dssk {
    public static final dawh c;
    private static volatile dssr<dawh> d;
    public int a;
    public dawc b;

    static {
        dawh dawhVar = new dawh();
        c = dawhVar;
        dsqw.cc(dawh.class, dawhVar);
    }

    private dawh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dawh();
            }
            if (i2 == 4) {
                return new dawg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dawh.class) {
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
