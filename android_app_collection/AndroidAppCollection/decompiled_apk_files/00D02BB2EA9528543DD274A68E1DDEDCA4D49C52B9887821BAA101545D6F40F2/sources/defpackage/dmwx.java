package defpackage;
/* compiled from: PG */
/* renamed from: dmwx  reason: default package */
/* loaded from: classes.dex */
public final class dmwx extends dsqs<dmwx, dmwu> implements dsqt {
    public static final dmwx g;
    private static volatile dssr<dmwx> i;
    public int a;
    public int b;
    public int d;
    public dnbi f;
    private byte h = 2;
    public String c = "";
    public dsrj<dmwt> e = dssu.b;

    static {
        dmwx dmwxVar = new dmwx();
        g = dmwxVar;
        dsqw.cc(dmwx.class, dmwxVar);
    }

    private dmwx() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004Л\bᐉ\u0007", new Object[]{"a", "b", dmwv.a, "c", "d", "e", dmwt.class, "f"});
            }
            if (i3 == 3) {
                return new dmwx();
            }
            if (i3 == 4) {
                return new dmwu();
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
            dssr<dmwx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmwx.class) {
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
