package defpackage;
/* compiled from: PG */
/* renamed from: dblc  reason: default package */
/* loaded from: classes5.dex */
public final class dblc extends dsqs<dblc, dblb> implements dsqt {
    public static final dblc a;
    private static volatile dssr<dblc> c;
    private byte b = 2;

    static {
        dblc dblcVar = new dblc();
        a = dblcVar;
        dsqw.cc(dblc.class, dblcVar);
    }

    private dblc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dblc();
            }
            if (i2 == 4) {
                return new dblb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dblc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dblc.class) {
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
