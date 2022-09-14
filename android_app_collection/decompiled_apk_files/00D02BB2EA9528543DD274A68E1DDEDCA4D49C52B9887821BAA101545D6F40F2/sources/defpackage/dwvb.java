package defpackage;
/* compiled from: PG */
/* renamed from: dwvb  reason: default package */
/* loaded from: classes6.dex */
public final class dwvb extends dsqw<dwvb, dwva> implements dssk {
    public static final dwvb e;
    private static volatile dssr<dwvb> f;
    public int a;
    public dspd b = dspd.b;
    public dwst c;
    public dvnk d;

    static {
        dwvb dwvbVar = new dwvb();
        e = dwvbVar;
        dsqw.cc(dwvb.class, dwvbVar);
    }

    private dwvb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0012\u0003\u0000\u0000\u0000\u0001ည\u0000\u0006ဉ\u0005\u0012ဉ\u0011", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwvb();
            }
            if (i2 == 4) {
                return new dwva();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwvb.class) {
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
