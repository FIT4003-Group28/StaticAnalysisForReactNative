package defpackage;
/* compiled from: PG */
/* renamed from: drkw  reason: default package */
/* loaded from: classes6.dex */
public final class drkw extends dsqw<drkw, drkv> implements dssk {
    public static final drkw c;
    private static volatile dssr<drkw> d;
    public int a;
    public String b = "";

    static {
        drkw drkwVar = new drkw();
        c = drkwVar;
        dsqw.cc(drkw.class, drkwVar);
    }

    private drkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drkw();
            }
            if (i2 == 4) {
                return new drkv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drkw.class) {
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
