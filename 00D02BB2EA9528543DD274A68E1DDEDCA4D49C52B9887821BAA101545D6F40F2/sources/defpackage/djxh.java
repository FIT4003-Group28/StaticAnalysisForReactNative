package defpackage;
/* compiled from: PG */
/* renamed from: djxh  reason: default package */
/* loaded from: classes6.dex */
public final class djxh extends dsqw<djxh, djxe> implements dssk {
    public static final djxh b;
    private static volatile dssr<djxh> d;
    public int a;
    private int c;

    static {
        djxh djxhVar = new djxh();
        b = djxhVar;
        dsqw.cc(djxh.class, djxhVar);
    }

    private djxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", djxf.a});
            }
            if (i2 == 3) {
                return new djxh();
            }
            if (i2 == 4) {
                return new djxe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djxh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djxh.class) {
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
