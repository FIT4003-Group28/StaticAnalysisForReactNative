package defpackage;
/* compiled from: PG */
/* renamed from: dkpc  reason: default package */
/* loaded from: classes.dex */
public final class dkpc extends dsqw<dkpc, dkpb> implements dssk {
    public static final dkpc f;
    private static volatile dssr<dkpc> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dkpc dkpcVar = new dkpc();
        f = dkpcVar;
        dsqw.cc(dkpc.class, dkpcVar);
    }

    private dkpc() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0006\nဇ\u0005", new Object[]{"g", "a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new dkpc();
            }
            if (i2 == 4) {
                return new dkpb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkpc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
