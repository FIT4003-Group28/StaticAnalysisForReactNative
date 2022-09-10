package defpackage;
/* compiled from: PG */
/* renamed from: dign  reason: default package */
/* loaded from: classes6.dex */
public final class dign extends dsqw<dign, digj> implements dssk {
    public static final dign g;
    private static volatile dssr<dign> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public dnwb e;
    public digl f;
    private dnqh h;
    private byte i = 2;

    static {
        dign dignVar = new dign();
        g = dignVar;
        dsqw.cc(dign.class, dignVar);
    }

    private dign() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0001\u0002ဌ\u0002\u0003င\u0003\u0004င\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "h", "b", digm.a, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dign();
            }
            if (i2 == 4) {
                return new digj();
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
            dssr<dign> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dign.class) {
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
