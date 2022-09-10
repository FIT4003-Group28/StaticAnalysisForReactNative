package defpackage;
/* compiled from: PG */
/* renamed from: drdk  reason: default package */
/* loaded from: classes6.dex */
public final class drdk extends dsqw<drdk, drdj> implements dssk {
    public static final drdk c;
    private static volatile dssr<drdk> d;
    public int a = 0;
    public Object b;

    static {
        drdk drdkVar = new drdk();
        c = drdkVar;
        dsqw.cc(drdk.class, drdkVar);
    }

    private drdk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new drdk();
            }
            if (i2 == 4) {
                return new drdj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drdk.class) {
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
