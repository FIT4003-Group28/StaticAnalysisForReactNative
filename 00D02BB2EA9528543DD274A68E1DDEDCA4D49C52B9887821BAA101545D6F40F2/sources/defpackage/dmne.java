package defpackage;
/* compiled from: PG */
/* renamed from: dmne  reason: default package */
/* loaded from: classes.dex */
public final class dmne extends dsqw<dmne, dmmx> implements dssk {
    public static final dmne l;
    private static volatile dssr<dmne> m;
    public int a;
    public dsrj<dmsl> b = dssu.b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;

    static {
        dmne dmneVar = new dmne();
        l = dmneVar;
        dsqw.cc(dmne.class, dmneVar);
    }

    private dmne() {
        dsqz dsqzVar = dsqz.b;
        this.g = "";
        this.h = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0001\u0000\u0001\u001b\u0002ဆ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0007ဈ\u0005\nဈ\u0007\fဌ\t\rဌ\n\u000eဌ\u000b", new Object[]{"a", "b", dmsl.class, "c", "d", "e", "f", "g", "h", "i", dmnd.c(), "j", dmmz.c(), "k", dmnb.c()});
            }
            if (i2 == 3) {
                return new dmne();
            }
            if (i2 == 4) {
                return new dmmx();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmne> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dmne.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
