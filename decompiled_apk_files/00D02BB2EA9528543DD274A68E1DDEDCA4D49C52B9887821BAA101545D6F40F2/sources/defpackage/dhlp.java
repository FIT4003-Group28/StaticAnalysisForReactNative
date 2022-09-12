package defpackage;
/* compiled from: PG */
/* renamed from: dhlp  reason: default package */
/* loaded from: classes6.dex */
public final class dhlp extends dsqw<dhlp, dhlm> implements dssk {
    public static final dhlp e;
    private static volatile dssr<dhlp> g;
    public int a;
    public dnqh d;
    private byte f = 2;
    public String b = "";
    public dsrj<dhlo> c = dssu.b;

    static {
        dhlp dhlpVar = new dhlp();
        e = dhlpVar;
        dsqw.cc(dhlp.class, dhlpVar);
    }

    private dhlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001b\u0003ᐉ\u0001", new Object[]{"a", "b", "c", dhlo.class, "d"});
            }
            if (i2 == 3) {
                return new dhlp();
            }
            if (i2 == 4) {
                return new dhlm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhlp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhlp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
