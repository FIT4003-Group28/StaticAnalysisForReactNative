package defpackage;
/* compiled from: PG */
/* renamed from: dizr  reason: default package */
/* loaded from: classes6.dex */
public final class dizr extends dsqw<dizr, dizq> implements dssk {
    public static final dizr f;
    private static volatile dssr<dizr> i;
    public int a;
    public dggg b;
    public int c;
    public int d;
    private dnqh g;
    private byte h = 2;
    public String e = "";

    static {
        dizr dizrVar = new dizr();
        f = dizrVar;
        dsqw.cc(dizr.class, dizrVar);
    }

    private dizr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d", dqjh.c(), "e", "g"});
            }
            if (i3 == 3) {
                return new dizr();
            }
            if (i3 == 4) {
                return new dizq();
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
            dssr<dizr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dizr.class) {
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
