package defpackage;
/* compiled from: PG */
/* renamed from: daxu  reason: default package */
/* loaded from: classes5.dex */
public final class daxu extends dsqw<daxu, daxn> implements dssk {
    public static final daxu j;
    private static volatile dssr<daxu> k;
    public int a;
    public int b;
    public int c;
    public long d;
    public String e = "";
    public String f = "";
    public String g = "";
    public int h;
    public dawi i;

    static {
        daxu daxuVar = new daxu();
        j = daxuVar;
        dsqw.cc(daxu.class, daxuVar);
    }

    private daxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဂ\u0002\u0003ဈ\u0003\u0004ဌ\u0000\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဉ\u0007", new Object[]{"a", "c", daxs.a, "d", "e", "b", daxq.a, "f", "g", "h", daxo.a, "i"});
            }
            if (i2 == 3) {
                return new daxu();
            }
            if (i2 == 4) {
                return new daxn();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxu> dssrVar = k;
            if (dssrVar == null) {
                synchronized (daxu.class) {
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
