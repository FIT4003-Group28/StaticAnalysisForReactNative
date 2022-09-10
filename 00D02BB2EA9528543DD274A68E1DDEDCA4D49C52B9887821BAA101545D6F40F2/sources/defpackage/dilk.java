package defpackage;
/* compiled from: PG */
/* renamed from: dilk  reason: default package */
/* loaded from: classes6.dex */
public final class dilk extends dsqw<dilk, dilh> implements dssk {
    public static final dilk b;
    private static volatile dssr<dilk> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<dilj> a = dssu.b;

    static {
        dilk dilkVar = new dilk();
        b = dilkVar;
        dsqw.cc(dilk.class, dilkVar);
    }

    private dilk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u001b\u0003ᐉ\u0000", new Object[]{"c", "a", dilj.class, "d"});
            }
            if (i2 == 3) {
                return new dilk();
            }
            if (i2 == 4) {
                return new dilh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<dilk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dilk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
