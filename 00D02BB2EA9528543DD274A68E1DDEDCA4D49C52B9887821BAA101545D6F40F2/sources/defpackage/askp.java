package defpackage;

import android.graphics.Point;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: askp  reason: default package */
/* loaded from: classes2.dex */
public final class askp implements aswa {
    final /* synthetic */ askq a;

    public askp(askq askqVar) {
        this.a = askqVar;
    }

    @Override // defpackage.aswa
    public final void a(asvx asvxVar) {
        askq askqVar = this.a;
        asvxVar.a();
        alad n = askqVar.d.n();
        Point i = askqVar.e.i();
        askqVar.w(false, askqVar.z().j(n, askqVar.e.b(), i.x, i.y, askqVar.f.getDisplayMetrics().density));
        askqVar.o(false);
    }
}
