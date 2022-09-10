package defpackage;
/* compiled from: PG */
/* renamed from: diji  reason: default package */
/* loaded from: classes6.dex */
public final class diji extends dsqw<diji, dijh> implements dssk {
    public static final diji e;
    private static volatile dssr<diji> h;
    public int a;
    public int c;
    public diwd d;
    private dnqh f;
    private byte g = 2;
    public String b = "";

    static {
        diji dijiVar = new diji();
        e = dijiVar;
        dsqw.cc(diji.class, dijiVar);
    }

    private diji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဉ\u0002\u0005ဌ\u0001\u0006ᐉ\u0003", new Object[]{"a", "b", "d", "c", dpuk.c(), "f"});
            }
            if (i2 == 3) {
                return new diji();
            }
            if (i2 == 4) {
                return new dijh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<diji> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diji.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
