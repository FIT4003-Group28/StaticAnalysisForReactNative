package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rmp  reason: default package */
/* loaded from: classes7.dex */
public final class rmp implements axub {
    public sfd a;
    public sic b;
    private final Context c;
    private final sfc d;

    public rmp(Activity activity, rzp rzpVar) {
        ((rmn) btsq.c(rmn.class, activity)).wF(this);
        this.c = activity.getApplicationContext();
        this.d = this.a.a(0, null, null, rzpVar);
    }

    @Override // defpackage.axub
    public final void a(@dzsi azvc azvcVar) {
        if (azvcVar != null) {
            azva azvaVar = ((azvd) azvcVar).a;
            this.b.e(azvaVar);
            if (azvaVar.a == dndr.HOME) {
                Toast.makeText(this.c, (int) R.string.SET_HOME_LOCATION_COMPLETE_TOAST, 0).show();
            }
        }
        this.d.a(rzo.e());
    }

    @Override // defpackage.axub
    public final void b() {
        this.d.d();
    }
}
