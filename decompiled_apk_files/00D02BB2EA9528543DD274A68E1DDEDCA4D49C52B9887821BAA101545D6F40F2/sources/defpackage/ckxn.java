package defpackage;
/* compiled from: PG */
/* renamed from: ckxn  reason: default package */
/* loaded from: classes5.dex */
public final class ckxn extends dsqw<ckxn, ckxm> implements dssk {
    public static final ckxn h;
    private static volatile dssr<ckxn> i;
    public int a;
    public int c;
    public int e;
    public int f;
    public String b = "";
    public String d = "";
    public String g = "";

    static {
        ckxn ckxnVar = new ckxn();
        h = ckxnVar;
        dsqw.cc(ckxn.class, ckxnVar);
    }

    private ckxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", ckxc.a, "f", ckxa.a, "g"});
            }
            if (i3 == 3) {
                return new ckxn();
            }
            if (i3 == 4) {
                return new ckxm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ckxn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ckxn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
