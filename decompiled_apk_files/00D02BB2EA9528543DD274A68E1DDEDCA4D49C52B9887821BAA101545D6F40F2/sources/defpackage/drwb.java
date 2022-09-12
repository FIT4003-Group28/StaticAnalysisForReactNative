package defpackage;
/* compiled from: PG */
/* renamed from: drwb  reason: default package */
/* loaded from: classes6.dex */
public final class drwb extends dsqw<drwb, drvo> implements dssk {
    public static final drwb p;
    private static volatile dssr<drwb> q;
    public int a;
    public float b;
    public int c;
    public int i;
    public int m;
    public drwa o;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public dsrj<drtv> k = dssu.b;
    public dsrj<drts> l = dssu.b;
    public String n = "";

    static {
        drwb drwbVar = new drwb();
        p = drwbVar;
        dsqw.cc(drwb.class, drwbVar);
    }

    private drwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0002\u0010\u000e\u0000\u0002\u0000\u0002ခ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f", new Object[]{"a", "b", "c", drtn.a, "d", "e", "f", "g", "h", "i", "j", "k", drtv.class, "l", drts.class, "m", drvn.a, "n", "o"});
            }
            if (i2 == 3) {
                return new drwb();
            }
            if (i2 == 4) {
                return new drvo();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwb> dssrVar = q;
            if (dssrVar == null) {
                synchronized (drwb.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
