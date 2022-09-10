package defpackage;
/* compiled from: PG */
/* renamed from: dwbw  reason: default package */
/* loaded from: classes6.dex */
public final class dwbw extends dsqw<dwbw, dwbv> implements dssk {
    public static final dwbw d;
    private static volatile dssr<dwbw> g;
    public int a;
    public dhjx c;
    private dnqh e;
    private byte f = 2;
    public String b = "";

    static {
        dwbw dwbwVar = new dwbw();
        d = dwbwVar;
        dsqw.cc(dwbw.class, dwbwVar);
    }

    private dwbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dwbw();
            }
            if (i2 == 4) {
                return new dwbv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwbw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwbw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
