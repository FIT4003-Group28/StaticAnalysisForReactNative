package defpackage;
/* compiled from: PG */
/* renamed from: dwix  reason: default package */
/* loaded from: classes6.dex */
public final class dwix extends dsqw<dwix, dwiw> implements dssk {
    public static final dwix h;
    private static volatile dssr<dwix> i;
    public int a;
    public dnnn b;
    public doeg d;
    public dsrf c = dsqz.b;
    public dsrf e = dsqz.b;
    public int f = 5;
    public dsrj<String> g = dssu.b;

    static {
        dwix dwixVar = new dwix();
        h = dwixVar;
        dsqw.cc(dwix.class, dwixVar);
    }

    private dwix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0003\u0000\u0001\u001e\u0002ဉ\u0003\u0004\u001e\bဌ\u0004\tဉ\u0000\f\u001a", new Object[]{"a", "c", dodv.c(), "d", "e", dodx.c(), "f", dodx.c(), "b", "g"});
            }
            if (i3 == 3) {
                return new dwix();
            }
            if (i3 == 4) {
                return new dwiw();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dwix> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwix.class) {
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
