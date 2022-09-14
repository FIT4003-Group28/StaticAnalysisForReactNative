package defpackage;
/* compiled from: PG */
/* renamed from: dtzk  reason: default package */
/* loaded from: classes6.dex */
public final class dtzk extends dsqw<dtzk, dtzi> implements dssk {
    public static final dtzk i;
    private static volatile dssr<dtzk> j;
    public int c;
    public String a = "";
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        dtzk dtzkVar = new dtzk();
        i = dtzkVar;
        dsqw.cc(dtzk.class, dtzkVar);
    }

    private dtzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dtzk();
            }
            if (i3 == 4) {
                return new dtzi();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtzk> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtzk.class) {
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
