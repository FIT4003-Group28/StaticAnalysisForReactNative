package defpackage;
/* compiled from: PG */
/* renamed from: dntw  reason: default package */
/* loaded from: classes6.dex */
public final class dntw extends dsqw<dntw, dntr> implements dssk {
    public static final dntw b;
    private static volatile dssr<dntw> c;
    public dsrj<dntv> a = dssu.b;

    static {
        dntw dntwVar = new dntw();
        b = dntwVar;
        dsqw.cc(dntw.class, dntwVar);
    }

    private dntw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dntv.class});
            }
            if (i2 == 3) {
                return new dntw();
            }
            if (i2 == 4) {
                return new dntr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dntw.class) {
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
