package defpackage;
/* compiled from: PG */
/* renamed from: dsye  reason: default package */
/* loaded from: classes6.dex */
public final class dsye extends dsqw<dsye, dsyd> implements dssk {
    public static final dsye g;
    private static volatile dssr<dsye> i;
    public int a;
    public int b;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public dsrj<dsyn> e = dssu.b;
    public dsrj<dsyn> f = dssu.b;

    static {
        dsye dsyeVar = new dsye();
        g = dsyeVar;
        dsqw.cc(dsye.class, dsyeVar);
    }

    private dsye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005Л", new Object[]{"a", "b", dsyl.c(), "c", "d", "e", dsyn.class, "f", dsyn.class});
            }
            if (i3 == 3) {
                return new dsye();
            }
            if (i3 == 4) {
                return new dsyd();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dsye> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dsye.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
