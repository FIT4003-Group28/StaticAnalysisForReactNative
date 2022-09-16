package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UpForFullController implements f {
    public final aadd a;
    public boolean b;
    public boolean c;
    private final Context d;
    private final airw e;
    private final aypf f = new aypf();

    public UpForFullController(Context context, aadd aaddVar, airw airwVar) {
        this.d = context;
        this.a = aaddVar;
        this.e = airwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        asxp asxpVar = this.a.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (!asxpVar.aB) {
            return false;
        }
        return zew.w(this.d) ? this.b : this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(int i) {
        return i < 0 && Math.abs(zew.n(this.d.getResources().getDisplayMetrics(), i)) >= 64;
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
        this.f.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.f.g(this.e.ao().I().G(aypa.a()).aa(new ayqb() { // from class: oaf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                UpForFullController upForFullController = UpForFullController.this;
                ahhm ahhmVar = (ahhm) obj;
                PlayerResponseModel b = ahhmVar.b();
                if (!ahhmVar.c().b(aijx.VIDEO_PLAYBACK_LOADED) || b == null) {
                    return;
                }
                upForFullController.b = b.c().ax();
                upForFullController.c = b.c().ay();
            }
        }, npy.m));
    }
}
