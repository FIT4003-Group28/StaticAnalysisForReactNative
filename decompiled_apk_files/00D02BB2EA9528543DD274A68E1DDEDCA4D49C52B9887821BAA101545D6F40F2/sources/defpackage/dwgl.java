package defpackage;
/* compiled from: PG */
/* renamed from: dwgl  reason: default package */
/* loaded from: classes6.dex */
public final class dwgl extends dsqw<dwgl, dwgg> implements dssk {
    public static final dwgl i;
    private static volatile dssr<dwgl> j;
    public int a;
    public int c;
    public dizb e;
    public boolean f;
    public dwgi g;
    public dwgk h;
    public dsrj<dwfl> b = dssu.b;
    public String d = "";

    static {
        dwgl dwglVar = new dwgl();
        i = dwglVar;
        dsqw.cc(dwgl.class, dwglVar);
    }

    private dwgl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဈ\u0001\u0005ဉ\u0002\u0006ဇ\u0003\tဉ\u0006\nဉ\u0007", new Object[]{"a", "b", dwfl.class, "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dwgl();
            }
            if (i3 == 4) {
                return new dwgg();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dwgl> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwgl.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
