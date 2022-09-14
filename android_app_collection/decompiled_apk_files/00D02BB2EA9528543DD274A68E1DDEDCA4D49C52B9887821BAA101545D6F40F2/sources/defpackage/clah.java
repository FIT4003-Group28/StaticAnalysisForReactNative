package defpackage;
/* compiled from: PG */
/* renamed from: clah  reason: default package */
/* loaded from: classes5.dex */
public final class clah extends dsqs<clah, clag> implements dsqt {
    public static final clah a;
    private static volatile dssr<clah> c;
    private byte b = 2;

    static {
        clah clahVar = new clah();
        a = clahVar;
        dsqw.cc(clah.class, clahVar);
    }

    private clah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new clah();
            }
            if (i2 == 4) {
                return new clag();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<clah> dssrVar = c;
            if (dssrVar == null) {
                synchronized (clah.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
