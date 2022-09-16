package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
/* compiled from: PG */
/* renamed from: acgz  reason: default package */
/* loaded from: classes.dex */
public final class acgz implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    final /* synthetic */ LiveCreationActivity a;

    public acgz(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        acid acidVar = this.a.f166J;
        if (acidVar == null || !acidVar.at()) {
            return;
        }
        this.a.f166J.aF();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            onCancel(dialogInterface);
        } else if (i != -1) {
        } else {
            LiveCreationActivity liveCreationActivity = this.a;
            acid acidVar = liveCreationActivity.f166J;
            if (acidVar != null) {
                acidVar.s();
            }
            liveCreationActivity.I = null;
            liveCreationActivity.H = null;
            liveCreationActivity.f166J = null;
            liveCreationActivity.F.a = true;
            liveCreationActivity.s(false);
            if (!TextUtils.isEmpty(liveCreationActivity.F.c)) {
                liveCreationActivity.g.execute(new acgx(liveCreationActivity));
            }
            liveCreationActivity.finish();
        }
    }
}
