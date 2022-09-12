package defpackage;
/* compiled from: PG */
/* renamed from: dhrm  reason: default package */
/* loaded from: classes6.dex */
public final class dhrm extends dsqs<dhrm, dhrl> implements dsqt {
    public static final dhrm a;
    private static volatile dssr<dhrm> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhrm dhrmVar = new dhrm();
        a = dhrmVar;
        dsqw.cc(dhrm.class, dhrmVar);
    }

    private dhrm() {
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
                return new dhrm();
            }
            if (i2 == 4) {
                return new dhrl();
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
            dssr<dhrm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhrm.class) {
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
