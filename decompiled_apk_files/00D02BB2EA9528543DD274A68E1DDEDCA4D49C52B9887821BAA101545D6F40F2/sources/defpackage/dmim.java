package defpackage;
/* compiled from: PG */
/* renamed from: dmim  reason: default package */
/* loaded from: classes6.dex */
public final class dmim extends dsqw<dmim, dmig> implements dssk {
    public static final dmim c;
    private static volatile dssr<dmim> d;
    public int a = 0;
    public Object b;

    static {
        dmim dmimVar = new dmim();
        c = dmimVar;
        dsqw.cc(dmim.class, dmimVar);
    }

    private dmim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dmif.class, dmib.class, dmil.class});
            }
            if (i2 == 3) {
                return new dmim();
            }
            if (i2 == 4) {
                return new dmig();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmim> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmim.class) {
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