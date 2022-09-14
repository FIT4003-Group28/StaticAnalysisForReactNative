package defpackage;
/* compiled from: PG */
/* renamed from: diza  reason: default package */
/* loaded from: classes6.dex */
public final class diza extends dsqw<diza, diyz> implements dssk {
    public static final diza c;
    private static volatile dssr<diza> e;
    public String a = "";
    public dpuq b;
    private int d;

    static {
        diza dizaVar = new diza();
        c = dizaVar;
        dsqw.cc(diza.class, dizaVar);
    }

    private diza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new diza();
            }
            if (i2 == 4) {
                return new diyz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diza> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diza.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
