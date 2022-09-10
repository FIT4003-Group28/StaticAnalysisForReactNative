package defpackage;
/* compiled from: PG */
/* renamed from: dhoz  reason: default package */
/* loaded from: classes6.dex */
public final class dhoz extends dsqw<dhoz, dhow> implements dssk {
    public static final dhoz c;
    private static volatile dssr<dhoz> f;
    public int a;
    public dhoy b;
    private dnqh d;
    private byte e = 2;

    static {
        dhoz dhozVar = new dhoz();
        c = dhozVar;
        dsqw.cc(dhoz.class, dhozVar);
    }

    private dhoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dhoz();
            }
            if (i2 == 4) {
                return new dhow();
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
            dssr<dhoz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhoz.class) {
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
