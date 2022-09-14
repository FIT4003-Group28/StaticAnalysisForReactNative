package defpackage;
/* compiled from: PG */
/* renamed from: dvln  reason: default package */
/* loaded from: classes.dex */
public final class dvln extends dsqw<dvln, dvlm> implements dssk {
    public static final dvln e;
    private static volatile dssr<dvln> g;
    public boolean a;
    public int b = 3;
    public float c = 0.7f;
    public dsrj<String> d = dssu.b;
    private int f;

    static {
        dvln dvlnVar = new dvln();
        e = dvlnVar;
        dsqw.cc(dvln.class, dvlnVar);
    }

    private dvln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvln();
            }
            if (i2 == 4) {
                return new dvlm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvln> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvln.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
