package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aton  reason: default package */
/* loaded from: classes2.dex */
final class aton implements ecs {
    final /* synthetic */ atop a;

    public aton(atop atopVar) {
        this.a = atopVar;
    }

    @Override // defpackage.ecs
    public final void Qf() {
        cqkf<? extends atxz> cqkfVar = this.a.c;
        View c = cqkfVar == null ? null : cqkfVar.c();
        if (c == null || c.getParent() == null) {
            return;
        }
        atop atopVar = this.a;
        if (atopVar.e) {
            c.requestFocus();
            this.a.a.c(c, 8);
            this.a.e = false;
            return;
        }
        CharSequence charSequence = atopVar.d;
        if (charSequence == null) {
            return;
        }
        c.announceForAccessibility(charSequence);
        this.a.d = null;
    }
}
