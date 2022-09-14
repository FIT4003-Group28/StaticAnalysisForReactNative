package defpackage;
/* compiled from: PG */
/* renamed from: drah  reason: default package */
/* loaded from: classes.dex */
public final class drah extends dsqw<drah, drag> implements dssk {
    public static final drah c;
    private static volatile dssr<drah> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        drah drahVar = new drah();
        c = drahVar;
        dsqw.cc(drah.class, drahVar);
    }

    private drah() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drah();
            }
            if (i2 == 4) {
                return new drag();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drah> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drah.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
