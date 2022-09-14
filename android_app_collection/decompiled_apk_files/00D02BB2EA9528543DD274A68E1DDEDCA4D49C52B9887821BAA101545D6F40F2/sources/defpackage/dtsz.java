package defpackage;
/* compiled from: PG */
/* renamed from: dtsz  reason: default package */
/* loaded from: classes6.dex */
public final class dtsz extends dsqw<dtsz, dtsy> implements dssk {
    public static final dtsz e;
    private static volatile dssr<dtsz> f;
    public String a = "";
    public String b = "";
    public String c = "";
    public dsrf d = dsqz.b;

    static {
        dtsz dtszVar = new dtsz();
        e = dtszVar;
        dsqw.cc(dtsz.class, dtszVar);
    }

    private dtsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtsz();
            }
            if (i2 == 4) {
                return new dtsy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtsz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
