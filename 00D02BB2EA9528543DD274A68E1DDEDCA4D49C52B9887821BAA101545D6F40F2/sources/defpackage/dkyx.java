package defpackage;
/* compiled from: PG */
/* renamed from: dkyx */
/* loaded from: classes6.dex */
public final class dkyx extends dsqw<dkyx, dkyw> implements dssk {
    public static final dkyx f;
    private static volatile dssr<dkyx> g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        dkyx dkyxVar = new dkyx();
        f = dkyxVar;
        dsqw.cc(dkyx.class, dkyxVar);
    }

    private dkyx() {
    }

    public static /* synthetic */ void b(dkyx dkyxVar) {
        dkyxVar.a |= 1;
        dkyxVar.b = true;
    }

    public static /* synthetic */ void c(dkyx dkyxVar) {
        dkyxVar.a |= 2;
        dkyxVar.c = true;
    }

    public static /* synthetic */ void d(dkyx dkyxVar) {
        dkyxVar.a |= 8;
        dkyxVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkyx();
            }
            if (i2 == 4) {
                return new dkyw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkyx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
