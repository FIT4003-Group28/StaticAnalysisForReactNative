package defpackage;
/* compiled from: PG */
/* renamed from: cmul  reason: default package */
/* loaded from: classes5.dex */
public final class cmul extends dsqw<cmul, cmuk> implements dssk {
    public static final cmul j;
    private static volatile dssr<cmul> k;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public int i;

    static {
        cmul cmulVar = new cmul();
        j = cmulVar;
        dsqw.cc(cmul.class, cmulVar);
    }

    private cmul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new cmul();
            }
            if (i2 == 4) {
                return new cmuk();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cmul> dssrVar = k;
            if (dssrVar == null) {
                synchronized (cmul.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
