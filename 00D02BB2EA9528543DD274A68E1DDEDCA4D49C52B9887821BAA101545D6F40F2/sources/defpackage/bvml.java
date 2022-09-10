package defpackage;
/* compiled from: PG */
/* renamed from: bvml  reason: default package */
/* loaded from: classes4.dex */
public final class bvml extends dsqw<bvml, bvmk> implements dssk {
    public static final bvml d;
    private static volatile dssr<bvml> e;
    public int a;
    public String b = "";
    public long c;

    static {
        bvml bvmlVar = new bvml();
        d = bvmlVar;
        dsqw.cc(bvml.class, bvmlVar);
    }

    private bvml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bvml();
            }
            if (i2 == 4) {
                return new bvmk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvml> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bvml.class) {
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
