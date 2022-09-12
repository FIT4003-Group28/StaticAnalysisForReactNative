package defpackage;
/* compiled from: PG */
/* renamed from: dbny  reason: default package */
/* loaded from: classes5.dex */
public final class dbny extends dsqw<dbny, dbnx> implements dssk {
    public static final dbny a;
    private static volatile dssr<dbny> b;

    static {
        dbny dbnyVar = new dbny();
        a = dbnyVar;
        dsqw.cc(dbny.class, dbnyVar);
    }

    private dbny() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbny();
            }
            if (i2 == 4) {
                return new dbnx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbny> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbny.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
