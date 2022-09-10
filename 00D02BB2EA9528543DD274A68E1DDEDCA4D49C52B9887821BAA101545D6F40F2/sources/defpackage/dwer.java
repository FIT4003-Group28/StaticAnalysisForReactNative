package defpackage;
/* compiled from: PG */
/* renamed from: dwer  reason: default package */
/* loaded from: classes6.dex */
public final class dwer extends dsqw<dwer, dweq> implements dssk {
    public static final dwer a;
    private static volatile dssr<dwer> b;

    static {
        dwer dwerVar = new dwer();
        a = dwerVar;
        dsqw.cc(dwer.class, dwerVar);
    }

    private dwer() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwer();
            }
            if (i2 == 4) {
                return new dweq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwer> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwer.class) {
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
