package defpackage;
/* compiled from: PG */
/* renamed from: dirv  reason: default package */
/* loaded from: classes6.dex */
public final class dirv extends dsqw<dirv, diru> implements dssk {
    public static final dirv e;
    private static volatile dssr<dirv> f;
    public int a;
    public String b = "";
    public String c = "";
    public dpum d;

    static {
        dirv dirvVar = new dirv();
        e = dirvVar;
        dsqw.cc(dirv.class, dirvVar);
    }

    private dirv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဈ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dirv();
            }
            if (i2 == 4) {
                return new diru();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dirv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dirv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
