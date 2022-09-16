package defpackage;
/* compiled from: PG */
/* renamed from: dtnp  reason: default package */
/* loaded from: classes6.dex */
public final class dtnp extends dsqw<dtnp, dtno> implements dssk {
    public static final dtnp c;
    private static volatile dssr<dtnp> d;
    public int a;
    public String b = "";

    static {
        dtnp dtnpVar = new dtnp();
        c = dtnpVar;
        dsqw.cc(dtnp.class, dtnpVar);
    }

    private dtnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtnp();
            }
            if (i2 == 4) {
                return new dtno();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtnp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtnp.class) {
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
