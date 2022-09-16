package defpackage;
/* compiled from: PG */
/* renamed from: dbla  reason: default package */
/* loaded from: classes5.dex */
public final class dbla extends dsqs<dbla, dbkz> implements dsqt {
    public static final dbla a;
    private static volatile dssr<dbla> c;
    private byte b = 2;

    static {
        dbla dblaVar = new dbla();
        a = dblaVar;
        dsqw.cc(dbla.class, dblaVar);
    }

    private dbla() {
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
                return new dbla();
            }
            if (i2 == 4) {
                return new dbkz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dbla> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbla.class) {
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
