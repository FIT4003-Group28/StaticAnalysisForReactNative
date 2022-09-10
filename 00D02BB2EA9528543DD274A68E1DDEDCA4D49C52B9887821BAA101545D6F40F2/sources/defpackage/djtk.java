package defpackage;
/* compiled from: PG */
/* renamed from: djtk  reason: default package */
/* loaded from: classes6.dex */
public final class djtk extends dsqw<djtk, djtj> implements dssk {
    public static final djtk a;
    private static volatile dssr<djtk> b;

    static {
        djtk djtkVar = new djtk();
        a = djtkVar;
        dsqw.cc(djtk.class, djtkVar);
    }

    private djtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djtk();
            }
            if (i2 == 4) {
                return new djtj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djtk.class) {
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
