package defpackage;
/* compiled from: PG */
/* renamed from: djcg  reason: default package */
/* loaded from: classes6.dex */
public final class djcg extends dsqw<djcg, djcf> implements dssk {
    public static final djcg f;
    private static volatile dssr<djcg> i;
    public int a;
    public int c;
    private dnqh g;
    private byte h = 2;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        djcg djcgVar = new djcg();
        f = djcgVar;
        dsqw.cc(djcg.class, djcgVar);
    }

    private djcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", dqjh.c(), "d", "e", "g"});
            }
            if (i3 == 3) {
                return new djcg();
            }
            if (i3 == 4) {
                return new djcf();
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
            dssr<djcg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djcg.class) {
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
