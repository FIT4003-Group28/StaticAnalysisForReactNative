package defpackage;
/* compiled from: PG */
/* renamed from: axck  reason: default package */
/* loaded from: classes3.dex */
public final class axck extends dsqw<axck, axcj> implements dssk {
    public static final axck e;
    private static volatile dssr<axck> g;
    public int a;
    public long b;
    public dqsj c;
    public dviq d;
    private byte f = 2;

    static {
        axck axckVar = new axck();
        e = axckVar;
        dsqw.cc(axck.class, axckVar);
    }

    private axck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axck();
            }
            if (i2 == 4) {
                return new axcj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<axck> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axck.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
