package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: btja  reason: default package */
/* loaded from: classes4.dex */
public final class btja implements btjs {
    public final btjt a;
    public final bsvm b;
    public final cjqy c;
    public final Preference d;
    public dbsg<UdcCacheResponse.UdcSetting> e = dbpy.a;
    private final bzqc f;

    public btja(Context context, btjt btjtVar, bsvm bsvmVar, cjqy cjqyVar, bzqc bzqcVar) {
        this.a = btjtVar;
        this.b = bsvmVar;
        this.c = cjqyVar;
        this.f = bzqcVar;
        Preference a = bvjo.a(context);
        this.d = a;
        a.x(R.string.SETTINGS_ITEM_LOCATION_HISTORY_DESCRIPTION);
        a.o = new btiz(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.d);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.d;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.f.b(bzqb.LOCATION_HISTORY, new dbsz(this) { // from class: btiy
            private final btja a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                btja btjaVar = this.a;
                btjaVar.e = dbsg.i((UdcCacheResponse.UdcSetting) obj);
                if (btjaVar.e.a()) {
                    int i = btjaVar.e.b().b;
                    if (i == 2) {
                        btjaVar.d.t(R.string.SETTINGS_ITEM_LOCATION_HISTORY_TITLE_STATUS_ON);
                        return;
                    } else if (i == 3) {
                        btjaVar.d.s(btjaVar.a.a(R.string.SETTINGS_ITEM_LOCATION_HISTORY_TITLE_STATUS_OFF));
                        return;
                    } else {
                        btjaVar.d.t(R.string.SETTINGS_ITEM_LOCATION_HISTORY_TITLE_STATUS_UNKNOWN);
                        return;
                    }
                }
                btjaVar.d.t(R.string.SETTINGS_ITEM_LOCATION_HISTORY_TITLE_STATUS_UNKNOWN);
            }
        });
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
