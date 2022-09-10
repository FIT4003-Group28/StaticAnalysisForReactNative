package defpackage;
/* compiled from: PG */
/* renamed from: chhy  reason: default package */
/* loaded from: classes4.dex */
public final class chhy extends dsqw<chhy, chhv> implements dssk {
    public static final chhy e;
    private static volatile dssr<chhy> f;
    public int a;
    public djdm b;
    public chhx c;
    public djgh d;

    static {
        chhy chhyVar = new chhy();
        e = chhyVar;
        dsqw.cc(chhy.class, chhyVar);
    }

    private chhy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new chhy();
            }
            if (i2 == 4) {
                return new chhv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chhy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chhy.class) {
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
