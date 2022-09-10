package defpackage;
/* compiled from: PG */
/* renamed from: dwnf  reason: default package */
/* loaded from: classes6.dex */
public final class dwnf extends dsqw<dwnf, dwne> implements dssk {
    public static final dwnf f;
    private static volatile dssr<dwnf> h;
    public int a;
    public dqkf e;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public dsrj<dwmx> d = dssu.b;

    static {
        dwnf dwnfVar = new dwnf();
        f = dwnfVar;
        dsqw.cc(dwnf.class, dwnfVar);
    }

    private dwnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0001\u0001ဈ\u0001\u0002Л\u0003ဈ\u0000\u0007ဉ\u0003", new Object[]{"a", "c", "d", dwmx.class, "b", "e"});
            }
            if (i2 == 3) {
                return new dwnf();
            }
            if (i2 == 4) {
                return new dwne();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwnf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwnf.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
