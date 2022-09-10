package defpackage;

import android.app.AlertDialog;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bteg  reason: default package */
/* loaded from: classes4.dex */
public final class bteg implements aub {
    final /* synthetic */ btem a;

    public bteg(btem btemVar) {
        this.a = btemVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            btem btemVar = this.a;
            TwoStatePreference twoStatePreference = (TwoStatePreference) preference;
            AlertDialog.Builder builder = new AlertDialog.Builder(twoStatePreference.j);
            builder.setPositiveButton(R.string.AREA_TRAFFIC_NOTIFICATION_PROMO_DISABLE, new btej(btemVar, twoStatePreference)).setNegativeButton(R.string.GENERIC_CANCEL_BUTTON, new btei(btemVar)).setOnCancelListener(new bteh(btemVar)).setTitle(R.string.NAVIGATION_STATS_DELETE_DIALOG_TITLE).setMessage(R.string.NAVIGATION_STATS_DELETE_DIALOG_DESCRIPTION);
            AlertDialog create = builder.create();
            if (create == null) {
                return false;
            }
            create.show();
            return false;
        }
        this.a.ao.i(cjqg.a(true, cjtd.a(dtxw.cD)));
        return true;
    }
}
