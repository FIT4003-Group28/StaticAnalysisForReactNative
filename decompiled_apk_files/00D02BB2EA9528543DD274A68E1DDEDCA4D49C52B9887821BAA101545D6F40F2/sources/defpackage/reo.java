package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: reo  reason: default package */
/* loaded from: classes7.dex */
public final class reo {
    public static jib a(final Activity activity, amvh amvhVar, dcdc<jho> dcdcVar, boolean z) {
        String string;
        jhz a = jhz.a();
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = amvhVar.b.ordinal();
        if (ordinal == 1) {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_TO_HOME);
        } else if (ordinal == 2) {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_TO_WORK);
        } else {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_TO_DESTINATION, new Object[]{amvhVar.s(activity.getResources())});
        }
        a.a = string;
        a.d(dcdcVar);
        a.x = z;
        a.f(new View.OnClickListener(activity) { // from class: ren
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onBackPressed();
            }
        });
        return a.b();
    }
}
