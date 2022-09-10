package defpackage;
/* compiled from: PG */
/* renamed from: dlvc  reason: default package */
/* loaded from: classes6.dex */
public final class dlvc extends dsqw<dlvc, dlvb> implements dssk {
    public static final dlvc j;
    private static volatile dssr<dlvc> k;
    public int a;
    public dtaq d;
    public dtaq e;
    public boolean h;
    public boolean i;
    public String b = "";
    public String c = "";
    public dspd f = dspd.b;
    public String g = "";

    static {
        dlvc dlvcVar = new dlvc();
        j = dlvcVar;
        dsqw.cc(dlvc.class, dlvcVar);
    }

    private dlvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဈ\u0006\u0006ဇ\u0007\bဉ\u0003\tည\u0004\nဇ\b", new Object[]{"a", "b", "c", "d", "g", "h", "e", "f", "i"});
            }
            if (i2 == 3) {
                return new dlvc();
            }
            if (i2 == 4) {
                return new dlvb();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvc> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dlvc.class) {
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
