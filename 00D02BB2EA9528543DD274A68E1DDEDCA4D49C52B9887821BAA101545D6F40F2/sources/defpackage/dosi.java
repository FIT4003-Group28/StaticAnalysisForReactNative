package defpackage;
/* compiled from: PG */
/* renamed from: dosi  reason: default package */
/* loaded from: classes6.dex */
public final class dosi extends dsqw<dosi, dosh> implements dssk {
    public static final dosi a;
    private static volatile dssr<dosi> d;
    private int b;
    private boolean c;

    static {
        dosi dosiVar = new dosi();
        a = dosiVar;
        dsqw.cc(dosi.class, dosiVar);
    }

    private dosi() {
    }

    public static /* synthetic */ void b(dosi dosiVar) {
        dosiVar.b |= 1;
        dosiVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dosi();
            }
            if (i2 == 4) {
                return new dosh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dosi.class) {
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
