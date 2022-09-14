package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlatformContext {
    private long a;
    protected boolean f;

    public PlatformContext() {
        this(PlatformContextSwigJNI.new_PlatformContext(), true);
        PlatformContextSwigJNI.PlatformContext_director_connect(this, this.a, this.f, true);
    }

    protected PlatformContext(long j, boolean z) {
        this.f = true;
        this.a = j;
    }

    public static long getCPtr(PlatformContext platformContext) {
        if (platformContext == null) {
            return 0L;
        }
        return platformContext.a;
    }

    public synchronized void delete() {
        long j = this.a;
        if (j != 0) {
            if (this.f) {
                this.f = false;
                PlatformContextSwigJNI.delete_PlatformContext(j);
            }
            this.a = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    @dzsi
    public ConnectivityService getConnectivityService() {
        long PlatformContext_getConnectivityService = getClass() == PlatformContext.class ? PlatformContextSwigJNI.PlatformContext_getConnectivityService(this.a, this) : PlatformContextSwigJNI.PlatformContext_getConnectivityServiceSwigExplicitPlatformContext(this.a, this);
        if (PlatformContext_getConnectivityService == 0) {
            return null;
        }
        return new ConnectivityService(PlatformContext_getConnectivityService, false);
    }

    @dzsi
    public IconService getIconService() {
        long PlatformContext_getIconService = getClass() == PlatformContext.class ? PlatformContextSwigJNI.PlatformContext_getIconService(this.a, this) : PlatformContextSwigJNI.PlatformContext_getIconServiceSwigExplicitPlatformContext(this.a, this);
        if (PlatformContext_getIconService == 0) {
            return null;
        }
        return new IconService(PlatformContext_getIconService, false);
    }

    @dzsi
    public SchedulingService getSchedulingService() {
        long PlatformContext_getSchedulingService = getClass() == PlatformContext.class ? PlatformContextSwigJNI.PlatformContext_getSchedulingService(this.a, this) : PlatformContextSwigJNI.PlatformContext_getSchedulingServiceSwigExplicitPlatformContext(this.a, this);
        if (PlatformContext_getSchedulingService == 0) {
            return null;
        }
        return new SchedulingService(PlatformContext_getSchedulingService, false);
    }

    @dzsi
    public TextService getTextService() {
        long PlatformContext_getTextService = getClass() == PlatformContext.class ? PlatformContextSwigJNI.PlatformContext_getTextService(this.a, this) : PlatformContextSwigJNI.PlatformContext_getTextServiceSwigExplicitPlatformContext(this.a, this);
        if (PlatformContext_getTextService == 0) {
            return null;
        }
        return new TextService(PlatformContext_getTextService, false);
    }

    @dzsi
    public TileService getTileService() {
        long PlatformContext_getTileService = getClass() == PlatformContext.class ? PlatformContextSwigJNI.PlatformContext_getTileService(this.a, this) : PlatformContextSwigJNI.PlatformContext_getTileServiceSwigExplicitPlatformContext(this.a, this);
        if (PlatformContext_getTileService == 0) {
            return null;
        }
        return new TileService(PlatformContext_getTileService, false);
    }

    protected void swigDirectorDisconnect() {
        this.f = false;
        delete();
    }
}
