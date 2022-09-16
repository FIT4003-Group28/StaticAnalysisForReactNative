package defpackage;
/* compiled from: PG */
/* renamed from: dkfe  reason: default package */
/* loaded from: classes6.dex */
public final class dkfe extends dsqw<dkfe, dkfd> implements dssk {
    public static final dkfe c;
    private static volatile dssr<dkfe> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dkfe dkfeVar = new dkfe();
        c = dkfeVar;
        dsqw.cc(dkfe.class, dkfeVar);
    }

    private dkfe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkfe();
            }
            if (i2 == 4) {
                return new dkfd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkfe.class) {
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
}
