package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import java.nio.Buffer;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ResourceLoader {
    private final long mNativeObject;

    public ResourceLoader(Engine engine) {
        this.mNativeObject = nCreateResourceLoader(engine.getNativeObject());
    }

    private static native void nAddResourceData(long j, String str, Buffer buffer, int i);

    private static native long nCreateResourceLoader(long j);

    private static native void nDestroyResourceLoader(long j);

    private static native void nLoadResources(long j, long j2);

    public ResourceLoader addResourceData(String str, Buffer buffer) {
        nAddResourceData(this.mNativeObject, str, buffer, buffer.remaining());
        return this;
    }

    public void destroy() {
        nDestroyResourceLoader(this.mNativeObject);
    }

    public ResourceLoader loadResources(FilamentAsset filamentAsset) {
        nLoadResources(this.mNativeObject, filamentAsset.getNativeObject());
        return this;
    }
}
