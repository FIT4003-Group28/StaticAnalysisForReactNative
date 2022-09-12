package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextServiceSwigJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_TextService_cancel(TextService textService, byte[] bArr) {
        Text text;
        if (bArr == null) {
            text = null;
        } else {
            try {
                text = (Text) dsqw.cr(Text.k, bArr, dsqa.c());
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.Text protocol message.", e);
            }
        }
        textService.cancel(text);
    }

    public static void SwigDirector_TextService_request(TextService textService, long j) {
        textService.request(j == 0 ? null : new TextRequest(j));
    }

    public static final native void TextRequestContainer_onCompleteImage(long j, TextRequestContainer textRequestContainer, long j2, Image image);

    public static final native byte[] TextRequestContainer_rawRequest(long j, TextRequestContainer textRequestContainer);

    public static final native void TextService_cancel(long j, TextService textService, byte[] bArr);

    public static final native void TextService_director_connect(TextService textService, long j, boolean z, boolean z2);

    public static final native void TextService_request(long j, TextService textService, long j2, TextRequest textRequest);

    public static final native void delete_TextRequestContainer(long j);

    public static final native void delete_TextService(long j);

    public static final native long new_RequestContainer(long j, TextRequest textRequest);

    public static final native long new_Service();

    private static final native void swig_module_init();
}
