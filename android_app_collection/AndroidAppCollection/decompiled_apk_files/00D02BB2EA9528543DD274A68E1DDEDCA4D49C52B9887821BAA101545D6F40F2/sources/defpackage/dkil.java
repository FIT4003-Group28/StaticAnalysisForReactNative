package defpackage;
/* compiled from: PG */
/* renamed from: dkil  reason: default package */
/* loaded from: classes.dex */
public final class dkil extends dsqw<dkil, dkii> implements dkim {
    public static final dkil e;
    private static volatile dssr<dkil> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    private int f;

    static {
        dkil dkilVar = new dkil();
        e = dkilVar;
        dsqw.cc(dkil.class, dkilVar);
    }

    private dkil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0007ဌ\u0006", new Object[]{"f", "a", "b", "c", "d", dkik.c()});
            }
            if (i2 == 3) {
                return new dkil();
            }
            if (i2 == 4) {
                return new dkii();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkil> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkil.class) {
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

    @Override // defpackage.dkim
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.dkim
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dkim
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.dkim
    public final dkik d() {
        dkik b = dkik.b(this.d);
        return b == null ? dkik.UNKNOWN_SAVING_BUTTON_LAYOUT_TYPE : b;
    }
}
