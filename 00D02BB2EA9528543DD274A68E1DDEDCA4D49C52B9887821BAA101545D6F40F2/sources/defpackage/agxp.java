package defpackage;
/* compiled from: PG */
/* renamed from: agxp  reason: default package */
/* loaded from: classes2.dex */
public final class agxp extends dsqw<agxp, agxo> implements dssk {
    public static final agxp h;
    private static volatile dssr<agxp> i;
    public int a;
    public boolean b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f;
    public int g;

    static {
        agxp agxpVar = new agxp();
        h = agxpVar;
        dsqw.cc(agxp.class, agxpVar);
    }

    private agxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0002\u0005ဇ\u0004\u0006ဋ\u0005", new Object[]{"a", "b", "c", "e", "d", "f", "g"});
            }
            if (i3 == 3) {
                return new agxp();
            }
            if (i3 == 4) {
                return new agxo();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<agxp> dssrVar = i;
            if (dssrVar == null) {
                synchronized (agxp.class) {
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
