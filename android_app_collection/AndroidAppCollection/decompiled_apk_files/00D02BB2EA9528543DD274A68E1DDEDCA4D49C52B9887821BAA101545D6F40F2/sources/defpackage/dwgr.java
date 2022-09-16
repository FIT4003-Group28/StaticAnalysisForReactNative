package defpackage;
/* compiled from: PG */
/* renamed from: dwgr  reason: default package */
/* loaded from: classes6.dex */
public final class dwgr extends dsqw<dwgr, dwgo> implements dssk {
    public static final dwgr g;
    private static volatile dssr<dwgr> j;
    public int a;
    public int b;
    public dggg c;
    private dnqh h;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dwgr dwgrVar = new dwgr();
        g = dwgrVar;
        dsqw.cc(dwgr.class, dwgrVar);
    }

    private dwgr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0007ဈ\u0007\bဈ\u0004", new Object[]{"a", "h", "b", dwgq.c(), "c", "d", "f", "e"});
            }
            if (i2 == 3) {
                return new dwgr();
            }
            if (i2 == 4) {
                return new dwgo();
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
            dssr<dwgr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwgr.class) {
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
