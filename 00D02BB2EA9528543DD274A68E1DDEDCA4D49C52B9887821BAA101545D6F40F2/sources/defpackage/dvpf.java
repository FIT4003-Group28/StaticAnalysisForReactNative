package defpackage;
/* compiled from: PG */
/* renamed from: dvpf  reason: default package */
/* loaded from: classes6.dex */
public final class dvpf extends dsqw<dvpf, dvpe> implements dssk {
    public static final dvpf a;
    private static volatile dssr<dvpf> b;

    static {
        dvpf dvpfVar = new dvpf();
        a = dvpfVar;
        dsqw.cc(dvpf.class, dvpfVar);
    }

    private dvpf() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvpf();
            }
            if (i2 == 4) {
                return new dvpe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpf.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
