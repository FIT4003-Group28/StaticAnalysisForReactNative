package defpackage;
/* compiled from: PG */
/* renamed from: dzzn  reason: default package */
/* loaded from: classes.dex */
public final class dzzn extends dsqs<dzzn, dzzl> implements dsqt {
    public static final dzzn g;
    private static volatile dssr<dzzn> i;
    public int a;
    public dzzk b;
    public eaav c;
    public int d;
    public dzzi e;
    private byte h = 2;
    public String f = "";

    static {
        dzzn dzznVar = new dzzn();
        g = dzznVar;
        dsqw.cc(dzzn.class, dzznVar);
    }

    private dzzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", dzzm.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dzzn();
            }
            if (i3 == 4) {
                return new dzzl();
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
            dssr<dzzn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dzzn.class) {
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
