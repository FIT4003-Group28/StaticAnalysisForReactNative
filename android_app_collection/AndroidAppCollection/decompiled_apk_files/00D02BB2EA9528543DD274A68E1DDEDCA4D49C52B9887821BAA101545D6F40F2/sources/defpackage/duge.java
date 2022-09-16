package defpackage;
/* compiled from: PG */
/* renamed from: duge  reason: default package */
/* loaded from: classes6.dex */
public final class duge extends dsqw<duge, dugd> implements dssk {
    public static final duge e;
    private static volatile dssr<duge> g;
    public dugi a;
    public String b = "";
    public dsrj<dugg> c = dssu.b;
    public dsrj<dugm> d = dssu.b;
    private int f;

    static {
        duge dugeVar = new duge();
        e = dugeVar;
        dsqw.cc(duge.class, dugeVar);
    }

    private duge() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001b\u0006\u001b", new Object[]{"f", "a", "b", "c", dugg.class, "d", dugm.class});
            }
            if (i2 == 3) {
                return new duge();
            }
            if (i2 == 4) {
                return new dugd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duge> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duge.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
