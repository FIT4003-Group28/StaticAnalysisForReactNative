package defpackage;
/* compiled from: PG */
/* renamed from: drmz  reason: default package */
/* loaded from: classes6.dex */
public final class drmz extends dsqw<drmz, drmy> implements dssk {
    public static final drmz c;
    private static volatile dssr<drmz> d;
    public int a;
    public String b = "";

    static {
        drmz drmzVar = new drmz();
        c = drmzVar;
        dsqw.cc(drmz.class, drmzVar);
    }

    private drmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drmz();
            }
            if (i2 == 4) {
                return new drmy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drmz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drmz.class) {
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
