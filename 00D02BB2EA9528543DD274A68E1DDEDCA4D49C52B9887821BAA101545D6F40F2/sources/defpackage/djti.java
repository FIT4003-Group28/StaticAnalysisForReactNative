package defpackage;
/* compiled from: PG */
/* renamed from: djti  reason: default package */
/* loaded from: classes6.dex */
public final class djti extends dsqw<djti, djtb> implements dssk {
    public static final djti f;
    private static volatile dssr<djti> i;
    public int a;
    public Object c;
    public dpsn d;
    private dnqh g;
    public int b = 0;
    private byte h = 2;
    public String e = "";

    static {
        djti djtiVar = new djti();
        f = djtiVar;
        dsqw.cc(djti.class, djtiVar);
    }

    private djti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0003\b\u0005\u0000\u0000\u0001\u0003ဈ\u0001\u0004ြ\u0000\u0005ြ\u0000\u0006ᐉ\u0004\bဉ\u0000", new Object[]{"c", "b", "a", "e", djth.class, djtd.class, "g", "d"});
            }
            if (i3 == 3) {
                return new djti();
            }
            if (i3 == 4) {
                return new djtb();
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
            dssr<djti> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djti.class) {
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
