package defpackage;
/* compiled from: PG */
/* renamed from: dfok  reason: default package */
/* loaded from: classes6.dex */
public final class dfok extends dsqs<dfok, dfoj> implements dsqt {
    public static final dfok f;
    public static final dsqv<dsyn, dfok> g;
    private static volatile dssr<dfok> j;
    public int a;
    public dfoc b;
    public ddyb d;
    public dfoo e;
    private ddyb h;
    private byte i = 2;
    public String c = "";

    static {
        dfok dfokVar = new dfok();
        f = dfokVar;
        dsqw.cc(dfok.class, dfokVar);
        g = dsqw.newSingularGeneratedExtension(dsyn.e, dfokVar, dfokVar, null, 300326985, dsur.MESSAGE, dfok.class);
    }

    private dfok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "h", "e"});
            }
            if (i2 == 3) {
                return new dfok();
            }
            if (i2 == 4) {
                return new dfoj();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dfok> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dfok.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
