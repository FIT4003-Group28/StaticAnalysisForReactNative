package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
/* renamed from: afat  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afat implements View.OnClickListener {
    static final View.OnClickListener a = new afat();

    private afat() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (!(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = (Activity) context;
                break;
            }
        }
        dbsk.s(activity);
        activity.onBackPressed();
    }
}
