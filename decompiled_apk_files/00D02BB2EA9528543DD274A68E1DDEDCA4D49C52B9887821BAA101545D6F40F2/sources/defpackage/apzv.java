package defpackage;
/* compiled from: PG */
/* renamed from: apzv  reason: default package */
/* loaded from: classes2.dex */
public final class apzv extends dsqw<apzv, apzu> implements dssk {
    public static final apzv c;
    private static volatile dssr<apzv> d;
    public int a;
    public apzt b;

    static {
        apzv apzvVar = new apzv();
        c = apzvVar;
        dsqw.cc(apzv.class, apzvVar);
    }

    private apzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new apzv();
            }
            if (i2 == 4) {
                return new apzu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<apzv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (apzv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
