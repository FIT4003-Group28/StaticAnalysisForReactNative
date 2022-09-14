package defpackage;
/* compiled from: PG */
/* renamed from: cshp  reason: default package */
/* loaded from: classes5.dex */
public final class cshp extends dsqw<cshp, cshm> implements dssk {
    public static final cshp d;
    private static volatile dssr<cshp> e;
    public int a;
    public String b = "";
    public int c;

    static {
        cshp cshpVar = new cshp();
        d = cshpVar;
        dsqw.cc(cshp.class, cshpVar);
    }

    private cshp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", cshn.a});
            }
            if (i2 == 3) {
                return new cshp();
            }
            if (i2 == 4) {
                return new cshm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cshp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cshp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
