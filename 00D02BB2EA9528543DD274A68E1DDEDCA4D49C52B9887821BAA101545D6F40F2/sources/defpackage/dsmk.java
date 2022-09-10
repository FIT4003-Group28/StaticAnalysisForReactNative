package defpackage;
/* compiled from: PG */
/* renamed from: dsmk  reason: default package */
/* loaded from: classes6.dex */
public final class dsmk extends dsqw<dsmk, dsmj> implements dssk {
    public static final dsmk c;
    private static volatile dssr<dsmk> e;
    public int a;
    public int b;
    private boolean d;

    static {
        dsmk dsmkVar = new dsmk();
        c = dsmkVar;
        dsqw.cc(dsmk.class, dsmkVar);
    }

    private dsmk() {
    }

    public static /* synthetic */ void b(dsmk dsmkVar) {
        dsmkVar.a |= 2;
        dsmkVar.d = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dsmk();
            }
            if (i2 == 4) {
                return new dsmj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsmk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsmk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
