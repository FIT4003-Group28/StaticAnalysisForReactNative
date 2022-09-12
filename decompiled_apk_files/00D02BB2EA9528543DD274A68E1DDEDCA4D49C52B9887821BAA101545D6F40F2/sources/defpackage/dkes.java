package defpackage;
/* compiled from: PG */
/* renamed from: dkes  reason: default package */
/* loaded from: classes6.dex */
public final class dkes extends dsqw<dkes, dker> implements dssk {
    public static final dkes a;
    private static volatile dssr<dkes> b;

    static {
        dkes dkesVar = new dkes();
        a = dkesVar;
        dsqw.cc(dkes.class, dkesVar);
    }

    private dkes() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkes();
            }
            if (i2 == 4) {
                return new dker();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkes> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkes.class) {
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
