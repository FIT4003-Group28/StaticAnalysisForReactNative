package defpackage;
/* compiled from: PG */
/* renamed from: dnfm  reason: default package */
/* loaded from: classes6.dex */
public final class dnfm extends dsqw<dnfm, dnfj> implements dssk {
    public static final dnfm h;
    private static volatile dssr<dnfm> i;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<dnfl> d;
    public boolean e;
    public dnpq f;
    public dnwd g;

    static {
        dnfm dnfmVar = new dnfm();
        h = dnfmVar;
        dsqw.cc(dnfm.class, dnfmVar);
    }

    private dnfm() {
        dssu<Object> dssuVar = dssu.b;
        this.d = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0006\u001b\u0007ဇ\u0005\bဉ\u0007\tဈ\u0003\nဉ\u0006", new Object[]{"a", "b", "d", dnfl.class, "e", "g", "c", "f"});
            }
            if (i3 == 3) {
                return new dnfm();
            }
            if (i3 == 4) {
                return new dnfj();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnfm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnfm.class) {
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
