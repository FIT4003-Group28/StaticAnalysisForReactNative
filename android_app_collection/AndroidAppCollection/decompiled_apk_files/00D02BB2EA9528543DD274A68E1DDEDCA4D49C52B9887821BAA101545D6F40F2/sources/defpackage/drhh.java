package defpackage;
/* compiled from: PG */
/* renamed from: drhh  reason: default package */
/* loaded from: classes6.dex */
public final class drhh extends dsqw<drhh, drhe> implements dssk {
    public static final drhh k;
    private static volatile dssr<drhh> l;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        drhh drhhVar = new drhh();
        k = drhhVar;
        dsqw.cc(drhh.class, drhhVar);
    }

    private drhh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0006\u0007ဈ\b\bဈ\u0005\tဈ\u0007\nဈ\t", new Object[]{"a", "b", drhg.c(), "c", "d", "e", "g", "i", "f", "h", "j"});
            }
            if (i2 == 3) {
                return new drhh();
            }
            if (i2 == 4) {
                return new drhe();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhh> dssrVar = l;
            if (dssrVar == null) {
                synchronized (drhh.class) {
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
