package defpackage;
/* compiled from: PG */
/* renamed from: djyi  reason: default package */
/* loaded from: classes6.dex */
public final class djyi extends dsqw<djyi, djyb> implements dssk {
    public static final djyi c;
    private static volatile dssr<djyi> d;
    public int a = 0;
    public Object b;

    static {
        djyi djyiVar = new djyi();
        c = djyiVar;
        dsqw.cc(djyi.class, djyiVar);
    }

    private djyi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ြ\u0000", new Object[]{"b", "a", djyh.class});
            }
            if (i2 == 3) {
                return new djyi();
            }
            if (i2 == 4) {
                return new djyb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djyi.class) {
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
