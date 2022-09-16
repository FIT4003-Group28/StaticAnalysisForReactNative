package defpackage;
/* compiled from: PG */
/* renamed from: dolm  reason: default package */
/* loaded from: classes6.dex */
public final class dolm extends dsqw<dolm, doll> implements dssk {
    public static final dolm f;
    private static volatile dssr<dolm> g;
    public int a;
    public dppl b;
    public String c = "";
    public dolk d;
    public dojz e;

    static {
        dolm dolmVar = new dolm();
        f = dolmVar;
        dsqw.cc(dolm.class, dolmVar);
    }

    private dolm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", "d", "e", "c"});
            }
            if (i2 == 3) {
                return new dolm();
            }
            if (i2 == 4) {
                return new doll();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dolm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
