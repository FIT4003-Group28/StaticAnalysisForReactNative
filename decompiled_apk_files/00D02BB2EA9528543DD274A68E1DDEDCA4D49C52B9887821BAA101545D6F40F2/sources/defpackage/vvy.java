package defpackage;
/* compiled from: PG */
/* renamed from: vvy  reason: default package */
/* loaded from: classes7.dex */
public final class vvy extends dsqw<vvy, vvx> implements dssk {
    public static final vvy j;
    private static volatile dssr<vvy> l;
    public int a;
    public dwaw b;
    public dwbc c;
    public long d;
    public vvs e;
    public vvw f;
    public int g;
    public boolean h;
    private byte k = 2;
    public String i = "";

    static {
        vvy vvyVar = new vvy();
        j = vvyVar;
        dsqw.cc(vvy.class, vvyVar);
    }

    private vvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဃ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဋ\u0006\bဇ\u0007\tဈ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new vvy();
            }
            if (i2 == 4) {
                return new vvx();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<vvy> dssrVar = l;
            if (dssrVar == null) {
                synchronized (vvy.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
