package defpackage;
/* compiled from: PG */
/* renamed from: dnuh  reason: default package */
/* loaded from: classes.dex */
public final class dnuh extends dsqw<dnuh, dnug> implements dssk {
    public static final dnuh f;
    private static volatile dssr<dnuh> i;
    public dqpe a;
    public dgas c;
    public int d;
    public dozz e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        dnuh dnuhVar = new dnuh();
        f = dnuhVar;
        dsqw.cc(dnuh.class, dnuhVar);
    }

    private dnuh() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"g", "a", "b", "c", "d", dpej.c(), "e"});
            }
            if (i3 == 3) {
                return new dnuh();
            }
            if (i3 == 4) {
                return new dnug();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dnuh> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnuh.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
