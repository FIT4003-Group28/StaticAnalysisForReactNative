package defpackage;
/* compiled from: PG */
/* renamed from: dxqf  reason: default package */
/* loaded from: classes6.dex */
public final class dxqf extends dsqw<dxqf, dxqe> implements dssk {
    public static final dxqf c;
    private static volatile dssr<dxqf> d;
    public int a;
    public dsok b;

    static {
        dxqf dxqfVar = new dxqf();
        c = dxqfVar;
        dsqw.cc(dxqf.class, dxqfVar);
    }

    private dxqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxqf();
            }
            if (i2 == 4) {
                return new dxqe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxqf.class) {
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
