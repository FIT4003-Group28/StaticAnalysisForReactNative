package defpackage;
/* compiled from: PG */
/* renamed from: dwpc  reason: default package */
/* loaded from: classes6.dex */
public final class dwpc extends dsqw<dwpc, dwpb> implements dssk {
    public static final dwpc e;
    private static volatile dssr<dwpc> f;
    public int a;
    public dpum c;
    public String b = "";
    public dspd d = dspd.b;

    static {
        dwpc dwpcVar = new dwpc();
        e = dwpcVar;
        dsqw.cc(dwpc.class, dwpcVar);
    }

    private dwpc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0002\u0003ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dwpc();
            }
            if (i2 == 4) {
                return new dwpb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwpc.class) {
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
