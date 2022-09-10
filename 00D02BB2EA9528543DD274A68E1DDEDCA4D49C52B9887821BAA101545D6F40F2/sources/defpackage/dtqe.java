package defpackage;
/* compiled from: PG */
/* renamed from: dtqe  reason: default package */
/* loaded from: classes6.dex */
public final class dtqe extends dsqw<dtqe, dtqb> implements dssk {
    public static final dtqe f;
    private static volatile dssr<dtqe> h;
    public int a;
    public dtkq b;
    public dtqd d;
    private byte g = 2;
    public dsrj<dtqd> c = dssu.b;
    public dsrj<dtid> e = dssu.b;

    static {
        dtqe dtqeVar = new dtqe();
        f = dtqeVar;
        dsqw.cc(dtqe.class, dtqeVar);
    }

    private dtqe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0002\u0003\u0001Л\u0002ᐉ\u0002\u0004ဉ\u0001\u000fЛ", new Object[]{"a", "c", dtqd.class, "d", "b", "e", dtid.class});
            }
            if (i2 == 3) {
                return new dtqe();
            }
            if (i2 == 4) {
                return new dtqb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dtqe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtqe.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
