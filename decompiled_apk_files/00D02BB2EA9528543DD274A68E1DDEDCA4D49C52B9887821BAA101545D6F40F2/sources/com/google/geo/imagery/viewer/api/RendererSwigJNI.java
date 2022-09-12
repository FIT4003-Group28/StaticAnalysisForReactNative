package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RendererSwigJNI {
    static {
        swig_module_init();
    }

    public static final native void Callback_director_connect(Callback callback, long j, boolean z, boolean z2);

    public static final native void Callback_onComplete(long j, Callback callback, int i, long j2, PhotoHandle photoHandle);

    public static final native void Callback_onCompleteSwigExplicitCallback(long j, Callback callback, int i, long j2, PhotoHandle photoHandle);

    public static final native byte[] PhotoHandle_getPhotoId(long j, PhotoHandle photoHandle);

    public static final native void Renderer_abandonPendingCallbacks(long j, Renderer renderer);

    public static final native void Renderer_clearCache(long j, Renderer renderer);

    public static final native void Renderer_clearRouteArrow(long j, Renderer renderer);

    public static final native byte[] Renderer_computeRelativeOrientation(long j, Renderer renderer, byte[] bArr, byte[] bArr2);

    public static final native void Renderer_createPhoto(long j, Renderer renderer, byte[] bArr, long j2, Callback callback);

    public static final native long Renderer_createRendererWithDefaults(long j, PlatformContext platformContext, boolean z);

    public static final native byte[] Renderer_findClickTarget__SWIG_0(long j, Renderer renderer, byte[] bArr, float f, float f2, long j2, byte[] bArr2);

    public static final native long Renderer_getSwipe(long j, Renderer renderer);

    public static final native void Renderer_onSurfaceCreated(long j, Renderer renderer);

    public static final native byte[] Renderer_render(long j, Renderer renderer, byte[] bArr, byte[] bArr2);

    public static final native int Renderer_setPhotos__SWIG_0(long j, Renderer renderer, long j2, PhotoHandle photoHandle);

    public static final native int Renderer_setPhotos__SWIG_1(long j, Renderer renderer, long j2, PhotoHandle photoHandle, long j3, PhotoHandle photoHandle2);

    public static final native void Renderer_setRouteArrow(long j, Renderer renderer, double d, double d2);

    public static final native void Renderer_setWireframeRendering(long j, Renderer renderer, boolean z);

    public static void SwigDirector_Callback_onComplete(Callback callback, int i, long j) {
        callback.onComplete(i, new PhotoHandle(j));
    }

    public static final native void delete_Callback(long j);

    public static final native void delete_PhotoHandle(long j);

    public static final native void delete_Renderer(long j);

    public static final native long new_Callback();

    private static final native void swig_module_init();
}
