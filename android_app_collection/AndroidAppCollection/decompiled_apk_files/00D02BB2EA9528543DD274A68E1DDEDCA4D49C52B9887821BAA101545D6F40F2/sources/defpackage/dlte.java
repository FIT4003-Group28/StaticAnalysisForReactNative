package defpackage;
/* compiled from: PG */
/* renamed from: dlte  reason: default package */
/* loaded from: classes6.dex */
public final class dlte extends dsqw<dlte, dltd> implements dssk {
    public static final dlte c;
    private static volatile dssr<dlte> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dlte dlteVar = new dlte();
        c = dlteVar;
        dsqw.cc(dlte.class, dlteVar);
    }

    private dlte() {
    }

    public static /* synthetic */ void b(dlte dlteVar) {
        dlteVar.d |= 4;
        dlteVar.a = true;
    }

    public static /* synthetic */ void c(dlte dlteVar) {
        dlteVar.d |= 8;
        dlteVar.b = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlte();
            }
            if (i2 == 4) {
                return new dltd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlte> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlte.class) {
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
