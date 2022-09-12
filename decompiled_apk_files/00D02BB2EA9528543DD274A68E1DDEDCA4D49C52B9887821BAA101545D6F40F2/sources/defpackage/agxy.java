package defpackage;
/* compiled from: PG */
/* renamed from: agxy  reason: default package */
/* loaded from: classes2.dex */
public final class agxy extends dsqw<agxy, agxx> implements dssk {
    public static final agxy d;
    private static volatile dssr<agxy> f;
    public int a;
    public int b;
    public dlcc c;
    private byte e = 2;

    static {
        agxy agxyVar = new agxy();
        d = agxyVar;
        dsqw.cc(agxy.class, agxyVar);
    }

    private agxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new agxy();
            }
            if (i2 == 4) {
                return new agxx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<agxy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (agxy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
