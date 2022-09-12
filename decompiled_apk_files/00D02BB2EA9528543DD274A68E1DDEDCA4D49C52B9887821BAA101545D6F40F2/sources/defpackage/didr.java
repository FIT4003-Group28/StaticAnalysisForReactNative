package defpackage;
/* compiled from: PG */
/* renamed from: didr  reason: default package */
/* loaded from: classes6.dex */
public final class didr extends dsqw<didr, dido> implements dssk {
    public static final didr f;
    private static volatile dssr<didr> g;
    public int a;
    public int c;
    public didu d;
    public String b = "";
    public dsrj<String> e = dssu.b;

    static {
        didr didrVar = new didr();
        f = didrVar;
        dsqw.cc(didr.class, didrVar);
    }

    private didr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004\u001a", new Object[]{"a", "b", "c", didp.a, "d", "e"});
            }
            if (i2 == 3) {
                return new didr();
            }
            if (i2 == 4) {
                return new dido();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<didr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (didr.class) {
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

    public final void b() {
        dsrj<String> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }
}
