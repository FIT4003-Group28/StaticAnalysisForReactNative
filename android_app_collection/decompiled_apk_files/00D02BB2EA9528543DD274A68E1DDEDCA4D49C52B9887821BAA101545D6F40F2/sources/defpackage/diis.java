package defpackage;
/* compiled from: PG */
/* renamed from: diis  reason: default package */
/* loaded from: classes.dex */
public final class diis extends dsqw<diis, diir> implements dssk {
    public static final dsrg<Integer, diiu> d = new diiq();
    public static final diis h;
    private static volatile dssr<diis> i;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public dhpf e;
    public dhpf f;
    public dikg g;

    static {
        diis diisVar = new diis();
        h = diisVar;
        dsqw.cc(diis.class, diisVar);
    }

    private diis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0004\u001e\bဉ\u0001\nဉ\u0003\u000bဉ\u0002", new Object[]{"a", "b", diio.a, "c", diiu.c(), "e", "g", "f"});
            }
            if (i3 == 3) {
                return new diis();
            }
            if (i3 == 4) {
                return new diir();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<diis> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diis.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
