package defpackage;
/* compiled from: PG */
/* renamed from: dkxh  reason: default package */
/* loaded from: classes.dex */
public final class dkxh extends dsqw<dkxh, dkxg> implements dssk {
    public static final dkxh d;
    private static volatile dssr<dkxh> f;
    public int a = 60000;
    public int b = 60000;
    public int c = 4;
    private int e;

    static {
        dkxh dkxhVar = new dkxh();
        d = dkxhVar;
        dsqw.cc(dkxh.class, dkxhVar);
    }

    private dkxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkxh();
            }
            if (i2 == 4) {
                return new dkxg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkxh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkxh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
