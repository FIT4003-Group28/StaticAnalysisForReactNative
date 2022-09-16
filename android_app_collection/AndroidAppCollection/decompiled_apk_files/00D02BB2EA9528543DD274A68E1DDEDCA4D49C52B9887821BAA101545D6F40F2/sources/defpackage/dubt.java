package defpackage;
/* compiled from: PG */
/* renamed from: dubt  reason: default package */
/* loaded from: classes.dex */
public final class dubt extends dsqw<dubt, dubr> implements dssk {
    public static final dubt f;
    private static volatile dssr<dubt> g;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public String d = "";
    public String e = "";

    static {
        dubt dubtVar = new dubt();
        f = dubtVar;
        dsqw.cc(dubt.class, dubtVar);
    }

    private dubt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dubt();
            }
            if (i2 == 4) {
                return new dubr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dubt.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
