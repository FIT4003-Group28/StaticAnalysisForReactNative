package defpackage;
/* compiled from: PG */
/* renamed from: dmmi  reason: default package */
/* loaded from: classes.dex */
public final class dmmi extends dsqw<dmmi, dmmh> implements dssk {
    public static final dmmi c;
    private static volatile dssr<dmmi> e;
    public dsrj<dmmg> a = dssu.b;
    public int b = 2;
    private int d;

    static {
        dmmi dmmiVar = new dmmi();
        c = dmmiVar;
        dsqw.cc(dmmi.class, dmmiVar);
    }

    private dmmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", dmmg.class, "b", dmmj.a});
            }
            if (i2 == 3) {
                return new dmmi();
            }
            if (i2 == 4) {
                return new dmmh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmmi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmmi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
