package defpackage;
/* compiled from: PG */
/* renamed from: chwh  reason: default package */
/* loaded from: classes4.dex */
public final class chwh extends dsqw<chwh, chwg> implements dssk {
    public static final chwh c;
    private static volatile dssr<chwh> d;
    public int a;
    public chvk b;

    static {
        chwh chwhVar = new chwh();
        c = chwhVar;
        dsqw.cc(chwh.class, chwhVar);
    }

    private chwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwh();
            }
            if (i2 == 4) {
                return new chwg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chwh.class) {
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
