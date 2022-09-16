package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ahyv  reason: default package */
/* loaded from: classes.dex */
public final class ahyv implements airt {
    final /* synthetic */ ahyz a;

    public ahyv(ahyz ahyzVar) {
        this.a = ahyzVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.V().G(aypa.a()).aa(new ayqb() { // from class: ahyu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahyv ahyvVar = ahyv.this;
                PlayerResponseModel c = ((ahic) obj).a().c();
                if (c == null) {
                    return;
                }
                ahyvVar.a.C = c.d.d("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
                ahyvVar.a.B = c.d.d("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY");
                ahyvVar.a.e();
            }
        }, ahqs.n)};
    }
}
