package defpackage;
/* compiled from: PG */
/* renamed from: diao  reason: default package */
/* loaded from: classes6.dex */
public final class diao extends dsqw<diao, dian> implements dssk {
    public static final diao a;
    private static volatile dssr<diao> b;

    static {
        diao diaoVar = new diao();
        a = diaoVar;
        dsqw.cc(diao.class, diaoVar);
    }

    private diao() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diao();
            }
            if (i2 == 4) {
                return new dian();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diao> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diao.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}