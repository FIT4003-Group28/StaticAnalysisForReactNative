package defpackage;
/* compiled from: PG */
/* renamed from: dnxr  reason: default package */
/* loaded from: classes6.dex */
public final class dnxr extends dsqw<dnxr, dnxo> implements dssk {
    public static final dnxr c;
    private static volatile dssr<dnxr> f;
    public dqtl b;
    private int d;
    private byte e = 2;
    public dsrj<dnxq> a = dssu.b;

    static {
        dnxr dnxrVar = new dnxr();
        c = dnxrVar;
        dsqw.cc(dnxr.class, dnxrVar);
    }

    private dnxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004ဉ\u0001", new Object[]{"d", "a", dnxq.class, "b"});
            }
            if (i2 == 3) {
                return new dnxr();
            }
            if (i2 == 4) {
                return new dnxo();
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
            dssr<dnxr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnxr.class) {
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
