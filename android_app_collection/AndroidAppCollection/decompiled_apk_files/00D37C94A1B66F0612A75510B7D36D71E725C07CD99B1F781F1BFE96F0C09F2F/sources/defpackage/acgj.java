package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: acgj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acgj implements zdt {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ acgj(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public /* synthetic */ acgj(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            LiveCreationActivity liveCreationActivity = this.a;
            Boolean bool = (Boolean) obj;
            zwn zwnVar = new zwn(liveCreationActivity, Arrays.asList(LiveCreationActivity.c));
            zwnVar.c = new acgl(liveCreationActivity, 4);
            zwnVar.d = new acgj(liveCreationActivity, 1);
            liveCreationActivity.O = zwnVar;
            if (TextUtils.isEmpty(liveCreationActivity.N)) {
                zwn zwnVar2 = liveCreationActivity.O;
                List asList = Arrays.asList(LiveCreationActivity.c);
                List list = liveCreationActivity.T;
                boolean equals = Boolean.TRUE.equals(bool);
                if (zwn.d(liveCreationActivity, asList)) {
                    list = amuk.q();
                } else if (equals) {
                    list = amuk.q();
                }
                zwnVar2.f(list);
            }
            liveCreationActivity.O.c();
            liveCreationActivity.S = true;
            liveCreationActivity.as();
            return;
        }
        final LiveCreationActivity liveCreationActivity2 = this.a;
        if (Boolean.TRUE.equals((Boolean) obj)) {
            acti actiVar = liveCreationActivity2.m;
            if (actiVar != null) {
                actiVar.n(new acte(acuo.b(29220)));
                actiVar.n(new acte(acuo.b(29221)));
            }
            new AlertDialog.Builder(liveCreationActivity2).setTitle(R.string.lc_permission_allow_access_description).setMessage(R.string.lc_permission_open_settings_description).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: acgi
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    LiveCreationActivity.this.onBackPressed();
                }
            }).setPositiveButton(liveCreationActivity2.getString(R.string.lc_permission_open_settings_dialog_confirm), new acgq(liveCreationActivity2, actiVar, 1)).setNegativeButton(liveCreationActivity2.getString(R.string.lc_permission_open_settings_dialog_dismiss), new acgq(liveCreationActivity2, actiVar)).show();
            return;
        }
        liveCreationActivity2.as();
        liveCreationActivity2.onBackPressed();
    }
}
