package defpackage;
/* compiled from: PG */
/* renamed from: dhto  reason: default package */
/* loaded from: classes6.dex */
public final class dhto extends dsqw<dhto, dhtn> implements dssk {
    public static final dhto a;
    private static volatile dssr<dhto> b;

    static {
        dhto dhtoVar = new dhto();
        a = dhtoVar;
        dsqw.cc(dhto.class, dhtoVar);
    }

    private dhto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhto();
            }
            if (i2 == 4) {
                return new dhtn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhto> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhto.class) {
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
