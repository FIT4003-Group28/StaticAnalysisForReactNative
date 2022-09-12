package defpackage;
/* compiled from: PG */
/* renamed from: dawq  reason: default package */
/* loaded from: classes5.dex */
public final class dawq extends dsqs<dawq, dawp> implements dsqt {
    public static final dawq a;
    private static volatile dssr<dawq> c;
    private byte b = 2;

    static {
        dawq dawqVar = new dawq();
        a = dawqVar;
        dsqw.cc(dawq.class, dawqVar);
    }

    private dawq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dawq();
            }
            if (i2 == 4) {
                return new dawp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dawq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dawq.class) {
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
