package defpackage;
/* compiled from: PG */
/* renamed from: dkgr  reason: default package */
/* loaded from: classes6.dex */
public final class dkgr extends dsqw<dkgr, dkgo> implements dssk {
    public static final dkgr c;
    private static volatile dssr<dkgr> d;
    public int a;
    public dkgq b;

    static {
        dkgr dkgrVar = new dkgr();
        c = dkgrVar;
        dsqw.cc(dkgr.class, dkgrVar);
    }

    private dkgr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkgr();
            }
            if (i2 == 4) {
                return new dkgo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkgr.class) {
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
