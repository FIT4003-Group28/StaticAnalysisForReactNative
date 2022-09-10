package defpackage;
/* compiled from: PG */
/* renamed from: djox  reason: default package */
/* loaded from: classes6.dex */
public final class djox extends dsqw<djox, djow> implements dssk {
    public static final djox h;
    private static volatile dssr<djox> i;
    public int a;
    public int c;
    public drat e;
    public int f;
    public String b = "";
    public String d = "";
    public dsrj<drar> g = dssu.b;

    static {
        djox djoxVar = new djox();
        h = djoxVar;
        dsqw.cc(djox.class, djoxVar);
    }

    private djox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဌ\u0004\u0004\u001b\u0006ဉ\u0003\u0007ဌ\u0001", new Object[]{"a", "b", "d", "f", drau.a, "g", drar.class, "e", "c", dgfb.c()});
            }
            if (i3 == 3) {
                return new djox();
            }
            if (i3 == 4) {
                return new djow();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djox> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djox.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
