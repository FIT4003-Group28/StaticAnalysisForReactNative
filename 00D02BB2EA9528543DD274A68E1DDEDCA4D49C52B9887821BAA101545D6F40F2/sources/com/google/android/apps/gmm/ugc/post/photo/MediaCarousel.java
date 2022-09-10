package com.google.android.apps.gmm.ugc.post.photo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MediaCarousel extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dzvx.c(context, "context");
        dzvx.c(attributeSet, "attrSet");
        setLayoutManager(new cdwr());
        new cdvm().f(this);
    }
}
