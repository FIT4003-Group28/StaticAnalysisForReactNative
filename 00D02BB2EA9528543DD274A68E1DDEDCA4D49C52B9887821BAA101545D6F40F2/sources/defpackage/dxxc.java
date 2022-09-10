package defpackage;
/* compiled from: PG */
/* renamed from: dxxc  reason: default package */
/* loaded from: classes6.dex */
public final class dxxc extends dsqw<dxxc, dxxb> implements dssk {
    public static final dxxc c;
    private static volatile dssr<dxxc> d;
    public dxwi a;
    public dxvy b;

    static {
        dxxc dxxcVar = new dxxc();
        c = dxxcVar;
        dsqw.cc(dxxc.class, dxxcVar);
    }

    private dxxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dxxc();
            }
            if (i2 == 4) {
                return new dxxb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxxc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxxc.class) {
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
