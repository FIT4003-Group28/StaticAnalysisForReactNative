package defpackage;
/* compiled from: PG */
/* renamed from: djna  reason: default package */
/* loaded from: classes6.dex */
public final class djna extends dsqw<djna, djmz> implements dssk {
    public static final djna b;
    private static volatile dssr<djna> f;
    public dsrj<djoa> a = dssu.b;
    private int c;
    private boolean d;
    private boolean e;

    static {
        djna djnaVar = new djna();
        b = djnaVar;
        dsqw.cc(djna.class, djnaVar);
    }

    private djna() {
    }

    public static /* synthetic */ void c(djna djnaVar) {
        djnaVar.c |= 1;
        djnaVar.d = true;
    }

    public static /* synthetic */ void d(djna djnaVar) {
        djnaVar.c |= 2;
        djnaVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004\u001b", new Object[]{"c", "d", "e", "a", djoa.class});
            }
            if (i2 == 3) {
                return new djna();
            }
            if (i2 == 4) {
                return new djmz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djna> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djna.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<djoa> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
