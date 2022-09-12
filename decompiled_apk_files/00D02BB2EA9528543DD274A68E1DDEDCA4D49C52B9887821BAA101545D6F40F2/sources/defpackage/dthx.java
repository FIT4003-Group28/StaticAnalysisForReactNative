package defpackage;
/* compiled from: PG */
/* renamed from: dthx  reason: default package */
/* loaded from: classes6.dex */
public final class dthx extends dsqw<dthx, dthm> implements dssk {
    public static final dthx g;
    private static volatile dssr<dthx> j;
    public int a;
    private int h;
    private byte i = 2;
    public dsrj<dthl> b = dssu.b;
    public dsrj<dthu> c = dssu.b;
    public dsrj<dtho> d = dssu.b;
    public dsri e = dsrx.b;
    public dsrj<dthw> f = dssu.b;

    static {
        dthx dthxVar = new dthx();
        g = dthxVar;
        dsqw.cc(dthx.class, dthxVar);
    }

    private dthx() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0005\u0002\u0001ဌ\u0000\u0002\u001b\u0003Л\u0005Л\b\u0017\t\u001b", new Object[]{"h", "a", dthp.a, "b", dthl.class, "c", dthu.class, "d", dtho.class, "e", "f", dthw.class});
            }
            if (i2 == 3) {
                return new dthx();
            }
            if (i2 == 4) {
                return new dthm();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dthx> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dthx.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
