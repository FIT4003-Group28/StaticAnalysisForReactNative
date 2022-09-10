package defpackage;
/* compiled from: PG */
/* renamed from: diwp  reason: default package */
/* loaded from: classes6.dex */
public final class diwp extends dsqw<diwp, diwo> implements dssk {
    public static final diwp a;
    private static volatile dssr<diwp> b;

    static {
        diwp diwpVar = new diwp();
        a = diwpVar;
        dsqw.cc(diwp.class, diwpVar);
    }

    private diwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diwp();
            }
            if (i2 == 4) {
                return new diwo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diwp.class) {
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
