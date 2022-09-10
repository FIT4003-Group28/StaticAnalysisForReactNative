package defpackage;
/* compiled from: PG */
/* renamed from: droc  reason: default package */
/* loaded from: classes6.dex */
public final class droc extends dsqw<droc, drob> implements dssk {
    public static final droc c;
    private static volatile dssr<droc> h;
    public int a;
    public boolean b;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    static {
        droc drocVar = new droc();
        c = drocVar;
        dsqw.cc(droc.class, drocVar);
    }

    private droc() {
    }

    public static /* synthetic */ void b(droc drocVar) {
        drocVar.a |= 1;
        drocVar.d = true;
    }

    public static /* synthetic */ void c(droc drocVar) {
        drocVar.a |= 2;
        drocVar.e = true;
    }

    public static /* synthetic */ void d(droc drocVar) {
        drocVar.a |= 4;
        drocVar.f = true;
    }

    public static /* synthetic */ void e(droc drocVar) {
        drocVar.a |= 8;
        drocVar.g = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0003\u0007ဇ\u0005", new Object[]{"a", "d", "e", "f", "g", "b"});
            }
            if (i2 == 3) {
                return new droc();
            }
            if (i2 == 4) {
                return new drob();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<droc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (droc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
