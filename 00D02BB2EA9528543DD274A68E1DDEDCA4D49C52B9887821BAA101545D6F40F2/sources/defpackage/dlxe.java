package defpackage;
/* compiled from: PG */
/* renamed from: dlxe  reason: default package */
/* loaded from: classes.dex */
public final class dlxe extends dsqw<dlxe, dlxb> implements dssk {
    public static final dlxe f;
    private static volatile dssr<dlxe> h;
    public dsrj<dlxd> a = dssu.b;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        dlxe dlxeVar = new dlxe();
        f = dlxeVar;
        dsqw.cc(dlxe.class, dlxeVar);
    }

    private dlxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"g", "a", dlxd.class, "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dlxe();
            }
            if (i2 == 4) {
                return new dlxb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlxe.class) {
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
