package defpackage;
/* compiled from: PG */
/* renamed from: chva  reason: default package */
/* loaded from: classes4.dex */
public final class chva extends dsqw<chva, chuv> implements dssk {
    public static final chva j;
    private static volatile dssr<chva> k;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        chva chvaVar = new chva();
        j = chvaVar;
        dsqw.cc(chva.class, chvaVar);
    }

    private chva() {
    }

    public static /* synthetic */ void b(chva chvaVar) {
        chvaVar.b = 7;
        chvaVar.c = "https://support.google.com/maps/?p=suggested_places";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0004\u0005ျ\u0000\u0006ဌ\u0007\u0007ျ\u0000\bင\u0003", new Object[]{"c", "b", "a", "d", chuw.a, "e", "f", "h", "i", chuz.c(), "g"});
            }
            if (i2 == 3) {
                return new chva();
            }
            if (i2 == 4) {
                return new chuv();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chva> dssrVar = k;
            if (dssrVar == null) {
                synchronized (chva.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
