package defpackage;
/* compiled from: PG */
/* renamed from: diuk  reason: default package */
/* loaded from: classes6.dex */
public final class diuk extends dsqw<diuk, diuh> implements dssk {
    public static final diuk b;
    private static volatile dssr<diuk> c;
    public dsrj<diuj> a = dssu.b;

    static {
        diuk diukVar = new diuk();
        b = diukVar;
        dsqw.cc(diuk.class, diukVar);
    }

    private diuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", diuj.class});
            }
            if (i2 == 3) {
                return new diuk();
            }
            if (i2 == 4) {
                return new diuh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diuk.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
