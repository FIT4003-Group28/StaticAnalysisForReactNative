package defpackage;
/* compiled from: PG */
/* renamed from: dliv  reason: default package */
/* loaded from: classes6.dex */
public final class dliv extends dsqw<dliv, dlis> implements dssk {
    public static final dliv h;
    private static volatile dssr<dliv> i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dliu e;
    public boolean f;
    public int g;

    static {
        dliv dlivVar = new dliv();
        h = dlivVar;
        dsqw.cc(dliv.class, dlivVar);
    }

    private dliv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", dlir.c()});
            }
            if (i3 == 3) {
                return new dliv();
            }
            if (i3 == 4) {
                return new dlis();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dliv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dliv.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
