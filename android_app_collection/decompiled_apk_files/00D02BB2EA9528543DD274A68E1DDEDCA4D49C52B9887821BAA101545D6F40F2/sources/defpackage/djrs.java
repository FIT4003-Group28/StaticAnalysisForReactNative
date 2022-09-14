package defpackage;
/* compiled from: PG */
/* renamed from: djrs  reason: default package */
/* loaded from: classes.dex */
public final class djrs extends dsqw<djrs, djrr> implements dssk {
    public static final djrs g;
    private static volatile dssr<djrs> j;
    public int c;
    public boolean d;
    public dqfq e;
    public djrq f;
    private int h;
    private byte i = 2;
    public dsrj<djrm> a = dssu.b;
    public String b = "";

    static {
        djrs djrsVar = new djrs();
        g = djrsVar;
        dsqw.cc(djrs.class, djrsVar);
    }

    private djrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဋ\u0002\u0005ဇ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"h", "a", djrm.class, "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new djrs();
            }
            if (i2 == 4) {
                return new djrr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<djrs> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djrs.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
