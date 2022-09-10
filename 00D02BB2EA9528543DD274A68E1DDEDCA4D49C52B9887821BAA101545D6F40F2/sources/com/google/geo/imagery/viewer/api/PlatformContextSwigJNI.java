package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlatformContextSwigJNI {
    static {
        swig_module_init();
    }

    public static final native void PlatformContext_director_connect(PlatformContext platformContext, long j, boolean z, boolean z2);

    public static final native long PlatformContext_getConnectivityService(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getConnectivityServiceSwigExplicitPlatformContext(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getIconService(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getIconServiceSwigExplicitPlatformContext(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getSchedulingService(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getSchedulingServiceSwigExplicitPlatformContext(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getTextService(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getTextServiceSwigExplicitPlatformContext(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getTileService(long j, PlatformContext platformContext);

    public static final native long PlatformContext_getTileServiceSwigExplicitPlatformContext(long j, PlatformContext platformContext);

    public static long SwigDirector_PlatformContext_getConnectivityService(PlatformContext platformContext) {
        return ConnectivityService.getCPtr(platformContext.getConnectivityService());
    }

    public static long SwigDirector_PlatformContext_getIconService(PlatformContext platformContext) {
        return IconService.getCPtr(platformContext.getIconService());
    }

    public static long SwigDirector_PlatformContext_getSchedulingService(PlatformContext platformContext) {
        return SchedulingService.getCPtr(platformContext.getSchedulingService());
    }

    public static long SwigDirector_PlatformContext_getTextService(PlatformContext platformContext) {
        return TextService.getCPtr(platformContext.getTextService());
    }

    public static long SwigDirector_PlatformContext_getTileService(PlatformContext platformContext) {
        return TileService.getCPtr(platformContext.getTileService());
    }

    public static final native void delete_PlatformContext(long j);

    public static final native long new_PlatformContext();

    private static final native void swig_module_init();
}
