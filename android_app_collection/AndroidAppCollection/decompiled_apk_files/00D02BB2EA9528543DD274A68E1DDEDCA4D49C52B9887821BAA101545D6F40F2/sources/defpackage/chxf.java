package defpackage;
/* compiled from: PG */
/* renamed from: chxf  reason: default package */
/* loaded from: classes4.dex */
public final class chxf extends dsqw<chxf, chwy> implements dssk {
    public static final chxf e;
    private static volatile dssr<chxf> f;
    public int a;
    public dsrj<chxe> b = dssu.b;
    public chxe c;
    public int d;

    static {
        chxf chxfVar = new chxf();
        e = chxfVar;
        dsqw.cc(chxf.class, chxfVar);
    }

    private chxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", chxe.class, "c"});
            }
            if (i2 == 3) {
                return new chxf();
            }
            if (i2 == 4) {
                return new chwy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chxf.class) {
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
