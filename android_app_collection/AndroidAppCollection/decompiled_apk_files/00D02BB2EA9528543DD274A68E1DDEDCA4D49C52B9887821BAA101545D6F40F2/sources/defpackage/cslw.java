package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: PG */
/* renamed from: cslw  reason: default package */
/* loaded from: classes5.dex */
final class cslw extends ViewOutlineProvider {
    final /* synthetic */ csme a;

    public cslw(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        this.a.i.getOutlineProvider().getOutline(this.a.i, outline);
    }
}
