package defpackage;
/* compiled from: PG */
/* renamed from: akwf  reason: default package */
/* loaded from: classes.dex */
public final class akwf extends dsqw<akwf, akwa> implements dssk {
    public static final akwf h;
    private static volatile dssr<akwf> i;
    public int a;
    public dhjz b;
    public float c;
    public float d;
    public akwe e;
    public int f;
    public int g;

    static {
        akwf akwfVar = new akwf();
        h = akwfVar;
        dsqw.cc(akwf.class, akwfVar);
    }

    private akwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဏ\u0004\u0006ဏ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new akwf();
            }
            if (i3 == 4) {
                return new akwa();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<akwf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (akwf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
