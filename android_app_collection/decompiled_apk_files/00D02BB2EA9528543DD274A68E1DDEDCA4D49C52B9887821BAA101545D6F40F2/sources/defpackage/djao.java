package defpackage;
/* compiled from: PG */
/* renamed from: djao  reason: default package */
/* loaded from: classes6.dex */
public final class djao extends dsqw<djao, djan> implements dssk {
    public static final djao i;
    private static volatile dssr<djao> j;
    public int a;
    public djam b;
    public int d;
    public djam f;
    public djam g;
    public dsrj<djam> c = dssu.b;
    public String e = "";
    public dsrj<dqcq> h = dssu.b;

    static {
        djao djaoVar = new djao();
        i = djaoVar;
        dsqw.cc(djao.class, djaoVar);
    }

    private djao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004ဈ\u0002\u0006ဉ\u0003\b\u001b\tဉ\u0004", new Object[]{"a", "b", "c", djam.class, "d", "e", "f", "h", dqcq.class, "g"});
            }
            if (i3 == 3) {
                return new djao();
            }
            if (i3 == 4) {
                return new djan();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djao> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djao.class) {
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
