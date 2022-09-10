package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ev  reason: default package */
/* loaded from: classes6.dex */
public final class ev implements aa<m> {
    final /* synthetic */ ex a;

    public ev(ex exVar) {
        this.a = exVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(m mVar) {
        if (mVar != null) {
            ex exVar = this.a;
            if (!exVar.c) {
                return;
            }
            View ai = exVar.ai();
            if (ai.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (this.a.d == null) {
                return;
            }
            if (gn.a(3)) {
                String str = "DialogFragment " + this + " setting the content view on " + this.a.d;
            }
            this.a.d.setContentView(ai);
        }
    }
}
