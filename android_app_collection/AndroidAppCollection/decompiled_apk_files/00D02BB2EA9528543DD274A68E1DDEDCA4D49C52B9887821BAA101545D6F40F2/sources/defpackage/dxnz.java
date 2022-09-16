package defpackage;
/* compiled from: PG */
/* renamed from: dxnz  reason: default package */
/* loaded from: classes6.dex */
public final class dxnz extends dsqw<dxnz, dxny> implements dssk {
    public static final dxnz d;
    private static volatile dssr<dxnz> e;
    public boolean b;
    public String a = "";
    public String c = "";

    static {
        dxnz dxnzVar = new dxnz();
        d = dxnzVar;
        dsqw.cc(dxnz.class, dxnzVar);
    }

    private dxnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxnz();
            }
            if (i2 == 4) {
                return new dxny();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxnz.class) {
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
