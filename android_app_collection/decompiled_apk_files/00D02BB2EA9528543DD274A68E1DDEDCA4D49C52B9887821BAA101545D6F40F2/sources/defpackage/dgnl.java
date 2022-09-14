package defpackage;
/* compiled from: PG */
/* renamed from: dgnl  reason: default package */
/* loaded from: classes6.dex */
public final class dgnl extends dsqw<dgnl, dgnk> implements dssk {
    public static final dgnl c;
    private static volatile dssr<dgnl> d;
    public int a;
    public boolean b;

    static {
        dgnl dgnlVar = new dgnl();
        c = dgnlVar;
        dsqw.cc(dgnl.class, dgnlVar);
    }

    private dgnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgnl();
            }
            if (i2 == 4) {
                return new dgnk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgnl.class) {
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
