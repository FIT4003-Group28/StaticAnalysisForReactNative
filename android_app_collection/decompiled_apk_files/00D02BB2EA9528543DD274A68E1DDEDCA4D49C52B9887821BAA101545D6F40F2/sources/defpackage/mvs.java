package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: mvs  reason: default package */
/* loaded from: classes7.dex */
public final class mvs extends fd {
    private static final dcdc<String> c = dcdc.g("android.permission.ACCESS_FINE_LOCATION", "com.google.android.gms.permission.CAR_SPEED");
    public mvr a;
    public axru b;
    private boolean d;

    @Override // defpackage.fd
    public final void ab(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (c.contains(strArr[i2]) && iArr[i2] != 0) {
                    return;
                }
            }
            this.a.j(true);
        }
    }

    @Override // defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        this.a = (mvr) activity;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.frx_permissions, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.permissions_layout);
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_button);
        TextView textView2 = (TextView) inflate.findViewById(R.id.settings_button);
        findViewById.setBackgroundColor(Rn().getColor(R.color.qu_google_green_500));
        ((ImageView) inflate.findViewById(R.id.location_icon)).setImageDrawable(nqu.aC(R.raw.car_only_ic_place_36dp, cqta.d(-1), nqo.D, nqo.E).a(H()));
        textView.setText(Rn().getString(R.string.CANCEL_BUTTON));
        textView2.setText(Rn().getString(R.string.SETTINGS));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: mvo
            private final mvs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.j(false);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mvp
            private final mvs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mvs mvsVar = this.a;
                mvsVar.J().startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", mvsVar.J().getPackageName(), null)).setFlags(268435456));
            }
        });
        return inflate;
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ((mvq) btsr.a(mvq.class)).tt(this);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("permissions_requested", false)) {
            z = true;
        }
        this.d = z;
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        if (this.d) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        dcdc<String> dcdcVar = c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            String str = dcdcVar.get(i);
            if (!this.b.a(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            aa((String[]) arrayList.toArray(new String[arrayList.size()]), 1);
            this.d = true;
            return;
        }
        this.a.j(true);
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putBoolean("permissions_requested", this.d);
    }
}
