package defpackage;
/* compiled from: PG */
/* renamed from: dihp  reason: default package */
/* loaded from: classes6.dex */
public final class dihp extends dsqw<dihp, diho> implements dssk {
    public static final dihp c;
    private static volatile dssr<dihp> d;
    public int a;
    public dmbc b;

    static {
        dihp dihpVar = new dihp();
        c = dihpVar;
        dsqw.cc(dihp.class, dihpVar);
    }

    private dihp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dihp();
            }
            if (i2 == 4) {
                return new diho();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dihp.class) {
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
