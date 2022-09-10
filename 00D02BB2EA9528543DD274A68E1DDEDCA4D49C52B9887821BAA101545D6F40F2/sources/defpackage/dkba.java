package defpackage;
/* compiled from: PG */
/* renamed from: dkba  reason: default package */
/* loaded from: classes6.dex */
public final class dkba extends dsqw<dkba, dkaz> implements dssk {
    public static final dkba a;
    private static volatile dssr<dkba> b;

    static {
        dkba dkbaVar = new dkba();
        a = dkbaVar;
        dsqw.cc(dkba.class, dkbaVar);
    }

    private dkba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkba();
            }
            if (i2 == 4) {
                return new dkaz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkba> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkba.class) {
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
