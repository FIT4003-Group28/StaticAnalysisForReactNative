package defpackage;
/* compiled from: PG */
/* renamed from: dijx  reason: default package */
/* loaded from: classes6.dex */
public final class dijx extends dsqw<dijx, dijw> implements dssk {
    public static final dijx d;
    private static volatile dssr<dijx> f;
    public int a;
    public duld c;
    private byte e = 2;
    public dsrj<dulb> b = dssu.b;

    static {
        dijx dijxVar = new dijx();
        d = dijxVar;
        dsqw.cc(dijx.class, dijxVar);
    }

    private dijx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", dulb.class, "c"});
            }
            if (i2 == 3) {
                return new dijx();
            }
            if (i2 == 4) {
                return new dijw();
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
            dssr<dijx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dijx.class) {
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
