package defpackage;
/* compiled from: PG */
/* renamed from: djuv  reason: default package */
/* loaded from: classes6.dex */
public final class djuv extends dsqw<djuv, djus> implements dssk {
    public static final djuv i;
    private static volatile dssr<djuv> l;
    public int a;
    public int c;
    public int d;
    public dnqh e;
    public docs f;
    public djur h;
    private int j;
    private byte k = 2;
    public String b = "";
    public String g = "";

    static {
        djuv djuvVar = new djuv();
        i = djuvVar;
        dsqw.cc(djuv.class, djuvVar);
    }

    private djuv() {
    }

    public static /* synthetic */ void b(djuv djuvVar) {
        djuvVar.a |= 4;
        djuvVar.j = 10;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ᐉ\u0004\u0007ဉ\u0005\nဈ\u0007\fဉ\b", new Object[]{"a", "b", "c", "j", "d", djuu.c(), "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new djuv();
            }
            if (i3 == 4) {
                return new djus();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<djuv> dssrVar = l;
            if (dssrVar == null) {
                synchronized (djuv.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
