package defpackage;
/* compiled from: PG */
/* renamed from: doai  reason: default package */
/* loaded from: classes6.dex */
public final class doai extends dsqw<doai, doah> implements dssk {
    public static final doai d;
    private static volatile dssr<doai> f;
    public String a = "";
    public dsrj<String> b = dssu.b;
    public dsrj<dnpq> c = dssu.b;
    private int e;

    static {
        doai doaiVar = new doai();
        d = doaiVar;
        dsqw.cc(doai.class, doaiVar);
    }

    private doai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b", new Object[]{"e", "a", "b", "c", dnpq.class});
            }
            if (i2 == 3) {
                return new doai();
            }
            if (i2 == 4) {
                return new doah();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doai> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doai.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
