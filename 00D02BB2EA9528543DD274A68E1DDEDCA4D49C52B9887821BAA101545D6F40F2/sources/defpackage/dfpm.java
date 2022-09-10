package defpackage;
/* compiled from: PG */
/* renamed from: dfpm  reason: default package */
/* loaded from: classes6.dex */
public final class dfpm extends dsqw<dfpm, dfpl> implements dssk {
    public static final dfpm f;
    private static volatile dssr<dfpm> i;
    public int a;
    public dgrh b;
    public dndh d;
    private dgrn g;
    private byte h = 2;
    public String c = "";
    public String e = "";

    static {
        dfpm dfpmVar = new dfpm();
        f = dfpmVar;
        dsqw.cc(dfpm.class, dfpmVar);
    }

    private dfpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ᐉ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "g", "e"});
            }
            if (i3 == 3) {
                return new dfpm();
            }
            if (i3 == 4) {
                return new dfpl();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dfpm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dfpm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
