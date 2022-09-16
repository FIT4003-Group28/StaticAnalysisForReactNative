package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsEditToolButtonView extends FrameLayout {
    public final Context a;
    public TextView b;
    public ImageView c;

    public ShortsEditToolButtonView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        zxq.a(getContext(), this.c, z);
    }

    public ShortsEditToolButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        LayoutInflater.from(context).inflate(R.layout.shorts_edit_tool_button, this);
        this.c = (ImageView) findViewById(R.id.shorts_edit_tool_icon);
        this.b = (TextView) findViewById(R.id.shorts_edit_tool_text);
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, gst.b, 0, 0);
        if (obtainStyledAttributes.hasValue(4)) {
            this.c.setImageTintList(ColorStateList.valueOf(obtainStyledAttributes.getColor(4, -1)));
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId != -1) {
            this.c.setImageDrawable(context.getResources().getDrawable(resourceId));
        }
        String string = obtainStyledAttributes.getString(1);
        if (string != null) {
            this.b.setText(string);
        }
        setContentDescription(obtainStyledAttributes.getString(0));
    }
}
