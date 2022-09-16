package com.google.android.apps.youtube.app.player;

import com.google.android.apps.youtube.app.player.PlayerResponseServiceEndpointListener;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerResponseServiceEndpointListener implements f {
    public final aafo a;
    private final airw b;
    private aypg c;

    public PlayerResponseServiceEndpointListener(airw airwVar, aafo aafoVar) {
        this.b = airwVar;
        this.a = aafoVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.c;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
        this.c = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        aypg aypgVar = this.c;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
        this.c = this.b.G().a.Z(new ayqb() { // from class: jwk
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                PlayerResponseServiceEndpointListener playerResponseServiceEndpointListener = PlayerResponseServiceEndpointListener.this;
                ahhw ahhwVar = (ahhw) obj;
                PlayerResponseModel b = ahhwVar.b();
                if (b == null || ahhwVar.c() != aika.PLAYBACK_LOADED) {
                    return;
                }
                for (apzg apzgVar : (apzg[]) b.a.z.toArray(new apzg[0])) {
                    playerResponseServiceEndpointListener.a.c(apzgVar, null);
                }
            }
        });
    }
}
