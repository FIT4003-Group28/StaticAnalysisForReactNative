package defpackage;
/* compiled from: PG */
/* renamed from: dlas  reason: default package */
/* loaded from: classes6.dex */
public final class dlas extends dsqw<dlas, dlar> implements dssk {
    public static final dlas b;
    private static volatile dssr<dlas> d;
    public dkzo a;
    private int c;

    static {
        dlas dlasVar = new dlas();
        b = dlasVar;
        dsqw.cc(dlas.class, dlasVar);
    }

    private dlas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlas();
            }
            if (i2 == 4) {
                return new dlar();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlas> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlas.class) {
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
