package defpackage;

import android.media.ImageReader;
import com.google.ar.core.SharedCamera;
/* renamed from: dbbo  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class dbbo implements ImageReader.OnImageAvailableListener {
    public static final ImageReader.OnImageAvailableListener a = new dbbo();

    private dbbo() {
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
