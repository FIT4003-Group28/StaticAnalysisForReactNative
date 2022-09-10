package defpackage;
/* compiled from: PG */
/* renamed from: dgnb  reason: default package */
/* loaded from: classes6.dex */
public final class dgnb extends dsqw<dgnb, dgna> implements dssk {
    public static final dgnb a;
    private static volatile dssr<dgnb> b;

    static {
        dgnb dgnbVar = new dgnb();
        a = dgnbVar;
        dsqw.cc(dgnb.class, dgnbVar);
    }

    private dgnb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgnb();
            }
            if (i2 == 4) {
                return new dgna();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgnb.class) {
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
