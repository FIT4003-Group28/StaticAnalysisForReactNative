package defpackage;
/* compiled from: PG */
/* renamed from: djby  reason: default package */
/* loaded from: classes6.dex */
public final class djby extends dsqw<djby, djbx> implements dssk {
    public static final djby c;
    private static volatile dssr<djby> e;
    public djbr a;
    public djbo b;
    private int d;

    static {
        djby djbyVar = new djby();
        c = djbyVar;
        dsqw.cc(djby.class, djbyVar);
    }

    private djby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djby();
            }
            if (i2 == 4) {
                return new djbx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djby> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djby.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
