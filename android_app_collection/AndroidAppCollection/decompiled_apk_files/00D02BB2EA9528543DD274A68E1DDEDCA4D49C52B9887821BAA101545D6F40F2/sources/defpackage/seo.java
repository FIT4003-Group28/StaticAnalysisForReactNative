package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: seo  reason: default package */
/* loaded from: classes7.dex */
final class seo extends View.AccessibilityDelegate {
    final /* synthetic */ sep a;

    public seo(sep sepVar) {
        this.a = sepVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        RadioButton radioButton = (RadioButton) view;
        Context context = radioButton.getContext();
        bvsi bvsiVar = new bvsi(context);
        sat satVar = (sat) cqkx.i(radioButton);
        if (satVar != null) {
            bvsiVar.c(zbc.a(context, satVar.a()));
            if (sht.h(this.a.a.k().b(), satVar.b())) {
                bvsiVar.c(context.getString(R.string.GO_HOME_AT_NEXT_DAY_TITLE));
            }
            radioButton.setContentDescription(bvsiVar.toString());
        }
        super.sendAccessibilityEvent(view, i);
    }
}
