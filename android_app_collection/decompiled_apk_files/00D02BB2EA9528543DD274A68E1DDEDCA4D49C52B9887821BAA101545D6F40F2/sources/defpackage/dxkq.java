package defpackage;
/* compiled from: PG */
/* renamed from: dxkq  reason: default package */
/* loaded from: classes6.dex */
public final class dxkq extends dsqw<dxkq, dxkp> implements dssk {
    public static final dxkq f;
    private static volatile dssr<dxkq> g;
    public int d;
    public String a = "";
    public String b = "";
    public dsrj<dxko> c = dssu.b;
    public String e = "";

    static {
        dxkq dxkqVar = new dxkq();
        f = dxkqVar;
        dsqw.cc(dxkq.class, dxkqVar);
    }

    private dxkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005\f\u0007Ȉ", new Object[]{"a", "b", "c", dxko.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dxkq();
            }
            if (i2 == 4) {
                return new dxkp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxkq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxkq.class) {
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
