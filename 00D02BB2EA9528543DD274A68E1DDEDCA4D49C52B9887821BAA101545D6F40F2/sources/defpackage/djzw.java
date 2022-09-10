package defpackage;
/* compiled from: PG */
/* renamed from: djzw  reason: default package */
/* loaded from: classes6.dex */
public final class djzw extends dsqw<djzw, djzv> implements dssk {
    public static final djzw b;
    private static volatile dssr<djzw> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<dqem> a = dssu.b;

    static {
        djzw djzwVar = new djzw();
        b = djzwVar;
        dsqw.cc(djzw.class, djzwVar);
    }

    private djzw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"c", "a", dqem.class, "d"});
            }
            if (i2 == 3) {
                return new djzw();
            }
            if (i2 == 4) {
                return new djzv();
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
            dssr<djzw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djzw.class) {
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
