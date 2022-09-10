package defpackage;
/* compiled from: PG */
/* renamed from: dmmq  reason: default package */
/* loaded from: classes6.dex */
public final class dmmq extends dsqs<dmmq, dmmp> implements dsqt {
    public static final dmmq a;
    private static volatile dssr<dmmq> c;
    private byte b = 2;

    static {
        dmmq dmmqVar = new dmmq();
        a = dmmqVar;
        dsqw.cc(dmmq.class, dmmqVar);
    }

    private dmmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmmq();
            }
            if (i2 == 4) {
                return new dmmp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dmmq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmmq.class) {
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
