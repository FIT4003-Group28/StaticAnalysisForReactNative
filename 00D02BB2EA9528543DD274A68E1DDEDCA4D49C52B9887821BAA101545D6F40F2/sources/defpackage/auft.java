package defpackage;
/* compiled from: PG */
/* renamed from: auft  reason: default package */
/* loaded from: classes.dex */
public final class auft extends dsqw<auft, aufq> implements dssk {
    public static final auft c;
    private static volatile dssr<auft> d;
    public int a;
    public int b;

    static {
        auft auftVar = new auft();
        c = auftVar;
        dsqw.cc(auft.class, auftVar);
    }

    private auft() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aufs.c()});
            }
            if (i2 == 3) {
                return new auft();
            }
            if (i2 == 4) {
                return new aufq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<auft> dssrVar = d;
            if (dssrVar == null) {
                synchronized (auft.class) {
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
