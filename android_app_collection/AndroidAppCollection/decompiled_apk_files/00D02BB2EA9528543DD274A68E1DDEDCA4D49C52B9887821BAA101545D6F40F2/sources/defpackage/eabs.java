package defpackage;
/* compiled from: PG */
/* renamed from: eabs  reason: default package */
/* loaded from: classes6.dex */
public final class eabs extends dsqw<eabs, eabr> implements dssk {
    public static final eabs a;
    private static volatile dssr<eabs> e;
    private int b;
    private eabf c;
    private byte d = 2;

    static {
        eabs eabsVar = new eabs();
        a = eabsVar;
        dsqw.cc(eabs.class, eabsVar);
    }

    private eabs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new eabs();
            }
            if (i2 == 4) {
                return new eabr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<eabs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eabs.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
