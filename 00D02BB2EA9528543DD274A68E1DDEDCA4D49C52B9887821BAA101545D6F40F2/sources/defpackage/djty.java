package defpackage;
/* compiled from: PG */
/* renamed from: djty  reason: default package */
/* loaded from: classes6.dex */
public final class djty extends dsqw<djty, djtx> implements dssk {
    public static final djty a;
    private static volatile dssr<djty> b;

    static {
        djty djtyVar = new djty();
        a = djtyVar;
        dsqw.cc(djty.class, djtyVar);
    }

    private djty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djty();
            }
            if (i2 == 4) {
                return new djtx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djty> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djty.class) {
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
