package defpackage;
/* compiled from: PG */
/* renamed from: dgjc  reason: default package */
/* loaded from: classes6.dex */
public final class dgjc extends dsqw<dgjc, dgjb> implements dssk {
    public static final dgjc d;
    private static volatile dssr<dgjc> f;
    public String a = "";
    public dsrj<dgiy> b = dssu.b;
    public dgis c;
    private int e;

    static {
        dgjc dgjcVar = new dgjc();
        d = dgjcVar;
        dsqw.cc(dgjc.class, dgjcVar);
    }

    private dgjc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0001\u0003ဈ\u0000", new Object[]{"e", "b", dgiy.class, "c", "a"});
            }
            if (i2 == 3) {
                return new dgjc();
            }
            if (i2 == 4) {
                return new dgjb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgjc.class) {
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
