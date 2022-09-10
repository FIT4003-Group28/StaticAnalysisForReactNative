package defpackage;
/* compiled from: PG */
/* renamed from: djki  reason: default package */
/* loaded from: classes6.dex */
public final class djki extends dsqw<djki, djkh> implements dssk {
    public static final djki a;
    private static volatile dssr<djki> b;

    static {
        djki djkiVar = new djki();
        a = djkiVar;
        dsqw.cc(djki.class, djkiVar);
    }

    private djki() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djki();
            }
            if (i2 == 4) {
                return new djkh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djki> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djki.class) {
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
