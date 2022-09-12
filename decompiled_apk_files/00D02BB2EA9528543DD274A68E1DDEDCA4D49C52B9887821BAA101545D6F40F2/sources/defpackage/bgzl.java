package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: bgzl  reason: default package */
/* loaded from: classes3.dex */
final class bgzl extends ViewOutlineProvider {
    final /* synthetic */ cqtv a;

    public bgzl(cqtv cqtvVar) {
        this.a = cqtvVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float a = this.a.a(view.getContext());
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) Math.ceil(a)), a < 0.5f ? 0.0f : a);
    }
}
