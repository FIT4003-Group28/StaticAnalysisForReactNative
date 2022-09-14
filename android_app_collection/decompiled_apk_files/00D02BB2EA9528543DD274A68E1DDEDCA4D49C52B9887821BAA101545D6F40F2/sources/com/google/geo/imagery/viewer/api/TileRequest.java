package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TileRequest {
    private long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public TileRequest(long j) {
        this.a = j;
    }

    public static long a(TileRequest tileRequest) {
        if (tileRequest == null) {
            return 0L;
        }
        return tileRequest.a;
    }
}
