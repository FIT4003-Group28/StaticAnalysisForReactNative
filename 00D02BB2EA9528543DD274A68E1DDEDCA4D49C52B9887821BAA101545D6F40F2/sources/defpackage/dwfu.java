package defpackage;
/* compiled from: PG */
/* renamed from: dwfu  reason: default package */
/* loaded from: classes.dex */
public final class dwfu extends dsqw<dwfu, dwft> implements dssk {
    public static final dwfu a;
    private static volatile dssr<dwfu> d;
    private int b;
    private boolean c;

    static {
        dwfu dwfuVar = new dwfu();
        a = dwfuVar;
        dsqw.cc(dwfu.class, dwfuVar);
    }

    private dwfu() {
    }

    public static /* synthetic */ void c(dwfu dwfuVar) {
        dwfuVar.b |= 1;
        dwfuVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dwfu();
            }
            if (i2 == 4) {
                return new dwft();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwfu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
