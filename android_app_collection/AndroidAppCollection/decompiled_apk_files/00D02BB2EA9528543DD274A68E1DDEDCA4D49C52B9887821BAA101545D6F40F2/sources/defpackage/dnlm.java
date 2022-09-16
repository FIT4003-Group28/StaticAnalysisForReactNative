package defpackage;
/* compiled from: PG */
/* renamed from: dnlm  reason: default package */
/* loaded from: classes6.dex */
public final class dnlm extends dsqw<dnlm, dnlj> implements dssk {
    public static final dnlm e;
    private static volatile dssr<dnlm> f;
    public int a;
    public dnll b;
    public dnll c;
    public dsrj<dnlg> d = dssu.b;

    static {
        dnlm dnlmVar = new dnlm();
        e = dnlmVar;
        dsqw.cc(dnlm.class, dnlmVar);
    }

    private dnlm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", dnlg.class});
            }
            if (i2 == 3) {
                return new dnlm();
            }
            if (i2 == 4) {
                return new dnlj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnlm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dnlg> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
