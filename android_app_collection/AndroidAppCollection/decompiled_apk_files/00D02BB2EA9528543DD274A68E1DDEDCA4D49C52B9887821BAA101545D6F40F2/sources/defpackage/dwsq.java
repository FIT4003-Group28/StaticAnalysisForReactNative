package defpackage;
/* compiled from: PG */
/* renamed from: dwsq  reason: default package */
/* loaded from: classes6.dex */
public final class dwsq extends dsqw<dwsq, dwsp> implements dssk {
    public static final dwsq d;
    private static volatile dssr<dwsq> e;
    public int a;
    public dspd b = dspd.b;
    public dsrj<dwrg> c = dssu.b;

    static {
        dwsq dwsqVar = new dwsq();
        d = dwsqVar;
        dsqw.cc(dwsq.class, dwsqVar);
    }

    private dwsq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u001b", new Object[]{"a", "b", "c", dwrg.class});
            }
            if (i2 == 3) {
                return new dwsq();
            }
            if (i2 == 4) {
                return new dwsp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwsq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
