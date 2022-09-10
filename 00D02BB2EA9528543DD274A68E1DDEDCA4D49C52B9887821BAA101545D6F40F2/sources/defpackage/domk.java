package defpackage;
/* compiled from: PG */
/* renamed from: domk  reason: default package */
/* loaded from: classes6.dex */
public final class domk extends dsqw<domk, domj> implements dssk {
    public static final domk a;
    private static volatile dssr<domk> b;

    static {
        domk domkVar = new domk();
        a = domkVar;
        dsqw.cc(domk.class, domkVar);
    }

    private domk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new domk();
            }
            if (i2 == 4) {
                return new domj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (domk.class) {
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
