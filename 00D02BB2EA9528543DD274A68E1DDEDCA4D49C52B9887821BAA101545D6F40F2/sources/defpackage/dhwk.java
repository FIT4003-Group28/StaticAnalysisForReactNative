package defpackage;
/* compiled from: PG */
/* renamed from: dhwk  reason: default package */
/* loaded from: classes6.dex */
public final class dhwk extends dsqw<dhwk, dhwj> implements dssk {
    public static final dhwk a;
    private static volatile dssr<dhwk> b;

    static {
        dhwk dhwkVar = new dhwk();
        a = dhwkVar;
        dsqw.cc(dhwk.class, dhwkVar);
    }

    private dhwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhwk();
            }
            if (i2 == 4) {
                return new dhwj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhwk.class) {
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
