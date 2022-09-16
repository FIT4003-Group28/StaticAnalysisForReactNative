package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auzj  reason: default package */
/* loaded from: classes.dex */
public final class auzj extends aujb {
    public auzj() {
        super(aujd.d(dpyv.UGC_TASKS_NEARBY_NEED.dm).a());
    }

    @Override // defpackage.aujb
    public final dcdc<Preference> c(Activity activity, Context context, btvo btvoVar) {
        final auzi auziVar = new auzi();
        ((auwf) btsq.c(auwf.class, activity)).xf(auziVar);
        Preference preference = new Preference(context);
        preference.s(context.getString(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_MORE_SETTINGS_TITLE));
        preference.o = new auc(auziVar) { // from class: auzh
            private final auzi a;

            {
                this.a = auziVar;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference2) {
                this.a.a.r();
                return true;
            }
        };
        return dcdc.f(preference);
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        dwta dwtaVar = btvoVar.getUgcTasksParameters().g;
        if (dwtaVar == null) {
            dwtaVar = dwta.c;
        }
        return dwtaVar.a;
    }

    @Override // defpackage.aujb
    @dzsi
    public final auil j() {
        return auil.c(ddda.ce, ddcu.JX);
    }
}
