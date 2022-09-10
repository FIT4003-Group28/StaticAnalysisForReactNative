package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconService {
    private long a;
    protected boolean b;

    public IconService() {
        this(IconServiceSwigJNI.new_Service(), true);
        IconServiceSwigJNI.IconService_director_connect(this, this.a, this.b, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IconService(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(IconService iconService) {
        if (iconService == null) {
            return 0L;
        }
        return iconService.a;
    }

    public void cancel(IconSource iconSource) {
        IconServiceSwigJNI.IconService_cancel(this.a, this, iconSource == null ? null : iconSource.bS());
    }

    public synchronized void delete() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                IconServiceSwigJNI.delete_IconService(j);
            }
            this.a = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void request(IconRequest iconRequest) {
        IconServiceSwigJNI.IconService_request(this.a, this, IconRequest.a(iconRequest), iconRequest);
    }

    protected void swigDirectorDisconnect() {
        this.b = false;
        delete();
    }
}
