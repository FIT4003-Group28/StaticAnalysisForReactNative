package defpackage;
/* compiled from: PG */
/* renamed from: dlrj  reason: default package */
/* loaded from: classes6.dex */
public final class dlrj extends dsqw<dlrj, dlri> implements dssk {
    public static final dlrj e;
    private static volatile dssr<dlrj> h;
    public dlqm c;
    public boolean d;
    private int f;
    private byte g = 2;
    public dsrj<dlua> a = dssu.b;
    public dsrj<dltm> b = dssu.b;

    static {
        dlrj dlrjVar = new dlrj();
        e = dlrjVar;
        dsqw.cc(dlrj.class, dlrjVar);
    }

    private dlrj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0002\u0002\u0001\u001b\u0002Л\u0006ᐉ\u0002\u0007ဇ\u0003", new Object[]{"f", "a", dlua.class, "b", dltm.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dlrj();
            }
            if (i2 == 4) {
                return new dlri();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dlrj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlrj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
