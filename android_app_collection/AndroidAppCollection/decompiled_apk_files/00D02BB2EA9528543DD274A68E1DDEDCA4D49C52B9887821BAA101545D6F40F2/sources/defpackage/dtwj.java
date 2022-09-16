package defpackage;
/* compiled from: PG */
/* renamed from: dtwj  reason: default package */
/* loaded from: classes6.dex */
public final class dtwj extends dsqw<dtwj, dtwh> implements dssk {
    public static final dtwj f;
    private static volatile dssr<dtwj> g;
    public dtvy a;
    public dtva b;
    public String c = "";
    public dsrf d = dsqz.b;
    public String e = "";

    static {
        dtwj dtwjVar = new dtwj();
        f = dtwjVar;
        dsqw.cc(dtwj.class, dtwjVar);
    }

    private dtwj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003Ȉ\u0004,\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtwj();
            }
            if (i2 == 4) {
                return new dtwh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtwj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
