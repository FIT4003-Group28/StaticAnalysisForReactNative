package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AreaConnectivityRequest extends dsqw<AreaConnectivityRequest, dfsa> implements dssk {
    public static final AreaConnectivityRequest d;
    private static volatile dssr<AreaConnectivityRequest> e;
    public int a;
    public String b = "";
    public dhjz c;

    static {
        AreaConnectivityRequest areaConnectivityRequest = new AreaConnectivityRequest();
        d = areaConnectivityRequest;
        dsqw.cc(AreaConnectivityRequest.class, areaConnectivityRequest);
    }

    private AreaConnectivityRequest() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new AreaConnectivityRequest();
            }
            if (i2 == 4) {
                return new dfsa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<AreaConnectivityRequest> dssrVar = e;
            if (dssrVar == null) {
                synchronized (AreaConnectivityRequest.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
