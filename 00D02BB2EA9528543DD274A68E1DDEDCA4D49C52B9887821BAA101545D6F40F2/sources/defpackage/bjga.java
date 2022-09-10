package defpackage;
/* compiled from: PG */
/* renamed from: bjga  reason: default package */
/* loaded from: classes3.dex */
public final class bjga extends dsqw<bjga, bjfx> implements dssk {
    public static final bjga d;
    private static volatile dssr<bjga> e;
    public int a;
    public bjfs b;
    public bjfz c;

    static {
        bjga bjgaVar = new bjga();
        d = bjgaVar;
        dsqw.cc(bjga.class, bjgaVar);
    }

    private bjga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bjga();
            }
            if (i2 == 4) {
                return new bjfx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjga> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bjga.class) {
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
