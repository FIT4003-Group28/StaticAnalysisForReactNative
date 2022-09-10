package defpackage;
/* compiled from: PG */
/* renamed from: dkac  reason: default package */
/* loaded from: classes6.dex */
public final class dkac extends dsqw<dkac, dkab> implements dssk {
    public static final dkac a;
    private static volatile dssr<dkac> b;

    static {
        dkac dkacVar = new dkac();
        a = dkacVar;
        dsqw.cc(dkac.class, dkacVar);
    }

    private dkac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkac();
            }
            if (i2 == 4) {
                return new dkab();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkac> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkac.class) {
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
