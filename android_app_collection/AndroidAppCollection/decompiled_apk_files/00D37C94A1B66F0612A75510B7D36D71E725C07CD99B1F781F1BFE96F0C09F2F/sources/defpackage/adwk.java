package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: adwk  reason: default package */
/* loaded from: classes.dex */
final class adwk implements yiw {
    final /* synthetic */ adwt a;

    public adwk(adwt adwtVar) {
        this.a = adwtVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
        zep.d("Failed to fetch player response", exc);
        this.a.d = null;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r3 = (Void) obj;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj2;
        this.a.d = null;
        if (playerResponseModel.B().isEmpty()) {
            zep.m(adwt.a, "Video id for auto play player response is empty.");
            playerResponseModel = null;
        }
        adwt adwtVar = this.a;
        adwi b = adwtVar.i.b();
        adwg a = this.a.i.k.a();
        a.a = playerResponseModel;
        b.e = a.a();
        adwtVar.m(b);
        this.a.b(7);
    }
}
