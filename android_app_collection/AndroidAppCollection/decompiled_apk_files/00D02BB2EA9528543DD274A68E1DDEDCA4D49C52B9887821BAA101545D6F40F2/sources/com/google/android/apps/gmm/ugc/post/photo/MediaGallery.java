package com.google.android.apps.gmm.ugc.post.photo;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MediaGallery extends cdyw {
    public dzve<? super Boolean, dztc> S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dzvx.c(context, "context");
        abn abnVar = this.C;
        adw adwVar = (adw) (true != (abnVar instanceof adw) ? null : abnVar);
        if (adwVar != null) {
            adwVar.z();
        }
        g(new cdyk(context.getResources().getDimensionPixelSize(R.dimen.media_gallery_spacing), context.getResources().getInteger(R.integer.galleryColumnCount)));
        setScrollOutsideCallback(new cdyh(this));
        cdyy cdyyVar = new cdyy(context, context.getResources().getInteger(R.integer.galleryColumnCount), new cdyi(this));
        setOnTouchListener(cdyyVar.G);
        setLayoutManager(cdyyVar);
    }

    public final void setOnGallerySizeChange(dzve<? super Boolean, dztc> dzveVar) {
        this.S = dzveVar;
    }
}
