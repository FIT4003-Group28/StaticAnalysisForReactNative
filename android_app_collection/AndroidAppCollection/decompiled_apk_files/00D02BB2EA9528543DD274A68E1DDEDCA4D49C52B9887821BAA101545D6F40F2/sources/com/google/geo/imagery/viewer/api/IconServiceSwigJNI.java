package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconServiceSwigJNI {
    static {
        swig_module_init();
    }

    public static final native void IconRequestContainer_onCompleteImage(long j, IconRequestContainer iconRequestContainer, long j2, Image image);

    public static final native byte[] IconRequestContainer_rawRequest(long j, IconRequestContainer iconRequestContainer);

    public static final native void IconService_cancel(long j, IconService iconService, byte[] bArr);

    public static final native void IconService_director_connect(IconService iconService, long j, boolean z, boolean z2);

    public static final native void IconService_request(long j, IconService iconService, long j2, IconRequest iconRequest);

    public static void SwigDirector_IconService_cancel(IconService iconService, byte[] bArr) {
        IconSource iconSource;
        if (bArr == null) {
            iconSource = null;
        } else {
            try {
                iconSource = (IconSource) dsqw.cr(IconSource.d, bArr, dsqa.c());
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.IconSource protocol message.", e);
            }
        }
        iconService.cancel(iconSource);
    }

    public static void SwigDirector_IconService_request(IconService iconService, long j) {
        iconService.request(j == 0 ? null : new IconRequest(j));
    }

    public static final native void delete_IconRequestContainer(long j);

    public static final native void delete_IconService(long j);

    public static final native long new_RequestContainer(long j, IconRequest iconRequest);

    public static final native long new_Service();

    private static final native void swig_module_init();
}
