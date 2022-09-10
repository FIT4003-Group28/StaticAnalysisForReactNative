package defpackage;
/* compiled from: PG */
/* renamed from: rlg  reason: default package */
/* loaded from: classes7.dex */
public final class rlg extends dsqw<rlg, rlf> implements dssk {
    public static final rlg d;
    private static volatile dssr<rlg> e;
    public int a;
    public long b;
    public dsrf c = dsqz.b;

    static {
        rlg rlgVar = new rlg();
        d = rlgVar;
        dsqw.cc(rlg.class, rlgVar);
    }

    private rlg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u0016", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new rlg();
            }
            if (i2 == 4) {
                return new rlf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<rlg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (rlg.class) {
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
