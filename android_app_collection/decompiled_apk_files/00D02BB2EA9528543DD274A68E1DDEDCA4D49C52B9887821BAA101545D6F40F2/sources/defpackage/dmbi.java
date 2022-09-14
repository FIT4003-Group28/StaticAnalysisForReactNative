package defpackage;
/* compiled from: PG */
/* renamed from: dmbi  reason: default package */
/* loaded from: classes6.dex */
public final class dmbi extends dsqw<dmbi, dmbh> implements dssk {
    public static final dmbi a;
    private static volatile dssr<dmbi> h;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    static {
        dmbi dmbiVar = new dmbi();
        a = dmbiVar;
        dsqw.cc(dmbi.class, dmbiVar);
    }

    private dmbi() {
    }

    public static /* synthetic */ void b(dmbi dmbiVar) {
        dmbiVar.b |= 1;
        dmbiVar.c = true;
    }

    public static /* synthetic */ void c(dmbi dmbiVar) {
        dmbiVar.b |= 32;
        dmbiVar.g = true;
    }

    public static /* synthetic */ void d(dmbi dmbiVar) {
        dmbiVar.b |= 2;
        dmbiVar.d = true;
    }

    public static /* synthetic */ void e(dmbi dmbiVar) {
        dmbiVar.b |= 4;
        dmbiVar.e = true;
    }

    public static /* synthetic */ void f(dmbi dmbiVar) {
        dmbiVar.b |= 8;
        dmbiVar.f = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0003\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dmbi();
            }
            if (i2 == 4) {
                return new dmbh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmbi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmbi.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
