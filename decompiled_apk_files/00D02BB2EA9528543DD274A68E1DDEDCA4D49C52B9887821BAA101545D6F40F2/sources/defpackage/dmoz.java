package defpackage;
/* compiled from: PG */
/* renamed from: dmoz  reason: default package */
/* loaded from: classes6.dex */
public final class dmoz extends dsqw<dmoz, dmoy> implements dssk {
    public static final dmoz a;
    private static volatile dssr<dmoz> b;

    static {
        dmoz dmozVar = new dmoz();
        a = dmozVar;
        dsqw.cc(dmoz.class, dmozVar);
    }

    private dmoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmoz();
            }
            if (i2 == 4) {
                return new dmoy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmoz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmoz.class) {
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
