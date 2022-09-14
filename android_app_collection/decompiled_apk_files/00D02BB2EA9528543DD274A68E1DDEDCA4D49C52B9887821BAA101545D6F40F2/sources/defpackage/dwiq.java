package defpackage;
/* compiled from: PG */
/* renamed from: dwiq */
/* loaded from: classes6.dex */
public final class dwiq extends dsqw<dwiq, dwip> implements dssk {
    public static final dwiq e;
    private static volatile dssr<dwiq> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    private boolean f;

    static {
        dwiq dwiqVar = new dwiq();
        e = dwiqVar;
        dsqw.cc(dwiq.class, dwiqVar);
    }

    private dwiq() {
    }

    public static /* synthetic */ void c(dwiq dwiqVar) {
        dwiqVar.a |= 16;
        dwiqVar.f = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဇ\u0004", new Object[]{"a", "b", "c", "d", "f"});
            }
            if (i2 == 3) {
                return new dwiq();
            }
            if (i2 == 4) {
                return new dwip();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwiq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwiq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
