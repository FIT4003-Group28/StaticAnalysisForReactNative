package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconRendererSwigJNI {
    public static final native boolean IconHandle_isEqual(long j, IconHandle iconHandle, long j2, IconHandle iconHandle2);

    public static final native long IconRenderer_addIcon__SWIG_0(long j, IconRenderer iconRenderer, double d, double d2, double d3, String str);

    public static final native long IconRenderer_addIcon__SWIG_1(long j, IconRenderer iconRenderer, double d, double d2, double d3, long j2);

    public static final native void IconRenderer_clearCache(long j, IconRenderer iconRenderer);

    public static final native long IconRenderer_createRenderer(long j, PlatformContext platformContext);

    public static final native void IconRenderer_deleteIcon(long j, IconRenderer iconRenderer, long j2, IconHandle iconHandle);

    public static final native void IconRenderer_onSurfaceCreated(long j, IconRenderer iconRenderer);

    public static final native long IconRenderer_pick(long j, IconRenderer iconRenderer, byte[] bArr, float f, float f2, float f3);

    public static final native void IconRenderer_render(long j, IconRenderer iconRenderer, byte[] bArr);

    public static final native void IconRenderer_updateIcon(long j, IconRenderer iconRenderer, long j2, IconHandle iconHandle, byte[] bArr);

    public static final native void delete_IconHandle(long j);

    public static final native void delete_IconRenderer(long j);
}
