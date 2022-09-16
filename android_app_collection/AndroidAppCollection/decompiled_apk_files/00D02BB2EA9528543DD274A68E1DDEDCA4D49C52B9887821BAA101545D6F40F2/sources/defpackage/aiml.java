package defpackage;
/* compiled from: PG */
/* renamed from: aiml  reason: default package */
/* loaded from: classes2.dex */
public final class aiml extends dsqw<aiml, aimk> implements dssk {
    public static final aiml i;
    private static volatile dssr<aiml> j;
    public int a;
    public ajja b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        aiml aimlVar = new aiml();
        i = aimlVar;
        dsqw.cc(aiml.class, aimlVar);
    }

    private aiml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new aiml();
            }
            if (i3 == 4) {
                return new aimk();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<aiml> dssrVar = j;
            if (dssrVar == null) {
                synchronized (aiml.class) {
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
