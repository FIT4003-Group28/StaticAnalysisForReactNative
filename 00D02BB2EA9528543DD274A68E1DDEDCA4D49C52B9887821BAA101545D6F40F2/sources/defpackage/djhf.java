package defpackage;
/* compiled from: PG */
/* renamed from: djhf  reason: default package */
/* loaded from: classes6.dex */
public final class djhf extends dsqw<djhf, djhe> implements dssk {
    public static final djhf d;
    private static volatile dssr<djhf> e;
    public int a;
    public String b = "";
    public int c;

    static {
        djhf djhfVar = new djhf();
        d = djhfVar;
        dsqw.cc(djhf.class, djhfVar);
    }

    private djhf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djhf();
            }
            if (i2 == 4) {
                return new djhe();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djhf.class) {
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
