package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.search.voice.PermissionRequestActivity;
/* compiled from: PG */
/* renamed from: lby  reason: default package */
/* loaded from: classes3.dex */
final class lby implements abv {
    final /* synthetic */ lbz a;

    public lby(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        lbz lbzVar = this.a;
        if (!lbzVar.a) {
            lbzVar.a = true;
            lbzVar.lI();
            ((PermissionRequestActivity) lbzVar).b = new akdy();
        }
    }
}
