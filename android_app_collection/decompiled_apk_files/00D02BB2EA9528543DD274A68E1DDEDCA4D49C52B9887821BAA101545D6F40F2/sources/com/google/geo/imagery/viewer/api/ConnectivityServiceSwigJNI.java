package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConnectivityServiceSwigJNI {
    static {
        swig_module_init();
    }

    public static final native void ConnectivityRequestContainer_onCompleteOriginal(long j, ConnectivityRequestContainer connectivityRequestContainer, byte[] bArr);

    public static final native byte[] ConnectivityRequestContainer_rawRequest(long j, ConnectivityRequestContainer connectivityRequestContainer);

    public static final native void ConnectivityService_cancel(long j, ConnectivityService connectivityService, byte[] bArr);

    public static final native void ConnectivityService_director_connect(ConnectivityService connectivityService, long j, boolean z, boolean z2);

    public static final native void ConnectivityService_request(long j, ConnectivityService connectivityService, long j2, ConnectivityRequest connectivityRequest);

    public static void SwigDirector_ConnectivityService_cancel(ConnectivityService connectivityService, byte[] bArr) {
        AreaConnectivityRequest areaConnectivityRequest;
        if (bArr == null) {
            areaConnectivityRequest = null;
        } else {
            try {
                areaConnectivityRequest = (AreaConnectivityRequest) dsqw.cr(AreaConnectivityRequest.d, bArr, dsqa.c());
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.AreaConnectivityRequest protocol message.", e);
            }
        }
        connectivityService.cancel(areaConnectivityRequest);
    }

    public static void SwigDirector_ConnectivityService_request(ConnectivityService connectivityService, long j) {
        connectivityService.request(j == 0 ? null : new ConnectivityRequest(j));
    }

    public static final native void delete_ConnectivityRequestContainer(long j);

    public static final native void delete_ConnectivityService(long j);

    public static final native long new_RequestContainer(long j, ConnectivityRequest connectivityRequest);

    public static final native long new_Service();

    private static final native void swig_module_init();
}
