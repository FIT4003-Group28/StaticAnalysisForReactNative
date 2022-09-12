package defpackage;
/* compiled from: PG */
/* renamed from: ditc  reason: default package */
/* loaded from: classes6.dex */
public final class ditc extends dsqw<ditc, dita> implements dssk {
    public static final ditc c;
    private static volatile dssr<ditc> f;
    public int a;
    public int b;
    private dnqh d;
    private byte e = 2;

    static {
        ditc ditcVar = new ditc();
        c = ditcVar;
        dsqw.cc(ditc.class, ditcVar);
    }

    private ditc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "d", "b", ditb.a});
            }
            if (i2 == 3) {
                return new ditc();
            }
            if (i2 == 4) {
                return new dita();
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
            dssr<ditc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ditc.class) {
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
