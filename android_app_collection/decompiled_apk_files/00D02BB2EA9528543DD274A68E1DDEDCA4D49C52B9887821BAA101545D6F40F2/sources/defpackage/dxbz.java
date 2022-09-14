package defpackage;
/* compiled from: PG */
/* renamed from: dxbz  reason: default package */
/* loaded from: classes6.dex */
public final class dxbz extends dsqw<dxbz, dxbw> implements dssk {
    public static final dxbz f;
    private static volatile dssr<dxbz> h;
    public int a;
    public long c;
    public String d;
    public dxbv e;
    private byte g = 2;
    public int b = 1;

    static {
        dxbz dxbzVar = new dxbz();
        f = dxbzVar;
        dsqw.cc(dxbz.class, dxbzVar);
    }

    private dxbz() {
        dssu<Object> dssuVar = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဃ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", dxby.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dxbz();
            }
            if (i2 == 4) {
                return new dxbw();
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
            dssr<dxbz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxbz.class) {
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
