package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbij  reason: default package */
/* loaded from: classes3.dex */
final class bbij implements bbdu {
    @Override // defpackage.bbdu
    public final void a(Activity activity, int i) {
        if (i == 2) {
            Toast.makeText(activity, (int) R.string.PERSONAL_SCORE_FEEDBACK_SAVE_FAILURE, 1).show();
        }
    }
}
