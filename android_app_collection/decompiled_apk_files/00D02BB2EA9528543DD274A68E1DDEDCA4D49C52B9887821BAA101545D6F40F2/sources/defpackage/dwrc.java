package defpackage;
/* compiled from: PG */
/* renamed from: dwrc  reason: default package */
/* loaded from: classes6.dex */
public final class dwrc extends dsqw<dwrc, dwqj> implements dssk {
    public static final dwrc k;
    private static volatile dssr<dwrc> l;
    public int a;
    public dwqz c;
    public dwqp g;
    public dwql h;
    public dwrv i;
    public int j;
    public dspd b = dspd.b;
    public String d = "";
    public dsrj<dwqt> e = dssu.b;
    public dsrj<dwqt> f = dssu.b;

    static {
        dwrc dwrcVar = new dwrc();
        k = dwrcVar;
        dsqw.cc(dwrc.class, dwrcVar);
    }

    private dwrc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0000\u0001ည\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005\u001b\u0006\u001b\bဉ\u0004\tဉ\u0006\nဉ\u0003\u000bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", dwqt.class, "f", dwqt.class, "h", "i", "g", "j", dwra.a});
            }
            if (i2 == 3) {
                return new dwrc();
            }
            if (i2 == 4) {
                return new dwqj();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrc> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dwrc.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
