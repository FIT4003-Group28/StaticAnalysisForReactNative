package defpackage;
/* compiled from: PG */
/* renamed from: djxy  reason: default package */
/* loaded from: classes6.dex */
public final class djxy extends dsqw<djxy, djxt> implements dssk {
    public static final djxy b;
    private static volatile dssr<djxy> d;
    private byte c = 2;
    public dsrj<djxx> a = dssu.b;

    static {
        djxy djxyVar = new djxy();
        b = djxyVar;
        dsqw.cc(djxy.class, djxyVar);
    }

    private djxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", djxx.class});
            }
            if (i2 == 3) {
                return new djxy();
            }
            if (i2 == 4) {
                return new djxt();
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
            dssr<djxy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djxy.class) {
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
