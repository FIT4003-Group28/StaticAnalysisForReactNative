package defpackage;
/* compiled from: PG */
/* renamed from: dtud  reason: default package */
/* loaded from: classes6.dex */
public final class dtud extends dsqw<dtud, dtuc> implements dssk {
    public static final dtud c;
    private static volatile dssr<dtud> d;
    public boolean a;
    public String b = "";

    static {
        dtud dtudVar = new dtud();
        c = dtudVar;
        dsqw.cc(dtud.class, dtudVar);
    }

    private dtud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtud();
            }
            if (i2 == 4) {
                return new dtuc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtud> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtud.class) {
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
