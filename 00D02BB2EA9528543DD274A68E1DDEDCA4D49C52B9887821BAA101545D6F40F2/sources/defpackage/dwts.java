package defpackage;
/* compiled from: PG */
/* renamed from: dwts  reason: default package */
/* loaded from: classes6.dex */
public final class dwts extends dsqw<dwts, dwtq> implements dssk {
    public static final dwts g;
    private static volatile dssr<dwts> i;
    public int a;
    public Object c;
    public int b = 0;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dwts dwtsVar = new dwts();
        g = dwtsVar;
        dsqw.cc(dwts.class, dwtsVar);
    }

    private dwts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0005ြ\u0000\u0006ᐼ\u0000", new Object[]{"c", "b", "a", dwuk.class, "d", "e", "f", dwtp.class, dwug.class});
            }
            if (i3 == 3) {
                return new dwts();
            }
            if (i3 == 4) {
                return new dwtq();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwts> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwts.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
