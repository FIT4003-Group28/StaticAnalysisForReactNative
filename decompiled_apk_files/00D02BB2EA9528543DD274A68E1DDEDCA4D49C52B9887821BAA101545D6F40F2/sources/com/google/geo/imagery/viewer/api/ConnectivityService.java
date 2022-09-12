package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConnectivityService {
    protected boolean a;
    private long b;

    public ConnectivityService() {
        this(ConnectivityServiceSwigJNI.new_Service(), true);
        ConnectivityServiceSwigJNI.ConnectivityService_director_connect(this, this.b, this.a, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ConnectivityService(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(ConnectivityService connectivityService) {
        if (connectivityService == null) {
            return 0L;
        }
        return connectivityService.b;
    }

    public void cancel(AreaConnectivityRequest areaConnectivityRequest) {
        ConnectivityServiceSwigJNI.ConnectivityService_cancel(this.b, this, areaConnectivityRequest == null ? null : areaConnectivityRequest.bS());
    }

    public synchronized void delete() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                ConnectivityServiceSwigJNI.delete_ConnectivityService(j);
            }
            this.b = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void request(ConnectivityRequest connectivityRequest) {
        ConnectivityServiceSwigJNI.ConnectivityService_request(this.b, this, ConnectivityRequest.a(connectivityRequest), connectivityRequest);
    }

    protected void swigDirectorDisconnect() {
        this.a = false;
        delete();
    }
}
