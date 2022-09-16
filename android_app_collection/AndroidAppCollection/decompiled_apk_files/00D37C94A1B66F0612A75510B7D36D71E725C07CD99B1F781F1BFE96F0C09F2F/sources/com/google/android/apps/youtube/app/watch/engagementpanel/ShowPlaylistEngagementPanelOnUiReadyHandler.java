package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.watch.engagementpanel.ShowPlaylistEngagementPanelOnUiReadyHandler;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShowPlaylistEngagementPanelOnUiReadyHandler implements ght, f {
    public final aafo a;
    public ahtz b;
    public ahty c = ahty.NEW;
    private final String d;
    private final ahub e;
    private Runnable f;

    public ShowPlaylistEngagementPanelOnUiReadyHandler(aacz aaczVar, ahub ahubVar, aafo aafoVar) {
        this.a = aafoVar;
        this.e = ahubVar;
        asxj asxjVar = aaczVar.b().e;
        this.d = (asxjVar == null ? asxj.a : asxjVar).aD;
    }

    @Override // defpackage.ght
    public final boolean g(final apzg apzgVar, final Map map) {
        this.f = null;
        if (TextUtils.isEmpty(this.d) || !this.d.equals(ntr.e((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
            return false;
        }
        this.f = new Runnable() { // from class: nqb
            @Override // java.lang.Runnable
            public final void run() {
                ShowPlaylistEngagementPanelOnUiReadyHandler showPlaylistEngagementPanelOnUiReadyHandler = ShowPlaylistEngagementPanelOnUiReadyHandler.this;
                showPlaylistEngagementPanelOnUiReadyHandler.a.c(apzgVar, map);
            }
        };
        h();
        return true;
    }

    public final void h() {
        if (this.f == null || !this.c.a(ahty.LOGGED_ATTACH_WATCH_NEXT)) {
            return;
        }
        this.f.run();
        this.f = null;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.e.c(this.b);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.e.m(this.b);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
