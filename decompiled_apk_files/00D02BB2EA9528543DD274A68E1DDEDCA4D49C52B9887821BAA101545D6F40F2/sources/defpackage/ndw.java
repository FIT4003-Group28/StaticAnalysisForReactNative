package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: ndw  reason: default package */
/* loaded from: classes7.dex */
final class ndw implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            Context context = view.getContext();
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).getWindow().getDecorView().focusSearch(130);
        }
    }
}
