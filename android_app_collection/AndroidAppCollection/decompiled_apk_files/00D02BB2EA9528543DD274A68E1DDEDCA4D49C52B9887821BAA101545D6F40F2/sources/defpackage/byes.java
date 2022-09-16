package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byes  reason: default package */
/* loaded from: classes4.dex */
public final class byes implements egq {
    final /* synthetic */ byet a;

    public byes(byet byetVar) {
        this.a = byetVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        qut qutVar;
        this.a.am.w();
        byet byetVar = this.a;
        if (czui.a(22) && (qutVar = byetVar.aq) != null) {
            View f = qutVar.f();
            if (f != null) {
                f.setAccessibilityTraversalBefore(R.id.mylocation_button);
            } else {
                qut qutVar2 = byetVar.aq;
                dbsk.s(qutVar2);
                View g = qutVar2.g();
                if (g != null) {
                    g.setAccessibilityTraversalBefore(R.id.mylocation_button);
                }
            }
            qut qutVar3 = byetVar.aq;
            dbsk.s(qutVar3);
            qutVar3.h().setAccessibilityTraversalAfter(byetVar.ao.c().getId());
        }
    }
}
