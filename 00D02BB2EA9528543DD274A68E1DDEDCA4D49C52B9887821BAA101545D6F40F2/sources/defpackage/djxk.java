package defpackage;
/* compiled from: PG */
/* renamed from: djxk  reason: default package */
/* loaded from: classes6.dex */
public final class djxk extends dsqw<djxk, djxd> implements dssk {
    public static final djxk c;
    private static volatile dssr<djxk> d;
    public int a = 0;
    public Object b;

    static {
        djxk djxkVar = new djxk();
        c = djxkVar;
        dsqw.cc(djxk.class, djxkVar);
    }

    private djxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", drih.class, djxj.class});
            }
            if (i2 == 3) {
                return new djxk();
            }
            if (i2 == 4) {
                return new djxd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djxk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djxk.class) {
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
