package defpackage;
/* compiled from: PG */
/* renamed from: dstv  reason: default package */
/* loaded from: classes6.dex */
public final class dstv extends dsqw<dstv, dstu> implements dssk {
    public static final dstv c;
    private static volatile dssr<dstv> d;
    public long a;
    public int b;

    static {
        dstv dstvVar = new dstv();
        c = dstvVar;
        dsqw.cc(dstv.class, dstvVar);
    }

    private dstv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dstv();
            }
            if (i2 == 4) {
                return new dstu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dstv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dstv.class) {
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
