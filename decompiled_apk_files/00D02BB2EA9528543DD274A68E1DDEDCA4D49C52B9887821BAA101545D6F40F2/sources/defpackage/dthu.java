package defpackage;
/* compiled from: PG */
/* renamed from: dthu  reason: default package */
/* loaded from: classes6.dex */
public final class dthu extends dsqw<dthu, dtht> implements dssk {
    public static final dthu g;
    private static volatile dssr<dthu> i;
    public int a;
    public int c;
    public int d;
    public int e;
    public int f;
    private byte h = 2;
    public dsrj<dgrt> b = dssu.b;

    static {
        dthu dthuVar = new dthu();
        g = dthuVar;
        dsqw.cc(dthu.class, dthuVar);
    }

    private dthu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003ဌ\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", dgrt.class, "c", dths.c(), "d", dths.c(), "e", "f"});
            }
            if (i3 == 3) {
                return new dthu();
            }
            if (i3 == 4) {
                return new dtht();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dthu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dthu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
