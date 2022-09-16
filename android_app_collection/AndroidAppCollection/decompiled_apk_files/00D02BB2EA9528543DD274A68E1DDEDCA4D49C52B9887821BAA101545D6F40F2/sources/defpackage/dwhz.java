package defpackage;
/* compiled from: PG */
/* renamed from: dwhz  reason: default package */
/* loaded from: classes6.dex */
public final class dwhz extends dsqw<dwhz, dwhw> implements dssk {
    public static final dwhz d;
    private static volatile dssr<dwhz> f;
    public String a = "";
    public dsrj<dwhy> b = dssu.b;
    public String c = "";
    private int e;

    static {
        dwhz dwhzVar = new dwhz();
        d = dwhzVar;
        dsqw.cc(dwhz.class, dwhzVar);
    }

    private dwhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0006\u001b", new Object[]{"e", "a", "c", "b", dwhy.class});
            }
            if (i2 == 3) {
                return new dwhz();
            }
            if (i2 == 4) {
                return new dwhw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwhz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwhz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
