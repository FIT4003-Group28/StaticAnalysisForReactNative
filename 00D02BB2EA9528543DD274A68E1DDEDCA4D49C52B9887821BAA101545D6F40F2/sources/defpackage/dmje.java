package defpackage;
/* compiled from: PG */
/* renamed from: dmje  reason: default package */
/* loaded from: classes6.dex */
public final class dmje extends dsqw<dmje, dmjc> implements dssk {
    public static final dmje b;
    public static final dsqv<dmfs, dmje> c;
    private static volatile dssr<dmje> d;
    public dssd<String, String> a = dssd.b;

    static {
        dmje dmjeVar = new dmje();
        b = dmjeVar;
        dsqw.cc(dmje.class, dmjeVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmjeVar, dmjeVar, null, 1033, dsur.MESSAGE, dmje.class);
    }

    private dmje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", dmjd.a});
            }
            if (i2 == 3) {
                return new dmje();
            }
            if (i2 == 4) {
                return new dmjc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmje> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmje.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
