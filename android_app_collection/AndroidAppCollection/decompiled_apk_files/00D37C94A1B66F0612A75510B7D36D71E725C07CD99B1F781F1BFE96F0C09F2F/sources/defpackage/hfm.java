package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: hfm  reason: default package */
/* loaded from: classes3.dex */
public final class hfm extends afze {
    final /* synthetic */ hfn a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hfm(hfn hfnVar) {
        this.a = hfnVar;
    }

    @Override // defpackage.afze, defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("SCMusicController: Error getting player response", cffVar.getCause());
        e(cffVar);
    }

    @Override // defpackage.afze, defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        o(playerResponseModel);
        this.a.k(playerResponseModel);
    }
}
