package defpackage;
/* compiled from: PG */
/* renamed from: dwcg  reason: default package */
/* loaded from: classes.dex */
public final class dwcg extends dsqw<dwcg, dwcb> implements dssk {
    public static final dwcg g;
    private static volatile dssr<dwcg> h;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dwcg dwcgVar = new dwcg();
        g = dwcgVar;
        dsqw.cc(dwcg.class, dwcgVar);
    }

    private dwcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဈ\u0004", new Object[]{"c", "b", "a", "d", "e", dwcf.class, dwcd.class, "f"});
            }
            if (i2 == 3) {
                return new dwcg();
            }
            if (i2 == 4) {
                return new dwcb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwcg.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
