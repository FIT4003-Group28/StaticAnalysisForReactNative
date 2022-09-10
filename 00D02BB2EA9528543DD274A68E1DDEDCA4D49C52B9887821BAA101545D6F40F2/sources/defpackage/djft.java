package defpackage;
/* compiled from: PG */
/* renamed from: djft  reason: default package */
/* loaded from: classes6.dex */
public final class djft extends dsqw<djft, djfq> implements dssk {
    public static final djft c;
    private static volatile dssr<djft> d;
    public int a = 0;
    public Object b;

    static {
        djft djftVar = new djft();
        c = djftVar;
        dsqw.cc(djft.class, djftVar);
    }

    private djft() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", djfs.class, djfp.class});
            }
            if (i2 == 3) {
                return new djft();
            }
            if (i2 == 4) {
                return new djfq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djft> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djft.class) {
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
