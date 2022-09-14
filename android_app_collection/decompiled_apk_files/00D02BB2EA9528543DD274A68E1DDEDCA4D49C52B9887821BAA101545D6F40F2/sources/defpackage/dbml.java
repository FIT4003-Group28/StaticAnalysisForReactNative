package defpackage;
/* compiled from: PG */
/* renamed from: dbml  reason: default package */
/* loaded from: classes5.dex */
public final class dbml extends dsqw<dbml, dbmk> implements dssk {
    public static final dbml b;
    private static volatile dssr<dbml> c;
    public dsrj<dfef> a = dssu.b;

    static {
        dbml dbmlVar = new dbml();
        b = dbmlVar;
        dsqw.cc(dbml.class, dbmlVar);
    }

    private dbml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dfef.class});
            }
            if (i2 == 3) {
                return new dbml();
            }
            if (i2 == 4) {
                return new dbmk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbml> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbml.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
