package defpackage;
/* compiled from: PG */
/* renamed from: dwmx  reason: default package */
/* loaded from: classes6.dex */
public final class dwmx extends dsqw<dwmx, dwmu> implements dssk {
    public static final dwmx i;
    private static volatile dssr<dwmx> k;
    public int a;
    public dvyw c;
    public dosf d;
    public int e;
    public dqbz f;
    private byte j = 2;
    public String b = "";
    public dsrj<dwmz> g = dssu.b;
    public dsrj<dwfl> h = dssu.b;

    static {
        dwmx dwmxVar = new dwmx();
        i = dwmxVar;
        dsqw.cc(dwmx.class, dwmxVar);
    }

    private dwmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0002\u0001\u0002ဉ\u0002\u0003ᐉ\u0001\u0006\u001b\u0007\u001b\bဌ\u0003\tဈ\u0000\nဉ\u0004", new Object[]{"a", "d", "c", "h", dwfl.class, "g", dwmz.class, "e", dwmv.a, "b", "f"});
            }
            if (i3 == 3) {
                return new dwmx();
            }
            if (i3 == 4) {
                return new dwmu();
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
            dssr<dwmx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dwmx.class) {
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
