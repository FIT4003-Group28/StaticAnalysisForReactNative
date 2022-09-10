package defpackage;
/* compiled from: PG */
/* renamed from: dici  reason: default package */
/* loaded from: classes6.dex */
public final class dici extends dsqw<dici, dich> implements dssk {
    public static final dici a;
    private static volatile dssr<dici> b;

    static {
        dici diciVar = new dici();
        a = diciVar;
        dsqw.cc(dici.class, diciVar);
    }

    private dici() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dici();
            }
            if (i2 == 4) {
                return new dich();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dici> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dici.class) {
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
