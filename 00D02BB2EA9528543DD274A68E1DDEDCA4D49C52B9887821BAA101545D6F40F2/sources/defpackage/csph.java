package defpackage;
/* compiled from: PG */
/* renamed from: csph  reason: default package */
/* loaded from: classes5.dex */
public final class csph extends dsqw<csph, cspg> implements dssk {
    public static final csph d;
    private static volatile dssr<csph> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        csph csphVar = new csph();
        d = csphVar;
        dsqw.cc(csph.class, csphVar);
    }

    private csph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new csph();
            }
            if (i2 == 4) {
                return new cspg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csph> dssrVar = e;
            if (dssrVar == null) {
                synchronized (csph.class) {
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
