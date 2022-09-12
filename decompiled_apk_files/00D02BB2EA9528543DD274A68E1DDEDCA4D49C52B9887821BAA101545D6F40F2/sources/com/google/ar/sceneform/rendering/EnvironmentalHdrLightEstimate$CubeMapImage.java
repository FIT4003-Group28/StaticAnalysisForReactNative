package com.google.ar.sceneform.rendering;

import java.io.Serializable;
/* compiled from: PG */
/* loaded from: classes5.dex */
class EnvironmentalHdrLightEstimate$CubeMapImage implements Serializable {
    final int format;
    final int height;
    final CubeMapPlane[] planes;
    final long timestamp;
    final int width;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    class CubeMapPlane implements Serializable {
        final byte[] bytes;
        final int pixelStride;
        final int rowStride;
    }
}
