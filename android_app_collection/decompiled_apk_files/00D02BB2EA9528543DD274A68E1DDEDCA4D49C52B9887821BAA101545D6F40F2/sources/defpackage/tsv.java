package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: tsv  reason: default package */
/* loaded from: classes7.dex */
final class tsv extends ViewOutlineProvider {
    final /* synthetic */ cqtv a;

    public tsv(cqtv cqtvVar) {
        this.a = cqtvVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.a(view.getContext()));
    }
}
