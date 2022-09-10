package defpackage;
/* compiled from: PG */
/* renamed from: dkni  reason: default package */
/* loaded from: classes6.dex */
public final class dkni extends dsqw<dkni, dknh> implements dssk {
    public static final dkni b;
    private static volatile dssr<dkni> d;
    public boolean a;
    private int c;

    static {
        dkni dkniVar = new dkni();
        b = dkniVar;
        dsqw.cc(dkni.class, dkniVar);
    }

    private dkni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkni();
            }
            if (i2 == 4) {
                return new dknh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkni> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkni.class) {
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
