package defpackage;
/* compiled from: PG */
/* renamed from: doom  reason: default package */
/* loaded from: classes6.dex */
public final class doom extends dsqw<doom, dooh> implements dssk {
    public static final doom g;
    private static volatile dssr<doom> j;
    public int d;
    public int f;
    private int h;
    private byte i = 2;
    public dsrj<douj> a = dssu.b;
    public dsrj<douj> b = dssu.b;
    public dsrj<dooo> c = dssu.b;
    public dsrj<dozz> e = dssu.b;

    static {
        doom doomVar = new doom();
        g = doomVar;
        dsqw.cc(doom.class, doomVar);
    }

    private doom() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0003\u000e\u0006\u0000\u0004\u0004\u0003Л\u0004ဌ\u0002\u0007Л\tЛ\nဌ\u0006\u000eЛ", new Object[]{"h", "c", dooo.class, "d", dool.c(), "e", dozz.class, "a", douj.class, "f", dooj.c(), "b", douj.class});
            }
            if (i2 == 3) {
                return new doom();
            }
            if (i2 == 4) {
                return new dooh();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<doom> dssrVar = j;
            if (dssrVar == null) {
                synchronized (doom.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
