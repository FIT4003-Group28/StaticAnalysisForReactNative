package defpackage;
/* compiled from: PG */
/* renamed from: didv  reason: default package */
/* loaded from: classes6.dex */
public final class didv extends dsqw<didv, dids> implements dssk {
    public static final didv d;
    private static volatile dssr<didv> e;
    public int a;
    public didu b;
    public didu c;

    static {
        didv didvVar = new didv();
        d = didvVar;
        dsqw.cc(didv.class, didvVar);
    }

    private didv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new didv();
            }
            if (i2 == 4) {
                return new dids();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (didv.class) {
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
