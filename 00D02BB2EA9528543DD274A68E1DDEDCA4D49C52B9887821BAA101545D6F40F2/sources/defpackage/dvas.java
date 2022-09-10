package defpackage;
/* compiled from: PG */
/* renamed from: dvas  reason: default package */
/* loaded from: classes6.dex */
public final class dvas extends dsqw<dvas, dvar> implements dssk {
    public static final dvas g;
    private static volatile dssr<dvas> i;
    public int a;
    public dvyw b;
    public dpum d;
    private byte h = 2;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        dvas dvasVar = new dvas();
        g = dvasVar;
        dsqw.cc(dvas.class, dvasVar);
    }

    private dvas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0001", new Object[]{"a", "b", "d", "e", "f", "c"});
            }
            if (i3 == 3) {
                return new dvas();
            }
            if (i3 == 4) {
                return new dvar();
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
            dssr<dvas> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvas.class) {
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
