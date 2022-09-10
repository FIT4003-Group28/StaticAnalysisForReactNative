package defpackage;
/* compiled from: PG */
/* renamed from: dvkk  reason: default package */
/* loaded from: classes.dex */
public final class dvkk extends dsqw<dvkk, dvkh> implements dssk {
    public static final dvkk b;
    private static volatile dssr<dvkk> d;
    public int a;
    private int c;

    static {
        dvkk dvkkVar = new dvkk();
        b = dvkkVar;
        dsqw.cc(dvkk.class, dvkkVar);
    }

    private dvkk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0002", new Object[]{"c", "a", dvki.a});
            }
            if (i2 == 3) {
                return new dvkk();
            }
            if (i2 == 4) {
                return new dvkh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvkk.class) {
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
