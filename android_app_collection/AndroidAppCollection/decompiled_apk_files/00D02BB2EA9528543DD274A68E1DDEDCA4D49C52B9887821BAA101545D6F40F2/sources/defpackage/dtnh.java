package defpackage;
/* compiled from: PG */
/* renamed from: dtnh  reason: default package */
/* loaded from: classes6.dex */
public final class dtnh extends dsqs<dtnh, dtne> implements dsqt {
    public static final dtnh g;
    private static volatile dssr<dtnh> i;
    public int a;
    public int b;
    public dtis d;
    public dtjh f;
    private byte h = 2;
    public dsrj<dtmr> c = dssu.b;
    public String e = "";

    static {
        dtnh dtnhVar = new dtnh();
        g = dtnhVar;
        dsqw.cc(dtnh.class, dtnhVar);
    }

    private dtnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001Ϭ\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0003Л\u0006ဉ\u0003\bဈ\u0004Ϭဉ\u0007", new Object[]{"a", "b", dtnf.a, "c", dtmr.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dtnh();
            }
            if (i3 == 4) {
                return new dtne();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtnh> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtnh.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
