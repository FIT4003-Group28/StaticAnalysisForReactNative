package defpackage;
/* compiled from: PG */
/* renamed from: dkbz  reason: default package */
/* loaded from: classes6.dex */
public final class dkbz extends dsqw<dkbz, dkbu> implements dssk {
    public static final dkbz c;
    private static volatile dssr<dkbz> d;
    public int a = 0;
    public Object b;

    static {
        dkbz dkbzVar = new dkbz();
        c = dkbzVar;
        dsqw.cc(dkbz.class, dkbzVar);
    }

    private dkbz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dkby.class, dkbw.class});
            }
            if (i2 == 3) {
                return new dkbz();
            }
            if (i2 == 4) {
                return new dkbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkbz.class) {
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
