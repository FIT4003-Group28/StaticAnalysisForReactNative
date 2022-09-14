package defpackage;
/* compiled from: PG */
/* renamed from: dubn  reason: default package */
/* loaded from: classes6.dex */
public final class dubn extends dsqw<dubn, dubi> implements dssk {
    public static final dubn c;
    private static volatile dssr<dubn> d;
    public dubm a;
    public String b = "";

    static {
        dubn dubnVar = new dubn();
        c = dubnVar;
        dsqw.cc(dubn.class, dubnVar);
    }

    private dubn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dubn();
            }
            if (i2 == 4) {
                return new dubi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
