package defpackage;
/* compiled from: PG */
/* renamed from: djaa  reason: default package */
/* loaded from: classes6.dex */
public final class djaa extends dsqw<djaa, dizy> implements dssk {
    public static final djaa l;
    private static volatile dssr<djaa> o;
    public int a;
    public int b;
    public dqcu f;
    public boolean h;
    public dnwb i;
    public djgw j;
    public int k;
    private dnqh m;
    private byte n = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        djaa djaaVar = new djaa();
        l = djaaVar;
        dsqw.cc(djaa.class, djaaVar);
    }

    private djaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဇ\u0006\u0007ဉ\u0007\bᐉ\b\tဉ\t\u000bဉ\u0004\fဌ\u000b", new Object[]{"a", "b", dizz.a, "c", "d", "e", "g", "h", "i", "m", "j", "f", "k", dqcj.c()});
            }
            if (i2 == 3) {
                return new djaa();
            }
            if (i2 == 4) {
                return new dizy();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<djaa> dssrVar = o;
            if (dssrVar == null) {
                synchronized (djaa.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
