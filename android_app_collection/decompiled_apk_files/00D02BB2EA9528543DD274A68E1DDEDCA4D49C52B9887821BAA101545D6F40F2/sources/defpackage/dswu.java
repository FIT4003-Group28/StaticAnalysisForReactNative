package defpackage;
/* compiled from: PG */
/* renamed from: dswu  reason: default package */
/* loaded from: classes6.dex */
public final class dswu extends dsqw<dswu, dswt> implements dssk {
    public static final dswu a;
    private static volatile dssr<dswu> b;

    static {
        dswu dswuVar = new dswu();
        a = dswuVar;
        dsqw.cc(dswu.class, dswuVar);
    }

    private dswu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dswu();
            }
            if (i2 == 4) {
                return new dswt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dswu.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
