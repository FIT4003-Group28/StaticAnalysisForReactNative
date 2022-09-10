package defpackage;
/* compiled from: PG */
/* renamed from: diof  reason: default package */
/* loaded from: classes6.dex */
public final class diof extends dsqw<diof, dioe> implements dssk {
    public static final diof c;
    private static volatile dssr<diof> d;
    public int a;
    public dioi b;

    static {
        diof diofVar = new diof();
        c = diofVar;
        dsqw.cc(diof.class, diofVar);
    }

    private diof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new diof();
            }
            if (i2 == 4) {
                return new dioe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diof> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diof.class) {
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
