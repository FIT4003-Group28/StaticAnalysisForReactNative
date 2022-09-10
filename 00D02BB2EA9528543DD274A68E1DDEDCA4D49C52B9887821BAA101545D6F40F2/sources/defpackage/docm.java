package defpackage;
/* compiled from: PG */
/* renamed from: docm  reason: default package */
/* loaded from: classes6.dex */
public final class docm extends dsqw<docm, doch> implements dssk {
    public static final docm i;
    private static volatile dssr<docm> j;
    public int a;
    public boolean d;
    public docl h;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        docm docmVar = new docm();
        i = docmVar;
        dsqw.cc(docm.class, docmVar);
    }

    private docm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\tဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new docm();
            }
            if (i3 == 4) {
                return new doch();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<docm> dssrVar = j;
            if (dssrVar == null) {
                synchronized (docm.class) {
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
