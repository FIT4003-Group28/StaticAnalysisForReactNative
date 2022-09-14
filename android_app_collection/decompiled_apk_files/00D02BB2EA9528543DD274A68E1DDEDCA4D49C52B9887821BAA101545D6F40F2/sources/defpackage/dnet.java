package defpackage;
/* compiled from: PG */
/* renamed from: dnet  reason: default package */
/* loaded from: classes6.dex */
public final class dnet extends dsqw<dnet, dner> implements dssk {
    public static final dnet h;
    private static volatile dssr<dnet> i;
    public int a;
    public int b;
    public dnfe c;
    public dnfe d;
    public dorz e;
    public String f = "";
    public int g;

    static {
        dnet dnetVar = new dnet();
        h = dnetVar;
        dsqw.cc(dnet.class, dnetVar);
    }

    private dnet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဉ\u0003\tဌ\u0007", new Object[]{"a", "b", "c", "d", "f", "e", "g", dnes.a});
            }
            if (i3 == 3) {
                return new dnet();
            }
            if (i3 == 4) {
                return new dner();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnet> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnet.class) {
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
