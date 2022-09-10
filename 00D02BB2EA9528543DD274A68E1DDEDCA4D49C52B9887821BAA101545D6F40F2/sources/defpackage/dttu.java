package defpackage;
/* compiled from: PG */
/* renamed from: dttu  reason: default package */
/* loaded from: classes6.dex */
public final class dttu extends dsqw<dttu, dttt> implements dssk {
    public static final dttu c;
    private static volatile dssr<dttu> d;
    public dtvg a;
    public dtvw b;

    static {
        dttu dttuVar = new dttu();
        c = dttuVar;
        dsqw.cc(dttu.class, dttuVar);
    }

    private dttu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dttu();
            }
            if (i2 == 4) {
                return new dttt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dttu.class) {
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
