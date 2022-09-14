package defpackage;
/* compiled from: PG */
/* renamed from: ajjg  reason: default package */
/* loaded from: classes2.dex */
public final class ajjg extends dsqw<ajjg, ajjf> implements dssk {
    public static final ajjg d;
    private static volatile dssr<ajjg> e;
    public int a;
    public ajja b;
    public ajje c;

    static {
        ajjg ajjgVar = new ajjg();
        d = ajjgVar;
        dsqw.cc(ajjg.class, ajjgVar);
    }

    private ajjg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ajjg();
            }
            if (i2 == 4) {
                return new ajjf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajjg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ajjg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
