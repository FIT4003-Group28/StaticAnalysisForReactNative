package defpackage;
/* compiled from: PG */
/* renamed from: dmcc  reason: default package */
/* loaded from: classes6.dex */
public final class dmcc extends dsqw<dmcc, dmcb> implements dssk {
    public static final dmcc i;
    private static volatile dssr<dmcc> j;
    public int a;
    public boolean d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public dsrj<drew> g = dssu.b;
    public dsrj<drew> h = dssu.b;

    static {
        dmcc dmccVar = new dmcc();
        i = dmccVar;
        dsqw.cc(dmcc.class, dmccVar);
    }

    private dmcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0004\u0003\u001b\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဈ\u0005\b\u001b", new Object[]{"a", "b", "e", "g", drew.class, "c", "d", "f", "h", drew.class});
            }
            if (i3 == 3) {
                return new dmcc();
            }
            if (i3 == 4) {
                return new dmcb();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmcc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmcc.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
