package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dloc  reason: default package */
/* loaded from: classes6.dex */
public final class dloc extends dsqw<dloc, dlnz> implements dssk {
    public static final dloc c;
    private static volatile dssr<dloc> d;
    public int a;
    public dlob b;

    static {
        dloc dlocVar = new dloc();
        c = dlocVar;
        dsqw.cc(dloc.class, dlocVar);
    }

    private dloc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dloc();
            }
            if (i2 == 4) {
                return new dlnz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dloc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dloc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
