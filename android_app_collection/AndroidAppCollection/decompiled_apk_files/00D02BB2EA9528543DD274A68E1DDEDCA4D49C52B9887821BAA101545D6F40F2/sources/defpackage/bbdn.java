package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbdn  reason: default package */
/* loaded from: classes3.dex */
public final class bbdn implements awnl {
    public final transient bwrs<ilo> a;
    private final transient bzqc b;

    public bbdn(bwrs<ilo> bwrsVar, bzqc bzqcVar) {
        this.a = bwrsVar;
        this.b = bzqcVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.LOCATION_HISTORY_DIALOG;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            deha.q(this.b.a(dcdc.f(bzqb.WEB_AND_APP_ACTIVITY)), new bbdm(this), dege.a);
        } else if (i != 0) {
        } else {
            Toast.makeText(activity, activity.getString(R.string.PERSONAL_SCORE_WAA_NEGATIVE_ACTION), 1).show();
        }
    }
}
