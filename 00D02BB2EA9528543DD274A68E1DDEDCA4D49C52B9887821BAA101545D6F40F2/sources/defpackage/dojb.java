package defpackage;
/* compiled from: PG */
/* renamed from: dojb  reason: default package */
/* loaded from: classes6.dex */
public final class dojb extends dsqw<dojb, doja> implements dssk {
    public static final dojb a;
    private static volatile dssr<dojb> b;

    static {
        dojb dojbVar = new dojb();
        a = dojbVar;
        dsqw.cc(dojb.class, dojbVar);
    }

    private dojb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dojb();
            }
            if (i2 == 4) {
                return new doja();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dojb.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
