package defpackage;
/* compiled from: PG */
/* renamed from: cyis  reason: default package */
/* loaded from: classes5.dex */
public final class cyis extends dsqw<cyis, cyir> implements dssk {
    public static final cyis c;
    private static volatile dssr<cyis> d;
    public boolean a;
    public String b = "";

    static {
        cyis cyisVar = new cyis();
        c = cyisVar;
        dsqw.cc(cyis.class, cyisVar);
    }

    private cyis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyis();
            }
            if (i2 == 4) {
                return new cyir();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyis> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyis.class) {
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
