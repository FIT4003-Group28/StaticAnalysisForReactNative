package defpackage;
/* compiled from: PG */
/* renamed from: drgp  reason: default package */
/* loaded from: classes6.dex */
public final class drgp extends dsqw<drgp, drgo> implements dssk {
    public static final drgp c;
    private static volatile dssr<drgp> d;
    public int a;
    public String b = "";

    static {
        drgp drgpVar = new drgp();
        c = drgpVar;
        dsqw.cc(drgp.class, drgpVar);
    }

    private drgp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drgp();
            }
            if (i2 == 4) {
                return new drgo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drgp.class) {
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
