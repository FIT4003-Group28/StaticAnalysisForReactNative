package defpackage;
/* compiled from: PG */
/* renamed from: bzjh  reason: default package */
/* loaded from: classes4.dex */
public final class bzjh extends dsqw<bzjh, bzje> implements dssk {
    public static final bzjh j;
    private static volatile dssr<bzjh> k;
    public int a;
    public long b;
    public int c;
    public long d;
    public long e;
    public String f = "";
    public String g = "";
    public dpjb h;
    public int i;

    static {
        bzjh bzjhVar = new bzjh();
        j = bzjhVar;
        dsqw.cc(bzjh.class, bzjhVar);
    }

    private bzjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0002\n\b\u0000\u0000\u0000\u0002ဂ\u0000\u0004ဌ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006\nဌ\u0007", new Object[]{"a", "b", "c", bzjf.a, "d", "e", "f", "g", "h", "i", dpkg.a});
            }
            if (i2 == 3) {
                return new bzjh();
            }
            if (i2 == 4) {
                return new bzje();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzjh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (bzjh.class) {
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
