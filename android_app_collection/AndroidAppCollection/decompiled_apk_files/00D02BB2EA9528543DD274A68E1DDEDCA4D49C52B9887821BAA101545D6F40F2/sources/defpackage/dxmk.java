package defpackage;
/* compiled from: PG */
/* renamed from: dxmk  reason: default package */
/* loaded from: classes6.dex */
public final class dxmk extends dsqw<dxmk, dxmj> implements dssk {
    public static final dxmk c;
    private static volatile dssr<dxmk> d;
    public String a = "";
    public String b = "";

    static {
        dxmk dxmkVar = new dxmk();
        c = dxmkVar;
        dsqw.cc(dxmk.class, dxmkVar);
    }

    private dxmk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxmk();
            }
            if (i2 == 4) {
                return new dxmj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxmk.class) {
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
