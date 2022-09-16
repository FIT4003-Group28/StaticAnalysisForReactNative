package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TileServiceSwigJNI {
    static {
        swig_module_init();
    }

    public static void SwigDirector_TileService_cancel(TileService tileService, byte[] bArr) {
        Tile tile;
        if (bArr == null) {
            tile = null;
        } else {
            try {
                tile = (Tile) dsqw.cr(Tile.e, bArr, dsqa.c());
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.Tile protocol message.", e);
            }
        }
        tileService.cancel(tile);
    }

    public static void SwigDirector_TileService_request(TileService tileService, long j) {
        tileService.request(j == 0 ? null : new TileRequest(j));
    }

    public static final native void TileRequestContainer_onCompleteImage(long j, TileRequestContainer tileRequestContainer, long j2, Image image);

    public static final native byte[] TileRequestContainer_rawRequest(long j, TileRequestContainer tileRequestContainer);

    public static final native void TileService_cancel(long j, TileService tileService, byte[] bArr);

    public static final native void TileService_director_connect(TileService tileService, long j, boolean z, boolean z2);

    public static final native void TileService_request(long j, TileService tileService, long j2, TileRequest tileRequest);

    public static final native void delete_TileRequestContainer(long j);

    public static final native void delete_TileService(long j);

    public static final native long new_RequestContainer(long j, TileRequest tileRequest);

    public static final native long new_Service();

    private static final native void swig_module_init();
}
