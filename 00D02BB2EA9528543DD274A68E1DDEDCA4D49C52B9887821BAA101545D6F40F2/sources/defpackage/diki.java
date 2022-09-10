package defpackage;
/* compiled from: PG */
/* renamed from: diki  reason: default package */
/* loaded from: classes6.dex */
public final class diki extends dsqw<diki, dikh> implements dssk {
    public static final diki i;
    private static volatile dssr<diki> k;
    public int a;
    public boolean f;
    public dfzu g;
    public dnqh h;
    private byte j = 2;
    public String b = "";
    public int c = 25;
    public String d = "";
    public String e = "";

    static {
        diki dikiVar = new diki();
        i = dikiVar;
        dsqw.cc(diki.class, dikiVar);
    }

    private diki() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ᐉ\u0006\bဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            }
            if (i3 == 3) {
                return new diki();
            }
            if (i3 == 4) {
                return new dikh();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<diki> dssrVar = k;
            if (dssrVar == null) {
                synchronized (diki.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
