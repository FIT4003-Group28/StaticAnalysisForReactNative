package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxdk  reason: default package */
/* loaded from: classes4.dex */
public final class bxdk implements View.OnAttachStateChangeListener {
    final /* synthetic */ bxdn a;

    public bxdk(bxdn bxdnVar) {
        this.a = bxdnVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bxdn bxdnVar = this.a;
        bwrs<ilo> bwrsVar = bxdnVar.v;
        if (bwrsVar != null) {
            bxdnVar.e.g(bwrsVar, bxdnVar.C);
        }
        this.a.w = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bxdn bxdnVar = this.a;
        bwrs<ilo> bwrsVar = bxdnVar.v;
        if (bwrsVar != null && bxdnVar.w) {
            bwqv.t(bwrsVar, bxdnVar.C);
        }
        this.a.w = false;
    }
}
