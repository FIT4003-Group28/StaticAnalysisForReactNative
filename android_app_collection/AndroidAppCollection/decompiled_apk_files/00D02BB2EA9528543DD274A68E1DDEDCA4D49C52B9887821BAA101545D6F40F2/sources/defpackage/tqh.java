package defpackage;
/* compiled from: PG */
/* renamed from: tqh  reason: default package */
/* loaded from: classes7.dex */
public final class tqh extends dsqw<tqh, tqg> implements dssk {
    public static final tqh c;
    private static volatile dssr<tqh> d;
    public int a;
    public boolean b = true;

    static {
        tqh tqhVar = new tqh();
        c = tqhVar;
        dsqw.cc(tqh.class, tqhVar);
    }

    private tqh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new tqh();
            }
            if (i2 == 4) {
                return new tqg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tqh.class) {
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
