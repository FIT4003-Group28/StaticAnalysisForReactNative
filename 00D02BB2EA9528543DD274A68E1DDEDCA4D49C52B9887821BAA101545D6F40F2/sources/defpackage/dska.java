package defpackage;
/* compiled from: PG */
/* renamed from: dska  reason: default package */
/* loaded from: classes6.dex */
public final class dska extends dsqw<dska, dsjt> implements dssk {
    public static final dska c;
    private static volatile dssr<dska> d;
    public int a = 0;
    public Object b;

    static {
        dska dskaVar = new dska();
        c = dskaVar;
        dsqw.cc(dska.class, dskaVar);
    }

    private dska() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dsjz.class, dsjx.class});
            }
            if (i2 == 3) {
                return new dska();
            }
            if (i2 == 4) {
                return new dsjt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dska> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dska.class) {
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
