package defpackage;
/* compiled from: PG */
/* renamed from: djji  reason: default package */
/* loaded from: classes6.dex */
public final class djji extends dsqw<djji, djjh> implements dssk {
    public static final djji d;
    private static volatile dssr<djji> e;
    public int a;
    public dpum b;
    public String c = "";

    static {
        djji djjiVar = new djji();
        d = djjiVar;
        dsqw.cc(djji.class, djjiVar);
    }

    private djji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djji();
            }
            if (i2 == 4) {
                return new djjh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djji> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djji.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
