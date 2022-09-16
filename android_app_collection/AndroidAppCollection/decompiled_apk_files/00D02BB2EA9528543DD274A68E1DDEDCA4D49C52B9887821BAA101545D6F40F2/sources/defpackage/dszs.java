package defpackage;
/* compiled from: PG */
/* renamed from: dszs  reason: default package */
/* loaded from: classes6.dex */
public final class dszs extends dsqw<dszs, dszr> implements dssk {
    public static final dszs c;
    private static volatile dssr<dszs> d;
    public int a;
    public String b = "";

    static {
        dszs dszsVar = new dszs();
        c = dszsVar;
        dsqw.cc(dszs.class, dszsVar);
    }

    private dszs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dszs();
            }
            if (i2 == 4) {
                return new dszr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dszs.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
