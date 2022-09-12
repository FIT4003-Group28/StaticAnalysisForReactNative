package defpackage;
/* compiled from: PG */
/* renamed from: csjh  reason: default package */
/* loaded from: classes5.dex */
public final class csjh extends dsqw<csjh, csjg> implements dssk {
    public static final csjh b;
    private static volatile dssr<csjh> d;
    public int a;
    private int c;

    static {
        csjh csjhVar = new csjh();
        b = csjhVar;
        dsqw.cc(csjh.class, csjhVar);
    }

    private csjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new csjh();
            }
            if (i2 == 4) {
                return new csjg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csjh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csjh.class) {
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
