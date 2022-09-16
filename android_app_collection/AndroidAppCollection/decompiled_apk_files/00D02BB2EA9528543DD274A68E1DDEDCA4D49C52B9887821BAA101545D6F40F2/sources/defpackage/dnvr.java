package defpackage;
/* compiled from: PG */
/* renamed from: dnvr  reason: default package */
/* loaded from: classes6.dex */
public final class dnvr extends dsqw<dnvr, dnvq> implements dssk {
    public static final dnvr h;
    private static volatile dssr<dnvr> i;
    public int a;
    public int b;
    public dnfe c;
    public dnfe d;
    public int e;
    public String f = "";
    public String g = "";

    static {
        dnvr dnvrVar = new dnvr();
        h = dnvrVar;
        dsqw.cc(dnvr.class, dnvrVar);
    }

    private dnvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", dqgh.c(), "c", "d", "e", dosq.c(), "f", "g"});
            }
            if (i3 == 3) {
                return new dnvr();
            }
            if (i3 == 4) {
                return new dnvq();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnvr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnvr.class) {
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
