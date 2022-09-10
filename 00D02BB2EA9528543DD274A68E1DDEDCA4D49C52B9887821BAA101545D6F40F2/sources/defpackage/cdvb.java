package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: cdvb  reason: default package */
/* loaded from: classes4.dex */
public final class cdvb implements View.OnLayoutChangeListener {
    final /* synthetic */ cdvc a;

    public cdvb(cdvc cdvcVar) {
        this.a = cdvcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dzvx.c(view, "view");
        view.removeOnLayoutChangeListener(this);
        cdvc cdvcVar = this.a;
        WebImageView webImageView = cdvcVar.s;
        dzvx.b(webImageView, "image");
        cdvcVar.C(webImageView);
    }
}
