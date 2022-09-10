package defpackage;
/* compiled from: PG */
/* renamed from: dvuh  reason: default package */
/* loaded from: classes6.dex */
public final class dvuh extends dsqw<dvuh, dvug> implements dssk {
    public static final dvuh d;
    private static volatile dssr<dvuh> e;
    public int a;
    public int b;
    public dsrf c = dsqz.b;

    static {
        dvuh dvuhVar = new dvuh();
        d = dvuhVar;
        dsqw.cc(dvuh.class, dvuhVar);
    }

    private dvuh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဋ\u0001\u0003\u001d", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvuh();
            }
            if (i2 == 4) {
                return new dvug();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvuh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvuh.class) {
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
