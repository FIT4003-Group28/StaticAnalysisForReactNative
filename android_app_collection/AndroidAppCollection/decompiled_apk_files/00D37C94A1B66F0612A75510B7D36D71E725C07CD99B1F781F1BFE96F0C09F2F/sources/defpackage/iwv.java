package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iwv  reason: default package */
/* loaded from: classes3.dex */
final class iwv implements yiw {
    final /* synthetic */ iww a;
    private final PlayerResponseModel b;

    public iwv(iww iwwVar, PlayerResponseModel playerResponseModel) {
        this.a = iwwVar;
        this.b = playerResponseModel;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        yzj yzjVar = this.a.a;
        yzjVar.d(yzjVar.b(exc));
        String valueOf = String.valueOf(String.valueOf(exc));
        afus.b(1, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r2 = (Void) obj;
        int i = ((aiot) obj2).c - 1;
        if (i == 0) {
            this.a.e(this.b.B());
        } else if (i != 1) {
            this.a.g(this.b.B());
        } else {
            String valueOf = String.valueOf(this.b.B());
            zep.l(valueOf.length() != 0 ? "The following video is unplayable: ".concat(valueOf) : new String("The following video is unplayable: "));
            zag.q(this.a.b, R.string.player_video_not_available, 0);
        }
        this.a.d = null;
    }
}
