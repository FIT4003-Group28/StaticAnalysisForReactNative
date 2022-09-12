package defpackage;
/* compiled from: PG */
/* renamed from: dffq  reason: default package */
/* loaded from: classes6.dex */
public final class dffq extends dsqw<dffq, dffp> implements dssk {
    public static final dffq c;
    private static volatile dssr<dffq> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dffq dffqVar = new dffq();
        c = dffqVar;
        dsqw.cc(dffq.class, dffqVar);
    }

    private dffq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", dffo.class, drte.class});
            }
            if (i2 == 3) {
                return new dffq();
            }
            if (i2 == 4) {
                return new dffp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dffq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dffq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
