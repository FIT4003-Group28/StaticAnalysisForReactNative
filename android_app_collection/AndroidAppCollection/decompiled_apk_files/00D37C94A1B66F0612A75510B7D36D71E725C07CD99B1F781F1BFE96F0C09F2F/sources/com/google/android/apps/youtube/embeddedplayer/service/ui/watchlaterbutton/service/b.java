package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service;

import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import j$.util.Optional;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a {
    public final aafo a;
    private final afvn b;
    private final abbe c;
    private String f;
    private int h;
    private boolean i;
    private apoj d = apoj.a;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b e = com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b.V;
    private aoob g = aoob.b;

    public b(aafo aafoVar, afvn afvnVar, abbe abbeVar) {
        this.a = aafoVar;
        this.b = afvnVar;
        this.c = abbeVar;
    }

    private final void d(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = WatchLaterButtonData.e();
        e.b(i);
        e.c(this.g);
        if (i == 0 || i == 1) {
            e.a = null;
            e.b = null;
        } else {
            String str = this.f;
            e.a = str;
            e.b = str;
        }
        this.e.E(e.a());
    }

    public final int a() {
        ylr.c();
        return this.h;
    }

    public final void b(apoj apojVar, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar) {
        ylr.c();
        apojVar.getClass();
        this.d = apojVar;
        bVar.getClass();
        this.e = bVar;
        int i = this.d.b;
        if ((i & 256) == 0 || (i & 64) == 0 || (i & 8192) == 0) {
            this.h = 0;
            d(a());
            return;
        }
        arag aragVar = apojVar.i;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        this.f = ajgl.b(aragVar).toString();
        this.g = apojVar.t;
        if (apojVar.h) {
            this.h = 1;
        } else {
            this.h = 2;
        }
        d(a());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
    public final void j() {
        Optional empty;
        Optional of;
        ylr.c();
        if (a() == 1 || a() == 0 || this.i) {
            return;
        }
        if (!this.b.t()) {
            apzg apzgVar = this.d.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            Iterator it = ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                auci auciVar = (auci) it.next();
                if ((auciVar.b & 2) != 0) {
                    empty = Optional.of(auciVar.d);
                    break;
                }
            }
            if (!empty.isPresent()) {
                of = Optional.empty();
            } else {
                String builder = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", (String) empty.get()).toString();
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopg aopgVar = AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
                aopa createBuilder = apff.a.createBuilder();
                createBuilder.copyOnWrite();
                apff.b((apff) createBuilder.instance);
                createBuilder.copyOnWrite();
                apff apffVar = (apff) createBuilder.instance;
                builder.getClass();
                apffVar.b |= 4;
                apffVar.e = builder;
                createBuilder.copyOnWrite();
                apff.a((apff) createBuilder.instance);
                aopcVar.e(aopgVar, (apff) createBuilder.mo39build());
                of = Optional.of((apzg) aopcVar.mo39build());
            }
            if (!of.isPresent()) {
                return;
            }
            this.a.a((apzg) of.get());
            return;
        }
        apzg apzgVar2 = this.d.n;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apzgVar2.qm(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        abbb a = this.c.a();
        a.j(apzgVar2.c);
        a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
        a.t(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
        a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
        this.i = true;
        this.c.b(a, new a(this));
    }
}
