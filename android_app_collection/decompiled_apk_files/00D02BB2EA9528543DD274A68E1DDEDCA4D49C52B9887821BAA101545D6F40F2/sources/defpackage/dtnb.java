package defpackage;
/* compiled from: PG */
/* renamed from: dtnb  reason: default package */
/* loaded from: classes6.dex */
public final class dtnb extends dsqs<dtnb, dtna> implements dsqt {
    public static final dtnb f;
    private static volatile dssr<dtnb> h;
    public int a;
    public dvwl b;
    public dthb c;
    public long e;
    private byte g = 2;
    public String d = "";

    static {
        dtnb dtnbVar = new dtnb();
        f = dtnbVar;
        dsqw.cc(dtnb.class, dtnbVar);
    }

    private dtnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtnb();
            }
            if (i2 == 4) {
                return new dtna();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtnb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtnb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
