package defpackage;
/* compiled from: PG */
/* renamed from: dtvk  reason: default package */
/* loaded from: classes6.dex */
public final class dtvk extends dsqw<dtvk, dtvj> implements dssk {
    public static final dtvk f;
    private static volatile dssr<dtvk> g;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public String d = "";
    public String e = "";

    static {
        dtvk dtvkVar = new dtvk();
        f = dtvkVar;
        dsqw.cc(dtvk.class, dtvkVar);
    }

    private dtvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtvk();
            }
            if (i2 == 4) {
                return new dtvj();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtvk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
