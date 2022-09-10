package defpackage;
/* compiled from: PG */
/* renamed from: drte  reason: default package */
/* loaded from: classes6.dex */
public final class drte extends dsqw<drte, drtd> implements dssk {
    public static final drte g;
    private static volatile dssr<drte> i;
    public int a;
    public int b;
    public int e;
    public dtro f;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        drte drteVar = new drte();
        g = drteVar;
        dsqw.cc(drte.class, drteVar);
    }

    private drte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006င\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            }
            if (i3 == 3) {
                return new drte();
            }
            if (i3 == 4) {
                return new drtd();
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
            dssr<drte> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drte.class) {
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
