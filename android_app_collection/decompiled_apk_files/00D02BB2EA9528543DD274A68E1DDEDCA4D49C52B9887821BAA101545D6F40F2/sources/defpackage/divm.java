package defpackage;
/* compiled from: PG */
/* renamed from: divm  reason: default package */
/* loaded from: classes6.dex */
public final class divm extends dsqw<divm, divl> implements dssk {
    public static final divm b;
    private static volatile dssr<divm> d;
    public boolean a;
    private int c;

    static {
        divm divmVar = new divm();
        b = divmVar;
        dsqw.cc(divm.class, divmVar);
    }

    private divm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new divm();
            }
            if (i2 == 4) {
                return new divl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (divm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
