package defpackage;
/* compiled from: PG */
/* renamed from: duai  reason: default package */
/* loaded from: classes6.dex */
public final class duai extends dsqw<duai, duah> implements dssk {
    public static final duai b;
    private static volatile dssr<duai> c;
    public String a = "";

    static {
        duai duaiVar = new duai();
        b = duaiVar;
        dsqw.cc(duai.class, duaiVar);
    }

    private duai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new duai();
            }
            if (i2 == 4) {
                return new duah();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duai> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duai.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
