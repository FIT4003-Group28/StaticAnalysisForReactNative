package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: athd  reason: default package */
/* loaded from: classes2.dex */
final class athd extends ViewOutlineProvider {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;

    public athd(cqtv cqtvVar, cqtv cqtvVar2) {
        this.a = cqtvVar;
        this.b = cqtvVar2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int a = (int) this.a.a(view.getContext());
        outline.setRoundRect(0, a, view.getWidth(), view.getHeight() + a, this.b.a(view.getContext()));
    }
}
