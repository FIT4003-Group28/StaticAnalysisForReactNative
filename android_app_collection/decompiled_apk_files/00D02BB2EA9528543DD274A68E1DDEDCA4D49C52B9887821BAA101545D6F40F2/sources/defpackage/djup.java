package defpackage;
/* compiled from: PG */
/* renamed from: djup  reason: default package */
/* loaded from: classes.dex */
public final class djup extends dsqw<djup, djuo> implements dssk {
    public static final djup b;
    private static volatile dssr<djup> d;
    private byte c = 2;
    public dsrj<djck> a = dssu.b;

    static {
        djup djupVar = new djup();
        b = djupVar;
        dsqw.cc(djup.class, djupVar);
    }

    private djup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", djck.class});
            }
            if (i2 == 3) {
                return new djup();
            }
            if (i2 == 4) {
                return new djuo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<djup> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djup.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
