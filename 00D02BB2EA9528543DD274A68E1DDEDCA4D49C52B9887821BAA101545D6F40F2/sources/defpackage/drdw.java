package defpackage;
/* compiled from: PG */
/* renamed from: drdw  reason: default package */
/* loaded from: classes6.dex */
public final class drdw extends dsqw<drdw, drdv> implements dssk {
    public static final drdw d;
    private static volatile dssr<drdw> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        drdw drdwVar = new drdw();
        d = drdwVar;
        dsqw.cc(drdw.class, drdwVar);
    }

    private drdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drdw();
            }
            if (i2 == 4) {
                return new drdv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drdw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
