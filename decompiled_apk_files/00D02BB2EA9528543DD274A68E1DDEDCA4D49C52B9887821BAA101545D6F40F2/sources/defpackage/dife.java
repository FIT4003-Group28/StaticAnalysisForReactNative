package defpackage;
/* compiled from: PG */
/* renamed from: dife  reason: default package */
/* loaded from: classes6.dex */
public final class dife extends dsqw<dife, difb> implements dssk {
    public static final dife b;
    private static volatile dssr<dife> d;
    public int a;
    private int c;

    static {
        dife difeVar = new dife();
        b = difeVar;
        dsqw.cc(dife.class, difeVar);
    }

    private dife() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", difc.a});
            }
            if (i2 == 3) {
                return new dife();
            }
            if (i2 == 4) {
                return new difb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dife> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dife.class) {
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
