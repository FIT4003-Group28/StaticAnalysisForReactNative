package defpackage;
/* compiled from: PG */
/* renamed from: dixk  reason: default package */
/* loaded from: classes6.dex */
public final class dixk extends dsqw<dixk, dixj> implements dssk {
    public static final dixk b;
    private static volatile dssr<dixk> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<djvj> a = dssu.b;

    static {
        dixk dixkVar = new dixk();
        b = dixkVar;
        dsqw.cc(dixk.class, dixkVar);
    }

    private dixk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u001b\u0003ᐉ\u0001", new Object[]{"c", "a", djvj.class, "d"});
            }
            if (i2 == 3) {
                return new dixk();
            }
            if (i2 == 4) {
                return new dixj();
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
            dssr<dixk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dixk.class) {
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
