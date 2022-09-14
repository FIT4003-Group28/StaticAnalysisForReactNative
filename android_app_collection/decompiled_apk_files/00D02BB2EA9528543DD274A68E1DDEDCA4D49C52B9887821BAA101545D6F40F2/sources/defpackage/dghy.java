package defpackage;
/* compiled from: PG */
/* renamed from: dghy  reason: default package */
/* loaded from: classes6.dex */
public final class dghy extends dsqw<dghy, dghx> implements dssk {
    public static final dghy e;
    private static volatile dssr<dghy> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d;

    static {
        dghy dghyVar = new dghy();
        e = dghyVar;
        dsqw.cc(dghy.class, dghyVar);
    }

    private dghy() {
        dspd dspdVar = dspd.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dghy();
            }
            if (i2 == 4) {
                return new dghx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dghy.class) {
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
