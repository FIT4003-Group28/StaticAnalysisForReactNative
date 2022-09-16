package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: mvn  reason: default package */
/* loaded from: classes7.dex */
public final class mvn extends fd {
    public GoogleApiClient a;
    public boolean b;
    public boolean c;
    public mvm d;
    private final GoogleApiClient.ConnectionCallbacks e = new mvl(this);

    public static mvn d() {
        return new mvn();
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, @dzsi Intent intent) {
        if (i == 2) {
            this.c = false;
            if (i2 != -1) {
                return;
            }
            this.d.k();
        } else if (i != 3) {
        } else {
            this.b = false;
            if (i2 != -1 || this.a.isConnecting() || this.a.isConnected()) {
                return;
            }
            this.a.connect();
        }
    }

    @Override // defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        this.d = (mvm) activity;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.frx_roadblock, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.roadblock_layout);
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_button);
        TextView textView2 = (TextView) inflate.findViewById(R.id.settings_button);
        findViewById.setBackgroundColor(Rn().getColor(R.color.qu_google_green_500));
        textView.setText(Rn().getString(R.string.CANCEL_BUTTON));
        textView2.setText(Rn().getString(R.string.SETTINGS));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: mvi
            private final mvn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.k();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mvj
            private final mvn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mvn mvnVar = this.a;
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                intent.setFlags(268435456);
                mvnVar.J().startActivity(intent);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(R.id.roadblock_text);
        if (Build.VERSION.SDK_INT < 28) {
            textView3.setText(R.string.CAR_PHONE_LOCATION_SETTING_SCREEN_LOCATION_PARTIAL_TEXT);
        } else {
            textView3.setText(R.string.CAR_PHONE_LOCATION_SETTING_SCREEN_LOCATION_TOGGLE_TEXT);
        }
        return inflate;
    }

    public final void e(ConnectionResult connectionResult) {
        if (this.b) {
            return;
        }
        if (connectionResult.b()) {
            try {
                this.b = true;
                connectionResult.a(J(), 3);
                return;
            } catch (IntentSender.SendIntentException unused) {
                this.a.connect();
                return;
            }
        }
        int i = connectionResult.c;
        this.b = true;
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_error", i);
        mvg mvgVar = new mvg();
        mvgVar.B(bundle);
        mvgVar.F(this, 0);
        gn gnVar = this.A;
        dbsk.s(gnVar);
        mvgVar.e(gnVar, "errordialog");
    }

    public final void f(LocationSettingsResult locationSettingsResult) {
        Status status = locationSettingsResult.a;
        int i = status.g;
        if (i == 0) {
            this.d.k();
        } else if (i != 6) {
        } else {
            try {
                this.c = true;
                status.b(J(), 2);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.b = bundle.getBoolean("resolving_error", false);
            this.c = bundle.getBoolean("showing_location_dialog", false);
        }
        btsm c = btsm.c(J());
        c.g(LocationServices.API);
        c.h(this.e);
        c.i(new GoogleApiClient.OnConnectionFailedListener(this) { // from class: mvh
            private final mvn a;

            {
                this.a = this;
            }

            @Override // defpackage.cnsi
            public final void Pi(ConnectionResult connectionResult) {
                this.a.e(connectionResult);
            }
        });
        this.a = c.e();
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        if (((LocationManager) J().getSystemService("location")).isProviderEnabled("gps")) {
            this.d.k();
        } else {
            this.a.connect();
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putBoolean("resolving_error", this.b);
        bundle.putBoolean("showing_location_dialog", this.c);
    }

    @Override // defpackage.fd
    public final void u() {
        this.a.disconnect();
        super.u();
    }
}
