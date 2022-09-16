package defpackage;
/* compiled from: PG */
/* renamed from: dlaq  reason: default package */
/* loaded from: classes6.dex */
public final class dlaq extends dsqs<dlaq, dlap> implements dsqt {
    public static final dlaq a;
    private static volatile dssr<dlaq> c;
    private byte b = 2;

    static {
        dlaq dlaqVar = new dlaq();
        a = dlaqVar;
        dsqw.cc(dlaq.class, dlaqVar);
    }

    private dlaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlaq();
            }
            if (i2 == 4) {
                return new dlap();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dlaq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlaq.class) {
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
