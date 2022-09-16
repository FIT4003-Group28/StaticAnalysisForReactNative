package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: ajpk  reason: default package */
/* loaded from: classes.dex */
public final class ajpk extends ajoz {
    public final LinearLayout b;
    private final ScrollView c;

    public ajpk(ScrollView scrollView, Context context) {
        super(context);
        this.c = scrollView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.b = linearLayout;
        scrollView.addView(linearLayout);
    }
}
