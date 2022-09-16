package defpackage;
/* compiled from: PG */
/* renamed from: dmme  reason: default package */
/* loaded from: classes.dex */
public final class dmme extends dsqw<dmme, dmmb> implements dssk {
    public static final dmme d;
    private static volatile dssr<dmme> e;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;
    public dsrj<dmmd> c = dssu.b;

    static {
        dmme dmmeVar = new dmme();
        d = dmmeVar;
        dsqw.cc(dmme.class, dmmeVar);
    }

    private dmme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002'\u0003\u001b", new Object[]{"a", "b", "c", dmmd.class});
            }
            if (i2 == 3) {
                return new dmme();
            }
            if (i2 == 4) {
                return new dmmb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmme> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmme.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
