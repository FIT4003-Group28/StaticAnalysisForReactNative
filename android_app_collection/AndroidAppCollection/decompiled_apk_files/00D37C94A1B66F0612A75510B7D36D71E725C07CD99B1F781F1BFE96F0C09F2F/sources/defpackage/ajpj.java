package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajpj  reason: default package */
/* loaded from: classes.dex */
public final class ajpj extends ajoz {
    public final TextView b;

    public ajpj(LinearLayout linearLayout, Context context) {
        super(context);
        TextView textView = new TextView(this.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 4, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(4, 0, 4, 0);
        textView.setBackgroundColor(zhn.d(this.a, R.attr.ytOverlayTextSecondary));
        textView.setTextColor(zhn.d(this.a, R.attr.ytTextPrimary));
        textView.setTextSize(2, 12.0f);
        this.b = textView;
        linearLayout.addView(textView);
    }
}
