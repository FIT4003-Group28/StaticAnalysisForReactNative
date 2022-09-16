package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends ahyz {
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h a;
    public final i b;
    public final aafo c;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b d;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b e;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b g;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b h;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b i;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b j;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b k;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b l;
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f m;
    public final aadd n;
    public apoj o;
    public apzg p;
    public final rvx q;

    public j(airr airrVar, ahxx ahxxVar, ahyp ahypVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b bVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b bVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar5, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b bVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b bVar8, adzz adzzVar, ScheduledExecutorService scheduledExecutorService, Executor executor, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar, aafo aafoVar, rvx rvxVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar, aadd aaddVar, byte[] bArr) {
        super(airrVar, ahxxVar, ahypVar, adzzVar, scheduledExecutorService, executor);
        this.a = hVar;
        this.c = aafoVar;
        this.b = new i(this);
        this.q = rvxVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = cVar;
        this.g = bVar3;
        this.h = bVar4;
        this.i = bVar5;
        this.j = bVar6;
        this.k = bVar7;
        this.l = bVar8;
        this.m = fVar;
        this.n = aaddVar;
        rvxVar.a(R.id.api_watch_in_youtube_button, new g(this, 1));
        rvxVar.a(R.id.player_video_title_view, new g(this));
    }
}
