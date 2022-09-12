package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: lgw  reason: default package */
/* loaded from: classes7.dex */
final class lgw extends ViewOutlineProvider {
    final /* synthetic */ cqrp a;

    public lgw(cqrp cqrpVar) {
        this.a = cqrpVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.a(view.getContext()));
    }
}
