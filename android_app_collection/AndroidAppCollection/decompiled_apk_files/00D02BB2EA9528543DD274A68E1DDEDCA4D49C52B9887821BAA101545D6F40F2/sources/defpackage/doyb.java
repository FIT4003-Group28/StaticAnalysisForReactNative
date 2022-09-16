package defpackage;
/* compiled from: PG */
/* renamed from: doyb  reason: default package */
/* loaded from: classes6.dex */
public final class doyb extends dsqw<doyb, doya> implements dssk {
    public static final doyb d;
    private static volatile dssr<doyb> e;
    public int a;
    public dnoh b;
    public dnoh c;

    static {
        doyb doybVar = new doyb();
        d = doybVar;
        dsqw.cc(doyb.class, doybVar);
    }

    private doyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doyb();
            }
            if (i2 == 4) {
                return new doya();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doyb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doyb.class) {
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
