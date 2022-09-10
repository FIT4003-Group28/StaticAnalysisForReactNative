package defpackage;
/* compiled from: PG */
/* renamed from: duan  reason: default package */
/* loaded from: classes.dex */
public final class duan extends dsqw<duan, duam> implements dssk {
    public static final duan d;
    private static volatile dssr<duan> e;
    public int a;
    public int b;
    public String c = "";

    static {
        duan duanVar = new duan();
        d = duanVar;
        dsqw.cc(duan.class, duanVar);
    }

    private duan() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new duan();
            }
            if (i2 == 4) {
                return new duam();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duan> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duan.class) {
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
