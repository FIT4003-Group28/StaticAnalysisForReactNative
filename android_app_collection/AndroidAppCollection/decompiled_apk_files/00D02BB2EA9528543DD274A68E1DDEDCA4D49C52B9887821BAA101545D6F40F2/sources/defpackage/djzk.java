package defpackage;
/* compiled from: PG */
/* renamed from: djzk  reason: default package */
/* loaded from: classes6.dex */
public final class djzk extends dsqw<djzk, djzj> implements dssk {
    public static final djzk c;
    private static volatile dssr<djzk> e;
    public int a;
    public boolean b;
    private int d;

    static {
        djzk djzkVar = new djzk();
        c = djzkVar;
        dsqw.cc(djzk.class, djzkVar);
    }

    private djzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", dqkc.c(), "b"});
            }
            if (i2 == 3) {
                return new djzk();
            }
            if (i2 == 4) {
                return new djzj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djzk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djzk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
