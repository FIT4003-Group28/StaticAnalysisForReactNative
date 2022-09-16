package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import android.content.Context;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MobileV2UserFeedEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements aafo {
    private final Context a;
    private final aafo b;
    private final aafo c;
    private final c d;
    private final d e;
    private final b f;
    private final aabu g;

    public f(Context context, aafo aafoVar, aafo aafoVar2, c cVar, d dVar, b bVar, aabu aabuVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = aafoVar2;
        this.d = cVar;
        this.e = dVar;
        this.f = bVar;
        this.g = aabuVar;
    }

    @Override // defpackage.aafo
    public final void a(apzg apzgVar) {
        c(apzgVar, null);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        if (apzgVar != null) {
            try {
                if (apzgVar.qn(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint)) {
                    throw new e("Settings not supported");
                }
                if (apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                    throw new e("Browse not supported");
                }
                if (apzgVar.qn(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)) {
                    this.c.c(apzgVar, map);
                } else if (apzgVar.qn(MobileV2UserFeedEndpointOuterClass.mobileV2UserFeedEndpoint)) {
                    throw new e("Feed not supported");
                } else {
                    if (apzgVar.qn(OfflineEndpointOuterClass.offlineEndpoint)) {
                        throw new e("Offline not supported");
                    }
                    if (apzgVar.qn(attg.a)) {
                        throw new e("Offline Watch not supported");
                    }
                    if (apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
                        throw new e("Search not supported");
                    }
                    if (apzgVar.qn(SignInEndpointOuterClass.signInEndpoint)) {
                        throw new e("Sign in not supported");
                    }
                    if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                        yja.f(this.a, zgt.j(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c));
                    } else if (apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
                        this.b.c(apzgVar, null);
                    } else if (apzgVar.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint)) {
                        throw new e("Watch Playlist not supported");
                    } else {
                        if (apzgVar.qn(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint)) {
                            this.e.a(apzgVar);
                        } else if (apzgVar.qn(AddToToastActionOuterClass$AddToToastAction.addToToastAction)) {
                            this.d.kD(apzgVar, map);
                        } else if (apzgVar.qn(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
                            this.f.a(apzgVar);
                        } else if (apzgVar.qn(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint)) {
                        } else {
                            if (!apzgVar.qn(RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand)) {
                                throw new e("Unknown Navigation");
                            }
                            aabu aabuVar = this.g;
                            if (aabuVar != null) {
                                aabuVar.kD(apzgVar, map);
                                return;
                            }
                            throw new e("Attestation not supported for non-sign-in supported apps.");
                        }
                    }
                }
            } catch (e e) {
                String valueOf = String.valueOf(e.getMessage());
                afus.c(2, 4, valueOf.length() != 0 ? "Unsupported command: ".concat(valueOf) : new String("Unsupported command: "), e);
            }
        }
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
