package defpackage;
/* compiled from: PG */
/* renamed from: cku  reason: default package */
/* loaded from: classes4.dex */
public final class cku extends dsqw<cku, ckt> implements dssk {
    public static final cku a;
    private static volatile dssr<cku> c;
    private ckw b;

    static {
        cku ckuVar = new cku();
        a = ckuVar;
        dsqw.cc(cku.class, ckuVar);
    }

    private cku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\t", new Object[]{"b"});
            }
            if (i2 == 3) {
                return new cku();
            }
            if (i2 == 4) {
                return new ckt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cku> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cku.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
