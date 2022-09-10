package defpackage;
/* compiled from: PG */
/* renamed from: ajiu  reason: default package */
/* loaded from: classes2.dex */
public final class ajiu extends dsqw<ajiu, ajit> implements dssk {
    public static final ajiu g;
    private static volatile dssr<ajiu> h;
    public int a;
    public ajja b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;

    static {
        ajiu ajiuVar = new ajiu();
        g = ajiuVar;
        dsqw.cc(ajiu.class, ajiuVar);
    }

    private ajiu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ခ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ajiu();
            }
            if (i2 == 4) {
                return new ajit();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajiu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ajiu.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
