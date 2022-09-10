package defpackage;
/* compiled from: PG */
/* renamed from: dtzo  reason: default package */
/* loaded from: classes6.dex */
public final class dtzo extends dsqw<dtzo, dtzm> implements dssk {
    public static final dtzo e;
    private static volatile dssr<dtzo> f;
    public int a;
    public String b = "";
    public dsrf c = dsqz.b;
    public int d;

    static {
        dtzo dtzoVar = new dtzo();
        e = dtzoVar;
        dsqw.cc(dtzo.class, dtzoVar);
    }

    private dtzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtzo();
            }
            if (i2 == 4) {
                return new dtzm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtzo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
