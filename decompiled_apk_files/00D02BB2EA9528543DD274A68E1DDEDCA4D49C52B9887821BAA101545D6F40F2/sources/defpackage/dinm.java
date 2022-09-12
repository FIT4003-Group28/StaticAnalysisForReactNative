package defpackage;
/* compiled from: PG */
/* renamed from: dinm  reason: default package */
/* loaded from: classes6.dex */
public final class dinm extends dsqw<dinm, dinc> implements dssk {
    public static final dinm i;
    private static volatile dssr<dinm> j;
    public int a;
    public dinl c;
    public dinh d;
    public boolean f;
    public dinb h;
    public String b = "";
    public String e = "";
    public dsrj<drfc> g = dssu.b;

    static {
        dinm dinmVar = new dinm();
        i = dinmVar;
        dsqw.cc(dinm.class, dinmVar);
    }

    private dinm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0003\u0004\u001b\u0005ဉ\u0005\u0006ဉ\u0002\u0007ဉ\u0001\tဇ\u0004", new Object[]{"a", "b", "e", "g", drfc.class, "h", "d", "c", "f"});
            }
            if (i3 == 3) {
                return new dinm();
            }
            if (i3 == 4) {
                return new dinc();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dinm> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dinm.class) {
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
