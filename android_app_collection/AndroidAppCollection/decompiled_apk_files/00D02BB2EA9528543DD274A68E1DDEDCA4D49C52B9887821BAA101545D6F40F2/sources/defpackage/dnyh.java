package defpackage;
/* compiled from: PG */
/* renamed from: dnyh  reason: default package */
/* loaded from: classes6.dex */
public final class dnyh extends dsqw<dnyh, dnyf> implements dssk {
    public static final dnyh d;
    private static volatile dssr<dnyh> f;
    public int a;
    public int b;
    public boolean c;
    private boolean e;

    static {
        dnyh dnyhVar = new dnyh();
        d = dnyhVar;
        dsqw.cc(dnyh.class, dnyhVar);
    }

    private dnyh() {
    }

    public static /* synthetic */ void b(dnyh dnyhVar) {
        dnyhVar.a |= 4;
        dnyhVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", dnyg.a, "e", "c"});
            }
            if (i2 == 3) {
                return new dnyh();
            }
            if (i2 == 4) {
                return new dnyf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnyh.class) {
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
