package defpackage;
/* compiled from: PG */
/* renamed from: dvwz  reason: default package */
/* loaded from: classes6.dex */
public final class dvwz extends dsqw<dvwz, dvwy> implements dssk {
    public static final dvwz d;
    private static volatile dssr<dvwz> e;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;

    static {
        dvwz dvwzVar = new dvwz();
        d = dvwzVar;
        dsqw.cc(dvwz.class, dvwzVar);
    }

    private dvwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvwz();
            }
            if (i2 == 4) {
                return new dvwy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvwz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvwz.class) {
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
