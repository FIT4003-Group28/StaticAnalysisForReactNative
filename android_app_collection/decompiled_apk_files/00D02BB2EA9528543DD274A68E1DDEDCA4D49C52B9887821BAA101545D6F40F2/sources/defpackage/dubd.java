package defpackage;
/* compiled from: PG */
/* renamed from: dubd  reason: default package */
/* loaded from: classes6.dex */
public final class dubd extends dsqw<dubd, dubc> implements dssk {
    public static final dubd c;
    private static volatile dssr<dubd> d;
    public String a = "";
    public String b = "";

    static {
        dubd dubdVar = new dubd();
        c = dubdVar;
        dsqw.cc(dubd.class, dubdVar);
    }

    private dubd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dubd();
            }
            if (i2 == 4) {
                return new dubc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubd.class) {
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
