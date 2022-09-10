package defpackage;
/* compiled from: PG */
/* renamed from: djfn  reason: default package */
/* loaded from: classes6.dex */
public final class djfn extends dsqw<djfn, djfm> implements dssk {
    public static final djfn a;
    private static volatile dssr<djfn> c;
    private byte b = 2;

    static {
        djfn djfnVar = new djfn();
        a = djfnVar;
        dsqw.cc(djfn.class, djfnVar);
    }

    private djfn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djfn();
            }
            if (i2 == 4) {
                return new djfm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<djfn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djfn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
