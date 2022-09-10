package defpackage;
/* compiled from: PG */
/* renamed from: dthf  reason: default package */
/* loaded from: classes6.dex */
public final class dthf extends dsqw<dthf, dthe> implements dssk {
    public static final dthf b;
    private static volatile dssr<dthf> c;
    public dsrf a = dsqz.b;

    static {
        dthf dthfVar = new dthf();
        b = dthfVar;
        dsqw.cc(dthf.class, dthfVar);
    }

    private dthf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[]{"a", dthd.c()});
            }
            if (i2 == 3) {
                return new dthf();
            }
            if (i2 == 4) {
                return new dthe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dthf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dthf.class) {
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
