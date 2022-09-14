package defpackage;
/* compiled from: PG */
/* renamed from: dwxj  reason: default package */
/* loaded from: classes6.dex */
public final class dwxj extends dsqw<dwxj, dwxi> implements dssk {
    public static final dwxj e;
    private static volatile dssr<dwxj> g;
    public int a;
    public Object c;
    public dvyw d;
    public int b = 0;
    private byte f = 2;

    static {
        dwxj dwxjVar = new dwxj();
        e = dwxjVar;
        dsqw.cc(dwxj.class, dwxjVar);
    }

    private dwxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဵ\u0000\u0005ဵ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new dwxj();
            }
            if (i2 == 4) {
                return new dwxi();
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
            dssr<dwxj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwxj.class) {
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
