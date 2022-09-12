package defpackage;
/* compiled from: PG */
/* renamed from: dxqb  reason: default package */
/* loaded from: classes6.dex */
public final class dxqb extends dsqw<dxqb, dxqa> implements dssk {
    public static final dxqb d;
    private static volatile dssr<dxqb> e;
    public dspd a = dspd.b;
    public boolean b;
    public boolean c;

    static {
        dxqb dxqbVar = new dxqb();
        d = dxqbVar;
        dsqw.cc(dxqb.class, dxqbVar);
    }

    private dxqb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxqb();
            }
            if (i2 == 4) {
                return new dxqa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxqb.class) {
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
