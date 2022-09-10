package defpackage;
/* compiled from: PG */
/* renamed from: dltc  reason: default package */
/* loaded from: classes6.dex */
public final class dltc extends dsqw<dltc, dltb> implements dssk {
    public static final dltc a;
    private static volatile dssr<dltc> c;
    private byte b = 2;

    static {
        dltc dltcVar = new dltc();
        a = dltcVar;
        dsqw.cc(dltc.class, dltcVar);
    }

    private dltc() {
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
                return new dltc();
            }
            if (i2 == 4) {
                return new dltb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dltc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dltc.class) {
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
