package defpackage;
/* compiled from: PG */
/* renamed from: dfin  reason: default package */
/* loaded from: classes6.dex */
public final class dfin extends dsqw<dfin, dfim> implements dssk {
    public static final dfin j;
    private static volatile dssr<dfin> k;
    public int a;
    public float b = 42.0f;
    public float c = 42.0f;
    public float d = 89.0f;
    public float e = 139.0f;
    public float f = 14.0f;
    public float g = 89.0f;
    public float h = 89.0f;
    public float i = 25.0f;

    static {
        dfin dfinVar = new dfin();
        j = dfinVar;
        dsqw.cc(dfin.class, dfinVar);
    }

    private dfin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dfin();
            }
            if (i2 == 4) {
                return new dfim();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfin> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dfin.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
