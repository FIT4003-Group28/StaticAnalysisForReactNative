package defpackage;
/* compiled from: PG */
/* renamed from: btyw  reason: default package */
/* loaded from: classes.dex */
public final class btyw extends dsqw<btyw, btyv> implements dssk {
    public static final btyw c;
    private static volatile dssr<btyw> d;
    public int a;
    public int b;

    static {
        btyw btywVar = new btyw();
        c = btywVar;
        dsqw.cc(btyw.class, btywVar);
    }

    private btyw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new btyw();
            }
            if (i2 == 4) {
                return new btyv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<btyw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (btyw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
