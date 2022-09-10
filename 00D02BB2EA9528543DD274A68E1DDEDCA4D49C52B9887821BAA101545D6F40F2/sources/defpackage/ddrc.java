package defpackage;
/* compiled from: PG */
/* renamed from: ddrc  reason: default package */
/* loaded from: classes6.dex */
public final class ddrc extends dsqw<ddrc, ddrb> implements dssk {
    public static final ddrc f;
    private static volatile dssr<ddrc> h;
    public int a;
    public int b;
    public int c;
    public int d = 1;
    public String e = "";
    private boolean g;

    static {
        ddrc ddrcVar = new ddrc();
        f = ddrcVar;
        dsqw.cc(ddrc.class, ddrcVar);
    }

    private ddrc() {
    }

    public static /* synthetic */ void b(ddrc ddrcVar) {
        ddrcVar.a |= 16;
        ddrcVar.g = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", dgau.c(), "c", dpdp.c(), "d", dpdn.c(), "e", "g"});
            }
            if (i2 == 3) {
                return new ddrc();
            }
            if (i2 == 4) {
                return new ddrb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddrc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
