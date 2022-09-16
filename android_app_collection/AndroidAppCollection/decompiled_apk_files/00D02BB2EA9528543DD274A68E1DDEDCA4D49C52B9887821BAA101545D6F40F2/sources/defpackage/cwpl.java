package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpl  reason: default package */
/* loaded from: classes5.dex */
public final class cwpl extends ViewOutlineProvider {
    final /* synthetic */ ExpandableDialogView a;

    public cwpl(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ExpandableDialogView expandableDialogView = this.a;
        outline.setRoundRect(Math.round(this.a.c.left), Math.round(this.a.c.top), Math.round(this.a.c.right), Math.round(this.a.c.bottom), expandableDialogView.b * (1.0f - expandableDialogView.j()));
    }
}
