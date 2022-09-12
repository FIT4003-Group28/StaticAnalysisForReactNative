package defpackage;
/* compiled from: PG */
/* renamed from: duqa  reason: default package */
/* loaded from: classes6.dex */
public final class duqa extends dsqw<duqa, dupz> implements dssk {
    public static final duqa b;
    private static volatile dssr<duqa> d;
    public String a = "";
    private int c;

    static {
        duqa duqaVar = new duqa();
        b = duqaVar;
        dsqw.cc(duqa.class, duqaVar);
    }

    private duqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new duqa();
            }
            if (i2 == 4) {
                return new dupz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duqa.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
