package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cusa  reason: default package */
/* loaded from: classes5.dex */
public final class cusa extends LinearLayout {
    public final TextView a;
    public final ImageView b;

    public cusa(Context context) {
        this(context, null);
    }

    public cusa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cusa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.vertical_layout_buttons, this);
        this.a = (TextView) findViewById(R.id.display_text);
        this.b = (ImageView) findViewById(R.id.display_icon);
        setOrientation(1);
        setClickable(true);
    }
}
