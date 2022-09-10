package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: arbd  reason: default package */
/* loaded from: classes2.dex */
final class arbd implements crzp<dbsg<String>> {
    final /* synthetic */ arbi a;

    public arbd(arbi arbiVar) {
        this.a = arbiVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dbsg<String>> crzmVar) {
        bvrj.UI_THREAD.c();
        if (this.a.f.z(bvjk.aA, "").isEmpty()) {
            this.a.c(new arbv());
            return;
        }
        arbi arbiVar = this.a;
        GmmLocation gmmLocation = arbiVar.y;
        if (gmmLocation == null) {
            return;
        }
        arbiVar.A.a(new amqo(gmmLocation));
    }
}
