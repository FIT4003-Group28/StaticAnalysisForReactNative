package defpackage;
/* compiled from: PG */
/* renamed from: bzjq  reason: default package */
/* loaded from: classes4.dex */
public final class bzjq extends dsqw<bzjq, bzjp> implements dssk {
    public static final bzjq b;
    private static volatile dssr<bzjq> c;
    public dsri a = dsrx.b;

    static {
        bzjq bzjqVar = new bzjq();
        b = bzjqVar;
        dsqw.cc(bzjq.class, bzjqVar);
    }

    private bzjq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new bzjq();
            }
            if (i2 == 4) {
                return new bzjp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzjq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bzjq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsri dsriVar = this.a;
        if (!dsriVar.a()) {
            this.a = dsqw.ci(dsriVar);
        }
    }
}
