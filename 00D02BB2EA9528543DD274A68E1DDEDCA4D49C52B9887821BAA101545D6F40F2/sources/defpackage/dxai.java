package defpackage;
/* compiled from: PG */
/* renamed from: dxai  reason: default package */
/* loaded from: classes6.dex */
public final class dxai extends dsqw<dxai, dxah> implements dssk {
    public static final dxai e;
    private static volatile dssr<dxai> g;
    public int a;
    public long b;
    private byte f = 2;
    public String c = "";
    public String d = "";

    static {
        dxai dxaiVar = new dxai();
        e = dxaiVar;
        dsqw.cc(dxai.class, dxaiVar);
    }

    private dxai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0001\u0002စ\u0000\u0004ᔈ\u0001\tဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxai();
            }
            if (i2 == 4) {
                return new dxah();
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
            dssr<dxai> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxai.class) {
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
