package defpackage;
/* compiled from: PG */
/* renamed from: dlrl  reason: default package */
/* loaded from: classes.dex */
public final class dlrl extends dsqw<dlrl, dlrk> implements dssk {
    public static final dlrl d;
    private static volatile dssr<dlrl> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dlrl dlrlVar = new dlrl();
        d = dlrlVar;
        dsqw.cc(dlrl.class, dlrlVar);
    }

    private dlrl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlrl();
            }
            if (i2 == 4) {
                return new dlrk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlrl.class) {
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
