package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gox  reason: default package */
/* loaded from: classes3.dex */
public final class gox implements abv {
    final /* synthetic */ goy a;

    public gox(goy goyVar) {
        this.a = goyVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        goy goyVar = this.a;
        if (!goyVar.c) {
            goyVar.c = true;
            Object lI = goyVar.lI();
            GalFlowActivity galFlowActivity = (GalFlowActivity) goyVar;
            dwq dwqVar = (dwq) lI;
            galFlowActivity.a = (gos) dwqVar.a.xS.get();
            galFlowActivity.b = dwqVar.fh();
        }
    }
}
