package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdxm  reason: default package */
/* loaded from: classes3.dex */
final class bdxm implements egq {
    final /* synthetic */ bdyb a;

    public bdxm(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        View view;
        bdyb bdybVar = this.a;
        if (!bdybVar.bL || (view = eguVar.P) == null) {
            return;
        }
        bdybVar.ar.a();
        View a = cqhu.a(view, abms.a);
        if (a == null) {
            return;
        }
        a.sendAccessibilityEvent(8);
    }
}
