package defpackage;
/* compiled from: PG */
/* renamed from: dwmg  reason: default package */
/* loaded from: classes6.dex */
public final class dwmg extends dsqw<dwmg, dwmd> implements dssk {
    public static final dwmg b;
    private static volatile dssr<dwmg> c;
    public dsrj<dwmf> a = dssu.b;

    static {
        dwmg dwmgVar = new dwmg();
        b = dwmgVar;
        dsqw.cc(dwmg.class, dwmgVar);
    }

    private dwmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dwmf.class});
            }
            if (i2 == 3) {
                return new dwmg();
            }
            if (i2 == 4) {
                return new dwmd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwmg.class) {
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
