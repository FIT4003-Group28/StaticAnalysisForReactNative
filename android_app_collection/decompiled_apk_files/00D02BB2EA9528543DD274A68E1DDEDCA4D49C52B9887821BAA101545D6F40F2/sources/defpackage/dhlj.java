package defpackage;
/* compiled from: PG */
/* renamed from: dhlj  reason: default package */
/* loaded from: classes6.dex */
public final class dhlj extends dsqw<dhlj, dhle> implements dssk {
    public static final dhlj c;
    private static volatile dssr<dhlj> g;
    public Object b;
    private int d;
    private dnqh e;
    public int a = 0;
    private byte f = 2;

    static {
        dhlj dhljVar = new dhlj();
        c = dhljVar;
        dsqw.cc(dhlj.class, dhljVar);
    }

    private dhlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "d", "e", dhli.class, dhlg.class});
            }
            if (i2 == 3) {
                return new dhlj();
            }
            if (i2 == 4) {
                return new dhle();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhlj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhlj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
