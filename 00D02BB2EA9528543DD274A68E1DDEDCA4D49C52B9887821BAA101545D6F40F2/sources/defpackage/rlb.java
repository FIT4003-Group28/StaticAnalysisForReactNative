package defpackage;
/* compiled from: PG */
/* renamed from: rlb  reason: default package */
/* loaded from: classes7.dex */
public final class rlb extends dsqw<rlb, rla> implements dssk {
    public static final rlb d;
    private static volatile dssr<rlb> e;
    public int a;
    public String b = "";
    public int c;

    static {
        rlb rlbVar = new rlb();
        d = rlbVar;
        dsqw.cc(rlb.class, rlbVar);
    }

    private rlb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new rlb();
            }
            if (i2 == 4) {
                return new rla();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<rlb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (rlb.class) {
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
