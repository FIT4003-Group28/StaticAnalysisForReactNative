package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: iym  reason: default package */
/* loaded from: classes3.dex */
final class iym implements View.OnClickListener {
    final /* synthetic */ iyn a;

    public iym(iyn iynVar) {
        this.a = iynVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.a.c)) {
            iyn iynVar = this.a;
            if (!iynVar.b.isPresent()) {
                return;
            }
            ((adnt) iynVar.b.get()).S(!iynVar.c.isSelected());
            iynVar.n();
        } else if (!view.equals(this.a.d)) {
        } else {
            iyn iynVar2 = this.a;
            if (!iynVar2.b.isPresent()) {
                return;
            }
            ((adnt) iynVar2.b.get()).T(!iynVar2.d.isSelected());
            iynVar2.n();
        }
    }
}
