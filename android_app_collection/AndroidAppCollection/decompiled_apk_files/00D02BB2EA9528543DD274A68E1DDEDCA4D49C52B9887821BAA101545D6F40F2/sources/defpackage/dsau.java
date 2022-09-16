package defpackage;
/* compiled from: PG */
/* renamed from: dsau  reason: default package */
/* loaded from: classes6.dex */
public final class dsau extends dsqw<dsau, dsaj> implements dssk {
    public static final dsau g;
    private static volatile dssr<dsau> h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsat e;
    public dsok f;

    static {
        dsau dsauVar = new dsau();
        g = dsauVar;
        dsqw.cc(dsau.class, dsauVar);
    }

    private dsau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0004\u0000\u0001\u0001\u001e\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0003\u0004ဈ\u0002\u001eဉ\u0004", new Object[]{"a", "b", "e", "d", "f"});
            }
            if (i2 == 3) {
                return new dsau();
            }
            if (i2 == 4) {
                return new dsaj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsau> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsau.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
