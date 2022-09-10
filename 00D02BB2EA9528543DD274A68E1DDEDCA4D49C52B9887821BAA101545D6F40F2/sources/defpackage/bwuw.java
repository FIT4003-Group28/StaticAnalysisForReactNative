package defpackage;

import android.content.res.Resources;
import com.google.geo.imagery.viewer.api.ConnectivityService;
import com.google.geo.imagery.viewer.api.IconService;
import com.google.geo.imagery.viewer.api.PlatformContext;
import com.google.geo.imagery.viewer.api.SchedulingService;
import com.google.geo.imagery.viewer.api.TextService;
import com.google.geo.imagery.viewer.api.TileService;
/* compiled from: PG */
/* renamed from: bwuw  reason: default package */
/* loaded from: classes4.dex */
public final class bwuw extends PlatformContext {
    @dzsi
    public final dfuk a;
    @dzsi
    public IconService b;
    @dzsi
    public TextService c;
    @dzsi
    public TileService d;
    @dzsi
    public SchedulingService e;
    @dzsi
    private final ConnectivityService g;

    public bwuw(dfuh dfuhVar, bvrb bvrbVar, duux duuxVar, ckqm ckqmVar, bwzi bwziVar, Resources resources, buti butiVar, boolean z) {
        this.g = new bwul(butiVar);
        this.a = new bwuu(butiVar, z);
        bwuv bwuvVar = new bwuv(bvrbVar);
        this.d = new bwvh(dfuhVar, ckqmVar, bwziVar, duuxVar, bvrbVar);
        this.e = new dfuc(dfuhVar, bwuvVar);
        this.c = new dfue(dfuhVar, bwuvVar);
        this.b = new bwun(dfuhVar, ckqmVar, bwziVar, resources, bvrbVar);
    }

    @Override // com.google.geo.imagery.viewer.api.PlatformContext
    @dzsi
    public final ConnectivityService getConnectivityService() {
        return this.g;
    }

    @Override // com.google.geo.imagery.viewer.api.PlatformContext
    @dzsi
    public final IconService getIconService() {
        return this.b;
    }

    @Override // com.google.geo.imagery.viewer.api.PlatformContext
    @dzsi
    public final SchedulingService getSchedulingService() {
        return this.e;
    }

    @Override // com.google.geo.imagery.viewer.api.PlatformContext
    @dzsi
    public final TextService getTextService() {
        return this.c;
    }

    @Override // com.google.geo.imagery.viewer.api.PlatformContext
    @dzsi
    public final TileService getTileService() {
        return this.d;
    }
}
