package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TileService {
    private long a;
    protected boolean b;

    public TileService() {
        this(TileServiceSwigJNI.new_Service(), true);
        TileServiceSwigJNI.TileService_director_connect(this, this.a, this.b, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileService(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(TileService tileService) {
        if (tileService == null) {
            return 0L;
        }
        return tileService.a;
    }

    public void cancel(Tile tile) {
        TileServiceSwigJNI.TileService_cancel(this.a, this, tile == null ? null : tile.bS());
    }

    public synchronized void delete() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                TileServiceSwigJNI.delete_TileService(j);
            }
            this.a = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void request(TileRequest tileRequest) {
        TileServiceSwigJNI.TileService_request(this.a, this, TileRequest.a(tileRequest), tileRequest);
    }

    protected void swigDirectorDisconnect() {
        this.b = false;
        delete();
    }
}
