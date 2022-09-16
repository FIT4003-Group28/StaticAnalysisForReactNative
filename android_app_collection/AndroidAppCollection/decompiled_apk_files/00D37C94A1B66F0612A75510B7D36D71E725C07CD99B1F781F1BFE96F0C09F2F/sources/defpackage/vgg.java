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
import com.google.android.libraries.social.licenses.License;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.youtube.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vgg  reason: default package */
/* loaded from: classes4.dex */
public final class vgg extends dp implements aqg {
    public ArrayAdapter a;
    public LicenseMenuActivity b;

    @Override // defpackage.dp
    public final void U() {
        super.U();
        aqh supportLoaderManager = mJ().getSupportLoaderManager();
        if (supportLoaderManager.b.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (aqh.b(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(supportLoaderManager);
                sb.append(" of 54321");
            }
            aqi e = supportLoaderManager.b.e();
            if (e == null) {
                return;
            }
            e.o();
            supportLoaderManager.b.d.l(54321);
            return;
        }
        throw new IllegalStateException("destroyLoader must be called on the main thread");
    }

    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        dt mJ = mJ();
        this.a = new ArrayAdapter(mJ, (int) R.layout.libraries_social_licenses_license, (int) R.id.license, new ArrayList());
        aqh supportLoaderManager = mJ.getSupportLoaderManager();
        if (supportLoaderManager.b.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        aqi e = supportLoaderManager.b.e();
        if (aqh.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(supportLoaderManager);
            sb.append(": args=");
            sb.append((Object) null);
        }
        if (e == null) {
            try {
                supportLoaderManager.b.e = true;
                aqn aqnVar = new aqn(mJ());
                if (aqnVar.getClass().isMemberClass() && !Modifier.isStatic(aqnVar.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + aqnVar);
                }
                aqi aqiVar = new aqi(aqnVar);
                if (aqh.b(3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aqiVar);
                }
                supportLoaderManager.b.d.k(54321, aqiVar);
                supportLoaderManager.b.d();
                aqiVar.p(supportLoaderManager.a, this);
            } catch (Throwable th) {
                supportLoaderManager.b.d();
                throw th;
            }
        } else {
            if (aqh.b(3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("  Re-using existing loader ");
                sb3.append(e);
            }
            e.p(supportLoaderManager.a, this);
        }
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: vgf
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                vgg vggVar = vgg.this;
                License license = (License) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = vggVar.b;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, LicenseActivity.class);
                    intent.putExtra("license", license);
                    licenseMenuActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        dt mJ = mJ();
        if (mJ instanceof LicenseMenuActivity) {
            this.b = (LicenseMenuActivity) mJ;
        }
    }

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        this.b = null;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }
}
