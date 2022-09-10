package defpackage;
/* compiled from: PG */
/* renamed from: ajji  reason: default package */
/* loaded from: classes2.dex */
public final class ajji extends dsqw<ajji, ajjh> implements dssk {
    public static final ajji e;
    private static volatile dssr<ajji> f;
    public int a;
    public String b = "";
    public dobx c;
    public long d;

    static {
        ajji ajjiVar = new ajji();
        e = ajjiVar;
        dsqw.cc(ajji.class, ajjiVar);
    }

    private ajji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ajji();
            }
            if (i2 == 4) {
                return new ajjh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajji> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ajji.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
