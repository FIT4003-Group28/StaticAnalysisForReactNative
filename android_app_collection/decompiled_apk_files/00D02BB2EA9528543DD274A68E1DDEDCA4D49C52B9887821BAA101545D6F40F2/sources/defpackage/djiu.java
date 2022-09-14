package defpackage;
/* compiled from: PG */
/* renamed from: djiu  reason: default package */
/* loaded from: classes6.dex */
public final class djiu extends dsqw<djiu, djit> implements dssk {
    public static final djiu h;
    private static volatile dssr<djiu> j;
    public Object b;
    private int i;
    public int a = 0;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        djiu djiuVar = new djiu();
        h = djiuVar;
        dsqw.cc(djiu.class, djiuVar);
    }

    private djiu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0006ဈ\u0007\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", "i", "c", "d", "e", "f", "g", djis.class, djis.class});
            }
            if (i2 == 3) {
                return new djiu();
            }
            if (i2 == 4) {
                return new djit();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djiu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djiu.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
