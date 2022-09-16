package defpackage;
/* compiled from: PG */
/* renamed from: auqf  reason: default package */
/* loaded from: classes2.dex */
public final class auqf extends dsqw<auqf, auqe> implements dssk {
    public static final auqf l;
    private static volatile dssr<auqf> m;
    public int a;
    public long c;
    public int g;
    public dplx h;
    public boolean i;
    public auqj j;
    public String b = "";
    public String d = "";
    public String e = "";
    public dspd f = dspd.b;
    public String k = "";

    static {
        auqf auqfVar = new auqf();
        l = auqfVar;
        dsqw.cc(auqf.class, auqfVar);
    }

    private auqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006ဌ\u0005\bဉ\u0007\tဇ\b\fဉ\n\rဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", auqg.a, "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new auqf();
            }
            if (i2 == 4) {
                return new auqe();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<auqf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (auqf.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
