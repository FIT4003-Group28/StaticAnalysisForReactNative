package defpackage;
/* compiled from: PG */
/* renamed from: doud  reason: default package */
/* loaded from: classes6.dex */
public final class doud extends dsqw<doud, douc> implements dssk {
    public static final doud c;
    private static volatile dssr<doud> d;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;

    static {
        doud doudVar = new doud();
        c = doudVar;
        dsqw.cc(doud.class, doudVar);
    }

    private doud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001/\u0002/", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new doud();
            }
            if (i2 == 4) {
                return new douc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doud> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doud.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrf dsrfVar = this.a;
        if (!dsrfVar.a()) {
            this.a = dsqw.cg(dsrfVar);
        }
    }

    public final void c() {
        dsrf dsrfVar = this.b;
        if (!dsrfVar.a()) {
            this.b = dsqw.cg(dsrfVar);
        }
    }
}
