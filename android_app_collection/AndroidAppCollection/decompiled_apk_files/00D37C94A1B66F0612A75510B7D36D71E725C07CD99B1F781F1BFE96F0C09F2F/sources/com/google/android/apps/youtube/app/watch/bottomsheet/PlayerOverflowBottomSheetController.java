package com.google.android.apps.youtube.app.watch.bottomsheet;

import android.os.Bundle;
import com.google.android.apps.youtube.app.watch.bottomsheet.PlayerOverflowBottomSheetController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerOverflowBottomSheetController implements njb, f {
    public final aafo a;
    public atep b;
    private final dt c;
    private final azqb d;
    private final airw e;
    private aypg f;

    public PlayerOverflowBottomSheetController(dt dtVar, azqb azqbVar, aafo aafoVar, airw airwVar) {
        this.c = dtVar;
        this.d = azqbVar;
        this.a = aafoVar;
        this.e = airwVar;
    }

    @Override // defpackage.njb
    public final /* synthetic */ void g() {
        h(null);
    }

    @Override // defpackage.njb
    public final void h(Set set) {
        if (!this.c.getLifecycle().a().a(apt.RESUMED)) {
            return;
        }
        String i = i();
        atep atepVar = this.b;
        nju njuVar = new nju();
        Bundle bundle = new Bundle();
        bundle.putString("VIDEO_ID_KEY", i);
        if (atepVar != null) {
            aphq.m(bundle, "FEED_MENU_ITEMS_KEY", atepVar);
        }
        njuVar.ae(bundle);
        njuVar.aB = new njw(this);
        njuVar.aw = set;
        njuVar.qv(this.c.getSupportFragmentManager(), null);
    }

    public final String i() {
        return ((airr) this.d.get()).q();
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
        azof.f((AtomicReference) this.f);
        this.f = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.f = this.e.ao().I().G(aypa.a()).aa(new ayqb() { // from class: njx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aube aubeVar;
                PlayerOverflowBottomSheetController playerOverflowBottomSheetController = PlayerOverflowBottomSheetController.this;
                WatchNextResponseModel a = ((ahhm) obj).a();
                atep atepVar = null;
                if (a != null && (aubeVar = a.i) != null && (aubeVar.b & 1) != 0) {
                    aubd aubdVar = aubeVar.d;
                    if (aubdVar == null) {
                        aubdVar = aubd.a;
                    }
                    if ((aubdVar.b & 1) != 0) {
                        aubd aubdVar2 = aubeVar.d;
                        if (aubdVar2 == null) {
                            aubdVar2 = aubd.a;
                        }
                        atepVar = aubdVar2.c;
                        if (atepVar == null) {
                            atepVar = atep.a;
                        }
                    }
                }
                playerOverflowBottomSheetController.b = atepVar;
            }
        }, npy.b);
    }
}
