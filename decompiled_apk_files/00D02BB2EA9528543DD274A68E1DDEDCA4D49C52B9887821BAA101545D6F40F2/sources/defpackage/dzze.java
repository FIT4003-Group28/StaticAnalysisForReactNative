package defpackage;
/* compiled from: PG */
/* renamed from: dzze  reason: default package */
/* loaded from: classes.dex */
public final class dzze extends dsqs<dzze, dzzd> implements dsqt {
    public static final dzze a;
    private static volatile dssr<dzze> c;
    private byte b = 2;

    static {
        dzze dzzeVar = new dzze();
        a = dzzeVar;
        dsqw.cc(dzze.class, dzzeVar);
    }

    private dzze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dzze();
            }
            if (i2 == 4) {
                return new dzzd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dzze> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dzze.class) {
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
