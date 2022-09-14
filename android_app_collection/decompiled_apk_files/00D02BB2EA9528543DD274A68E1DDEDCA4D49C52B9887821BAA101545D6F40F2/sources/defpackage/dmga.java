package defpackage;
/* compiled from: PG */
/* renamed from: dmga  reason: default package */
/* loaded from: classes6.dex */
public final class dmga extends dsqw<dmga, dmfz> implements dssk {
    public static final dmga d;
    public static final dsqv<dmfs, dmga> e;
    private static volatile dssr<dmga> f;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dmga dmgaVar = new dmga();
        d = dmgaVar;
        dsqw.cc(dmga.class, dmgaVar);
        e = dsqw.newSingularGeneratedExtension(dmfs.c, dmgaVar, dmgaVar, null, 1038, dsur.MESSAGE, dmga.class);
    }

    private dmga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmga();
            }
            if (i2 == 4) {
                return new dmfz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmga> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmga.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
