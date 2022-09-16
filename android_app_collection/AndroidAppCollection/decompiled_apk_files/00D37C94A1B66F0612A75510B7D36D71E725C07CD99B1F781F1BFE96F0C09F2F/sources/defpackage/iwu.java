package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: iwu  reason: default package */
/* loaded from: classes3.dex */
final class iwu implements yiw {
    final /* synthetic */ iww a;

    public iwu(iww iwwVar) {
        this.a = iwwVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r1 = (Void) obj;
        yzj yzjVar = this.a.a;
        yzjVar.d(yzjVar.b(exc));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r3 = (Void) obj;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj2;
        iww iwwVar = this.a;
        iwwVar.d = new iwv(iwwVar, playerResponseModel);
        iww iwwVar2 = this.a;
        iwwVar2.c.k(playerResponseModel.t(), iwwVar2.d, playerResponseModel.B());
    }
}
