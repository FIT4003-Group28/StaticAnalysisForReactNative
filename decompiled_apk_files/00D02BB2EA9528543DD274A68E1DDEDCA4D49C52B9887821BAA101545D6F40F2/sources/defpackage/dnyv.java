package defpackage;
/* compiled from: PG */
/* renamed from: dnyv  reason: default package */
/* loaded from: classes6.dex */
public final class dnyv extends dsqw<dnyv, dnyu> implements dssk {
    public static final dnyv c;
    private static volatile dssr<dnyv> e;
    public int a;
    public int b;
    private boolean d;

    static {
        dnyv dnyvVar = new dnyv();
        c = dnyvVar;
        dsqw.cc(dnyv.class, dnyvVar);
    }

    private dnyv() {
    }

    public static /* synthetic */ void b(dnyv dnyvVar) {
        dnyvVar.a |= 2;
        dnyvVar.d = false;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", dnwv.c(), "d"});
            }
            if (i2 == 3) {
                return new dnyv();
            }
            if (i2 == 4) {
                return new dnyu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnyv.class) {
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
