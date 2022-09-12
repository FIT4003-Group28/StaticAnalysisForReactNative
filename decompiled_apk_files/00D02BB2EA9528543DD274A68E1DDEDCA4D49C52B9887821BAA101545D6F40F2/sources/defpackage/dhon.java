package defpackage;
/* compiled from: PG */
/* renamed from: dhon  reason: default package */
/* loaded from: classes6.dex */
public final class dhon extends dsqw<dhon, dhom> implements dssk {
    public static final dhon b;
    private static volatile dssr<dhon> c;
    public dsrj<dhoj> a = dssu.b;

    static {
        dhon dhonVar = new dhon();
        b = dhonVar;
        dsqw.cc(dhon.class, dhonVar);
    }

    private dhon() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dhoj.class});
            }
            if (i2 == 3) {
                return new dhon();
            }
            if (i2 == 4) {
                return new dhom();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhon> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhon.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
