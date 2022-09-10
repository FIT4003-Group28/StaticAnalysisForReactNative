package defpackage;
/* compiled from: PG */
/* renamed from: duta  reason: default package */
/* loaded from: classes6.dex */
public final class duta extends dsqw<duta, dusz> implements dssk {
    public static final duta a;
    private static volatile dssr<duta> b;

    static {
        duta dutaVar = new duta();
        a = dutaVar;
        dsqw.cc(duta.class, dutaVar);
    }

    private duta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duta();
            }
            if (i2 == 4) {
                return new dusz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duta> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duta.class) {
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
