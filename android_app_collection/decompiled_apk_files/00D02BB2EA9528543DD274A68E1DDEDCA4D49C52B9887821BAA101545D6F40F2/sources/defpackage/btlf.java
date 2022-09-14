package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import com.google.android.apps.gmm.settings.preference.TimePreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btlf  reason: default package */
/* loaded from: classes4.dex */
public final class btlf extends aug {
    public btld ad = btld.c(0, 0);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aug
    public final void aJ(View view) {
        TimePicker timePicker = (TimePicker) view.findViewById(R.id.time_picker);
        timePicker.setCurrentHour(Integer.valueOf(this.ad.a()));
        timePicker.setCurrentMinute(Integer.valueOf(this.ad.b()));
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(this) { // from class: btle
            private final btlf a;

            {
                this.a = this;
            }

            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker2, int i, int i2) {
                this.a.ad = btld.c(i, i2);
            }
        });
        super.aJ(view);
    }

    @Override // defpackage.aug
    public final void aL(boolean z) {
        if (!z) {
            return;
        }
        TimePreference timePreference = (TimePreference) aN();
        btld btldVar = this.ad;
        if (timePreference.n() == btldVar) {
            return;
        }
        timePreference.I(btldVar);
        timePreference.af(btldVar.e());
        timePreference.k(timePreference.o(btldVar));
        timePreference.h = btldVar;
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.ad = btld.d(bundle.getInt("minutesOfDay", this.ad.e()));
        }
    }

    @Override // defpackage.aug, defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("minutesOfDay", this.ad.e());
        super.t(bundle);
    }
}
