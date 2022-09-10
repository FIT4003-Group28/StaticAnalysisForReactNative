package defpackage;
/* compiled from: PG */
/* renamed from: dxnr  reason: default package */
/* loaded from: classes6.dex */
public final class dxnr extends dsqw<dxnr, dxnq> implements dssk {
    public static final dxnr i;
    private static volatile dssr<dxnr> j;
    public dxnc b;
    public dxnc c;
    public boolean h;
    public String a = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        dxnr dxnrVar = new dxnr();
        i = dxnrVar;
        dsqw.cc(dxnr.class, dxnrVar);
    }

    private dxnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dxnr();
            }
            if (i3 == 4) {
                return new dxnq();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dxnr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dxnr.class) {
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
