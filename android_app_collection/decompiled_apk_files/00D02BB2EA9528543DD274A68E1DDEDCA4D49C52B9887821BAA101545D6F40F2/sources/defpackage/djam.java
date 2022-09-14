package defpackage;
/* compiled from: PG */
/* renamed from: djam  reason: default package */
/* loaded from: classes6.dex */
public final class djam extends dsqw<djam, djaj> implements dssk {
    public static final djam m;
    private static volatile dssr<djam> n;
    public int a;
    public djag c;
    public int e;
    public int f;
    public int g;
    public boolean j;
    public boolean l;
    public String b = "";
    public String d = "";
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        djam djamVar = new djam();
        m = djamVar;
        dsqw.cc(djam.class, djamVar);
    }

    private djam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005င\u0003\u0006ဌ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\nဈ\t\fဇ\u000b\u0010ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", djak.a, "h", "i", "j", "k", "l", "f", dqjh.c()});
            }
            if (i2 == 3) {
                return new djam();
            }
            if (i2 == 4) {
                return new djaj();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djam> dssrVar = n;
            if (dssrVar == null) {
                synchronized (djam.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
