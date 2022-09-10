package defpackage;
/* compiled from: PG */
/* renamed from: dwsi  reason: default package */
/* loaded from: classes6.dex */
public final class dwsi extends dsqw<dwsi, dwsh> implements dssk {
    public static final dwsi e;
    private static volatile dssr<dwsi> f;
    public int a;
    public dspd b = dspd.b;
    public dsrj<dwrg> c;
    public int d;

    static {
        dwsi dwsiVar = new dwsi();
        e = dwsiVar;
        dsqw.cc(dwsi.class, dwsiVar);
    }

    private dwsi() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ည\u0000\u0003\u001b\u0004ဌ\u0001", new Object[]{"a", "b", "c", dwrg.class, "d", dwrx.c()});
            }
            if (i2 == 3) {
                return new dwsi();
            }
            if (i2 == 4) {
                return new dwsh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwsi.class) {
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
}
