package defpackage;
/* compiled from: PG */
/* renamed from: djqa  reason: default package */
/* loaded from: classes6.dex */
public final class djqa extends dsqw<djqa, djpz> implements dssk {
    public static final djqa d;
    private static volatile dssr<djqa> f;
    public dsrj<djqk> a = dssu.b;
    public String b = "";
    public int c;
    private int e;

    static {
        djqa djqaVar = new djqa();
        d = djqaVar;
        dsqw.cc(djqa.class, djqaVar);
    }

    private djqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0001\u0004ဌ\u0002", new Object[]{"e", "a", djqk.class, "b", "c", dpxn.a});
            }
            if (i2 == 3) {
                return new djqa();
            }
            if (i2 == 4) {
                return new djpz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djqa.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
