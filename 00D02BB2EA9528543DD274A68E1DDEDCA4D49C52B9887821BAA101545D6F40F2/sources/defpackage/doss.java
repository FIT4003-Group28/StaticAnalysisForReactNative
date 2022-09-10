package defpackage;
/* compiled from: PG */
/* renamed from: doss  reason: default package */
/* loaded from: classes.dex */
public final class doss extends dsqw<doss, dosr> implements dssk {
    public static final doss f;
    private static volatile dssr<doss> h;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        doss dossVar = new doss();
        f = dossVar;
        dsqw.cc(doss.class, dossVar);
    }

    private doss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new doss();
            }
            if (i2 == 4) {
                return new dosr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doss> dssrVar = h;
            if (dssrVar == null) {
                synchronized (doss.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
