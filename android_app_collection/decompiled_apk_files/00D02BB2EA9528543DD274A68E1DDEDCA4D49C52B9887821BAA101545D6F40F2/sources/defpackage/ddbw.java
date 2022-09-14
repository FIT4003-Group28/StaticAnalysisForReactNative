package defpackage;
/* compiled from: PG */
/* renamed from: ddbw  reason: default package */
/* loaded from: classes5.dex */
public final class ddbw extends dsqs<ddbw, ddbv> implements dsqt {
    public static final ddbw a;
    private static volatile dssr<ddbw> c;
    private byte b = 2;

    static {
        ddbw ddbwVar = new ddbw();
        a = ddbwVar;
        dsqw.cc(ddbw.class, ddbwVar);
    }

    private ddbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddbw();
            }
            if (i2 == 4) {
                return new ddbv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<ddbw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddbw.class) {
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
