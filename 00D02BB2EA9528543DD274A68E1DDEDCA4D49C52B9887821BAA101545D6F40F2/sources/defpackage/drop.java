package defpackage;
/* compiled from: PG */
/* renamed from: drop  reason: default package */
/* loaded from: classes6.dex */
public final class drop extends dsqw<drop, drom> implements dssk {
    public static final drop b;
    private static volatile dssr<drop> d;
    public int a;
    private int c;

    static {
        drop dropVar = new drop();
        b = dropVar;
        dsqw.cc(drop.class, dropVar);
    }

    private drop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dron.a});
            }
            if (i2 == 3) {
                return new drop();
            }
            if (i2 == 4) {
                return new drom();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drop> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drop.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
