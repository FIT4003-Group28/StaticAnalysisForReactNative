package defpackage;
/* compiled from: PG */
/* renamed from: dxbo  reason: default package */
/* loaded from: classes6.dex */
public final class dxbo extends dsqw<dxbo, dxbn> implements dssk {
    public static final dxbo d;
    private static volatile dssr<dxbo> g;
    public dsrj<dxbm> a;
    public int b;
    public String c;
    private int e;
    private byte f = 2;

    static {
        dxbo dxboVar = new dxbo();
        d = dxboVar;
        dsqw.cc(dxbo.class, dxboVar);
    }

    private dxbo() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002Л\u0003င\u0000\u0004ဈ\u0001", new Object[]{"e", "a", dxbm.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dxbo();
            }
            if (i2 == 4) {
                return new dxbn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dxbo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxbo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
