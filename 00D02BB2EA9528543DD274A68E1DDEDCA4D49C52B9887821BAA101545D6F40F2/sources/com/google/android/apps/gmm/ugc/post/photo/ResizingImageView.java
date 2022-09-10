package com.google.android.apps.gmm.ugc.post.photo;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ResizingImageView extends WebImageView {
    private jic i;
    private boolean j;

    public ResizingImageView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.apps.gmm.base.views.webimageview.WebImageView
    public final boolean o(jic jicVar) {
        this.j = ((Boolean) dbsg.j(jicVar).h(ceba.a).c(false)).booleanValue();
        this.i = jicVar;
        return super.o(jicVar);
    }

    @Override // defpackage.ckqg, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        jic jicVar;
        if ((i > i3 || i2 > i4) && (jicVar = this.i) != null) {
            if (this.j) {
                jicVar.b();
            }
            this.i.a(this);
        }
    }

    public ResizingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
    }
}
