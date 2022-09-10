package defpackage;
/* compiled from: PG */
/* renamed from: djoq  reason: default package */
/* loaded from: classes6.dex */
public final class djoq extends dsqs<djoq, djop> implements dsqt {
    public static final djoq b;
    private static volatile dssr<djoq> e;
    public dnwb a;
    private int c;
    private byte d = 2;

    static {
        djoq djoqVar = new djoq();
        b = djoqVar;
        dsqw.cc(djoq.class, djoqVar);
    }

    private djoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djoq();
            }
            if (i2 == 4) {
                return new djop();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<djoq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djoq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
