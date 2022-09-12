package defpackage;
/* compiled from: PG */
/* renamed from: dkps  reason: default package */
/* loaded from: classes.dex */
public final class dkps extends dsqw<dkps, dkpn> implements dssk {
    public static final dkps k;
    private static volatile dssr<dkps> l;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public dsrj<dkpr> i = dssu.b;
    public int j;

    static {
        dkps dkpsVar = new dkps();
        k = dkpsVar;
        dsqw.cc(dkps.class, dkpsVar);
    }

    private dkps() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0006\u0004ဈ\b\u0005ဈ\n\u0006\u001b\u0007ဈ\u0003\bဌ\f\tဈ\u0005", new Object[]{"a", "b", "c", "f", "g", "h", "i", dkpr.class, "d", "j", dkpo.a, "e"});
            }
            if (i2 == 3) {
                return new dkps();
            }
            if (i2 == 4) {
                return new dkpn();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkps> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dkps.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
