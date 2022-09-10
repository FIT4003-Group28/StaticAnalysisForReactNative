package defpackage;
/* compiled from: PG */
/* renamed from: dthw  reason: default package */
/* loaded from: classes6.dex */
public final class dthw extends dsqw<dthw, dthv> implements dssk {
    public static final dthw d;
    private static volatile dssr<dthw> e;
    public int a;
    public float b;
    public float c;

    static {
        dthw dthwVar = new dthw();
        d = dthwVar;
        dsqw.cc(dthw.class, dthwVar);
    }

    private dthw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dthw();
            }
            if (i2 == 4) {
                return new dthv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dthw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dthw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
