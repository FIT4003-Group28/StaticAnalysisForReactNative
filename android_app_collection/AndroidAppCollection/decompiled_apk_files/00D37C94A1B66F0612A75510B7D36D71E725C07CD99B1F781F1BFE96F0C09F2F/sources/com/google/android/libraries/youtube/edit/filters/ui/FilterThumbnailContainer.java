package com.google.android.libraries.youtube.edit.filters.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FilterThumbnailContainer extends FrameLayout {
    public FilterThumbnailContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOutlineProvider(new zul(getResources().getDimension(R.dimen.camera_filter_preview_item_corner_radius)));
        setClipToOutline(true);
    }
}
