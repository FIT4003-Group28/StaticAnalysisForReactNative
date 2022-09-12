package defpackage;
/* compiled from: PG */
/* renamed from: dhjh  reason: default package */
/* loaded from: classes6.dex */
public final class dhjh extends dsqw<dhjh, dhjg> implements dssk {
    public static final dhjh c;
    private static volatile dssr<dhjh> d;
    public int a;
    public dhjf b;

    static {
        dhjh dhjhVar = new dhjh();
        c = dhjhVar;
        dsqw.cc(dhjh.class, dhjhVar);
    }

    private dhjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhjh();
            }
            if (i2 == 4) {
                return new dhjg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhjh.class) {
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
