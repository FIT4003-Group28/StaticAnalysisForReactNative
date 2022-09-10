package defpackage;
/* compiled from: PG */
/* renamed from: chvq  reason: default package */
/* loaded from: classes4.dex */
public final class chvq extends dsqw<chvq, chvp> implements dssk {
    public static final chvq d;
    private static volatile dssr<chvq> e;
    public int a;
    public String b = "";
    public dpvc c;

    static {
        chvq chvqVar = new chvq();
        d = chvqVar;
        dsqw.cc(chvq.class, chvqVar);
    }

    private chvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chvq();
            }
            if (i2 == 4) {
                return new chvp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chvq.class) {
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
