package defpackage;
/* compiled from: PG */
/* renamed from: dtho  reason: default package */
/* loaded from: classes6.dex */
public final class dtho extends dsqw<dtho, dthn> implements dssk {
    public static final dtho g;
    private static volatile dssr<dtho> i;
    public int a;
    public dgrn b;
    public int c;
    public int d;
    public int e;
    public int f;
    private byte h = 2;

    static {
        dtho dthoVar = new dtho();
        g = dthoVar;
        dsqw.cc(dtho.class, dthoVar);
    }

    private dtho() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dtho();
            }
            if (i3 == 4) {
                return new dthn();
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
            dssr<dtho> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtho.class) {
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
