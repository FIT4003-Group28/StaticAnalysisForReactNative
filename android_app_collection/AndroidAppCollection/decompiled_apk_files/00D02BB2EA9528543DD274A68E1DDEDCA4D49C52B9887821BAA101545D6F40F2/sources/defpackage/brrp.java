package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brrp  reason: default package */
/* loaded from: classes4.dex */
public final class brrp implements View.OnAttachStateChangeListener {
    final /* synthetic */ brrq a;

    public brrp(brrq brrqVar) {
        this.a = brrqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        brrq brrqVar = this.a;
        bwrs<ilo> bwrsVar = brrqVar.c;
        if (bwrsVar != null) {
            brrqVar.a.g(bwrsVar, brrqVar.f);
        }
        this.a.e = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        brrq brrqVar = this.a;
        bwrs<ilo> bwrsVar = brrqVar.c;
        if (bwrsVar != null) {
            bwqv.t(bwrsVar, brrqVar.f);
        }
        this.a.e = false;
    }
}
