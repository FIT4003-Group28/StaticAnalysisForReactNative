package defpackage;
/* compiled from: PG */
/* renamed from: dizb  reason: default package */
/* loaded from: classes6.dex */
public final class dizb extends dsqw<dizb, diyu> implements dssk {
    public static final dizb f;
    private static volatile dssr<dizb> h;
    public diyy a;
    public dpuq c;
    public int e;
    private int g;
    public dsrj<diza> b = dssu.b;
    public String d = "";

    static {
        dizb dizbVar = new dizb();
        f = dizbVar;
        dsqw.cc(dizb.class, dizbVar);
    }

    private dizb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဈ\u0002\u0006င\u0003", new Object[]{"g", "a", "b", diza.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dizb();
            }
            if (i2 == 4) {
                return new diyu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dizb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
