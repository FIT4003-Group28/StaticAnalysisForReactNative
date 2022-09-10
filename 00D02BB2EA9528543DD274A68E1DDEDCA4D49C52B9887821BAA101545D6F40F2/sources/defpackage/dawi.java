package defpackage;
/* compiled from: PG */
/* renamed from: dawi  reason: default package */
/* loaded from: classes5.dex */
public final class dawi extends dsqw<dawi, dawd> implements dssk {
    public static final dawi c;
    private static volatile dssr<dawi> d;
    public int a = 0;
    public Object b;

    static {
        dawi dawiVar = new dawi();
        c = dawiVar;
        dsqw.cc(dawi.class, dawiVar);
    }

    private dawi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dawf.class, dawh.class});
            }
            if (i2 == 3) {
                return new dawi();
            }
            if (i2 == 4) {
                return new dawd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dawi.class) {
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
