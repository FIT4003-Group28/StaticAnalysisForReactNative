package defpackage;
/* compiled from: PG */
/* renamed from: aknw  reason: default package */
/* loaded from: classes2.dex */
public final class aknw extends dsqw<aknw, aknv> implements dssk {
    public static final aknw d;
    private static volatile dssr<aknw> e;
    public int a;
    public String b = "";
    public long c;

    static {
        aknw aknwVar = new aknw();
        d = aknwVar;
        dsqw.cc(aknw.class, aknwVar);
    }

    private aknw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new aknw();
            }
            if (i2 == 4) {
                return new aknv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aknw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aknw.class) {
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
