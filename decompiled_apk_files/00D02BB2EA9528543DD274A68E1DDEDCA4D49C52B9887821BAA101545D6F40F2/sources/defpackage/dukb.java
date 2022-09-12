package defpackage;
/* compiled from: PG */
/* renamed from: dukb  reason: default package */
/* loaded from: classes6.dex */
public final class dukb extends dsqw<dukb, duka> implements dssk {
    public static final dukb c;
    private static volatile dssr<dukb> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public int b = -1;

    static {
        dukb dukbVar = new dukb();
        c = dukbVar;
        dsqw.cc(dukb.class, dukbVar);
    }

    private dukb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", dndr.c(), "d"});
            }
            if (i2 == 3) {
                return new dukb();
            }
            if (i2 == 4) {
                return new duka();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dukb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dukb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
