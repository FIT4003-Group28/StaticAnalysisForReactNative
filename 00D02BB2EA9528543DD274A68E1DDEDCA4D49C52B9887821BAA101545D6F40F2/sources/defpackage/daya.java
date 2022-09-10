package defpackage;
/* compiled from: PG */
/* renamed from: daya  reason: default package */
/* loaded from: classes5.dex */
public final class daya extends dsqw<daya, daxz> implements dssk {
    public static final daya e;
    private static volatile dssr<daya> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        daya dayaVar = new daya();
        e = dayaVar;
        dsqw.cc(daya.class, dayaVar);
    }

    private daya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0004\u0005ဈ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new daya();
            }
            if (i2 == 4) {
                return new daxz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daya> dssrVar = f;
            if (dssrVar == null) {
                synchronized (daya.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
