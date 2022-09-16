package defpackage;
/* compiled from: PG */
/* renamed from: diso  reason: default package */
/* loaded from: classes6.dex */
public final class diso extends dsqw<diso, disl> implements dssk {
    public static final diso b;
    private static volatile dssr<diso> d;
    public int a;
    private int c;

    static {
        diso disoVar = new diso();
        b = disoVar;
        dsqw.cc(diso.class, disoVar);
    }

    private diso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dism.a});
            }
            if (i2 == 3) {
                return new diso();
            }
            if (i2 == 4) {
                return new disl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diso> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diso.class) {
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
