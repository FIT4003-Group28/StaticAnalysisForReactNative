package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxop  reason: default package */
/* loaded from: classes5.dex */
public final class cxop extends fd implements apc<List<License>> {
    public LicenseMenuActivity a;
    private ArrayAdapter<License> b;

    @Override // defpackage.fd
    public final void Qd() {
        super.Qd();
        this.a = null;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        super.Qi(context);
        ff J = J();
        if (J instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity) J;
        }
    }

    @Override // defpackage.apc
    public final apl<List<License>> a(Bundle bundle) {
        return new cxon(J());
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        ff J = J();
        this.b = new ArrayAdapter<>(J, (int) R.layout.libraries_social_licenses_license, (int) R.id.license, new ArrayList());
        apd.a(J).c(54321, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: cxoo
            private final cxop a;

            {
                this.a = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                cxop cxopVar = this.a;
                License license = (License) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = cxopVar.a;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, LicenseActivity.class);
                    intent.putExtra("license", license);
                    licenseMenuActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        apd a = apd.a(J());
        api apiVar = (api) a;
        if (!apiVar.a.e) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("destroyLoader must be called on the main thread");
            }
            if (api.d(2)) {
                String str = "destroyLoader in " + a + " of 54321";
            }
            ape d = apiVar.a.d(54321);
            if (d == null) {
                return;
            }
            d.o(true);
            ain<ape> ainVar = apiVar.a.d;
            int e = aii.e(ainVar.c, ainVar.e, 54321);
            if (e < 0 || ainVar.d[e] == ain.a) {
                return;
            }
            ainVar.d[e] = ain.a;
            ainVar.b = true;
            return;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // defpackage.apc
    public final /* bridge */ /* synthetic */ void b(List<License> list) {
        this.b.clear();
        this.b.addAll(list);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.apc
    public final void c() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }
}
