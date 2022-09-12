package defpackage;
/* compiled from: PG */
/* renamed from: ckyb  reason: default package */
/* loaded from: classes5.dex */
public final class ckyb extends dsqw<ckyb, ckya> implements dssk {
    public static final ckyb c;
    private static volatile dssr<ckyb> e;
    public ckvz a;
    public ckvz b;
    private int d;

    static {
        ckyb ckybVar = new ckyb();
        c = ckybVar;
        dsqw.cc(ckyb.class, ckybVar);
    }

    private ckyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new ckyb();
            }
            if (i2 == 4) {
                return new ckya();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckyb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckyb.class) {
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
