package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: arbc  reason: default package */
/* loaded from: classes.dex */
final class arbc implements crzp<dbsg<String>> {
    final /* synthetic */ arbi a;

    public arbc(arbi arbiVar) {
        this.a = arbiVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dbsg<String>> crzmVar) {
        bvrj.UI_THREAD.c();
        this.a.k.e(-1);
        arbi arbiVar = this.a;
        GmmLocation gmmLocation = arbiVar.y;
        if (gmmLocation != null && gmmLocation.hasAccuracy()) {
            arbiVar.y.getAccuracy();
        }
        arbiVar.c(new arbv());
        this.a.x = -1;
    }
}
