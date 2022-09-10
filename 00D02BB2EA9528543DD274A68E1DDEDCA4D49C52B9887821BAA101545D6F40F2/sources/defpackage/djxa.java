package defpackage;
/* compiled from: PG */
/* renamed from: djxa  reason: default package */
/* loaded from: classes6.dex */
public final class djxa extends dsqw<djxa, djwz> implements dssk {
    public static final djxa a;
    private static volatile dssr<djxa> b;

    static {
        djxa djxaVar = new djxa();
        a = djxaVar;
        dsqw.cc(djxa.class, djxaVar);
    }

    private djxa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djxa();
            }
            if (i2 == 4) {
                return new djwz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djxa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djxa.class) {
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
