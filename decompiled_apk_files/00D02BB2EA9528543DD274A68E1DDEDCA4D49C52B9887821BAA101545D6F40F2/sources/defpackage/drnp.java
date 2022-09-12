package defpackage;
/* compiled from: PG */
/* renamed from: drnp  reason: default package */
/* loaded from: classes6.dex */
public final class drnp extends dsqw<drnp, drno> implements dssk {
    public static final drnp j;
    private static volatile dssr<drnp> k;
    public int a;
    public int b;
    public drnx d;
    public drns e;
    public drnj f;
    public boolean g;
    public drlw h;
    public String c = "";
    public String i = "";

    static {
        drnp drnpVar = new drnp();
        j = drnpVar;
        dsqw.cc(drnp.class, drnpVar);
    }

    private drnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0004\u0003ဇ\u0005\u0004င\u0000\u0005ဈ\u0001\u0007ဉ\u0006\bဉ\u0003\tဈ\t", new Object[]{"a", "d", "f", "g", "b", "c", "h", "e", "i"});
            }
            if (i2 == 3) {
                return new drnp();
            }
            if (i2 == 4) {
                return new drno();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnp> dssrVar = k;
            if (dssrVar == null) {
                synchronized (drnp.class) {
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
