package defpackage;
/* compiled from: PG */
/* renamed from: deju  reason: default package */
/* loaded from: classes6.dex */
public final class deju extends dsqw<deju, dejt> implements dssk {
    public static final deju b;
    private static volatile dssr<deju> c;
    public dsri a = dsrx.b;

    static {
        deju dejuVar = new deju();
        b = dejuVar;
        dsqw.cc(deju.class, dejuVar);
    }

    private deju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new deju();
            }
            if (i2 == 4) {
                return new dejt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deju> dssrVar = c;
            if (dssrVar == null) {
                synchronized (deju.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
