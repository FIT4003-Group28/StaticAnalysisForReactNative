package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ehl  reason: default package */
/* loaded from: classes6.dex */
public final class ehl {
    public static void a(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        View view = new View(viewGroup.getContext());
        view.setBackgroundColor(ibm.b().b(viewGroup.getContext()));
        viewGroup.addView(view, new LinearLayout.LayoutParams(-1, -1));
        viewGroup.setVisibility(0);
    }
}
