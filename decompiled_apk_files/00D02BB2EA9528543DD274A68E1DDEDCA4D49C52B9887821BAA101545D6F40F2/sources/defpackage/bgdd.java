package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: bgdd  reason: default package */
/* loaded from: classes3.dex */
final class bgdd extends ViewOutlineProvider {
    final /* synthetic */ cqtv a;

    public bgdd(cqtv cqtvVar) {
        this.a = cqtvVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float a = this.a.a(view.getContext());
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) Math.ceil(a)), a);
    }
}
