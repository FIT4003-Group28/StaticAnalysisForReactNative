package defpackage;
/* compiled from: PG */
/* renamed from: djgs  reason: default package */
/* loaded from: classes6.dex */
public final class djgs extends dsqw<djgs, djgq> implements dssk {
    public static final djgs c;
    private static volatile dssr<djgs> d;
    public int a;
    public int b;

    static {
        djgs djgsVar = new djgs();
        c = djgsVar;
        dsqw.cc(djgs.class, djgsVar);
    }

    private djgs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djgr.a});
            }
            if (i2 == 3) {
                return new djgs();
            }
            if (i2 == 4) {
                return new djgq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djgs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djgs.class) {
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
