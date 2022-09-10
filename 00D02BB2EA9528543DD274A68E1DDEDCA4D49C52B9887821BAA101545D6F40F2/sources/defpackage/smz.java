package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gmm.directions.destinations.settings.Ue3Preference;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: smz  reason: default package */
/* loaded from: classes7.dex */
public final class smz extends bszv implements ggg {
    public Context ad;
    public cjqy ae;
    public ite af;
    Ue3Preference ag = null;
    public smx ah;

    @Override // defpackage.bszv, defpackage.ggg
    public final gfu Nx() {
        return gfu.ACTIVITY_FRAGMENT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bszv
    public final jib aJ() {
        jhz e = super.aJ().e();
        e.f(new jmn(getClass()));
        return e.b();
    }

    @Override // defpackage.bszv, defpackage.ggg
    public final List<gfs> aO() {
        return dcdc.e();
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.PINNED_TRIPS_SETTINGS_PAGE_TITLE);
    }

    @Override // defpackage.bszv
    public final ddho aR() {
        return dtxy.dc;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        if (this.A == null) {
            return;
        }
        final Ue3Preference ue3Preference = new Ue3Preference(this.ad, this.af, this.ae);
        ue3Preference.t(R.string.DELETE_PINNED_TRIPS);
        cjta b2 = cjtd.b();
        b2.d = dtxy.db;
        ue3Preference.b = b2.a();
        ue3Preference.d = new auc(this) { // from class: smy
            private final smz a;

            {
                this.a = this;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                ff J;
                smx smxVar = this.a.ah;
                smz smzVar = smxVar.d.get();
                if (smzVar == null || (J = smzVar.J()) == null) {
                    return false;
                }
                cjkp B = cjkr.B();
                B.t(smxVar.b.getResources().getString(R.string.DELETE_PINNED_TRIPS_CONFIRMATION));
                B.y(smxVar.b.getResources().getString(R.string.DELETE_PINNED_TRIPS_CANCEL_BUTTON), null, cjtd.a(dtxy.da));
                B.z(smxVar.b.getResources().getString(R.string.DELETE_PINNED_TRIPS_DELETE_BUTTON), smxVar.a, cjtd.a(dtxy.cZ));
                smxVar.c = B.u(J);
                smxVar.c.q().show();
                return true;
            }
        };
        ue3Preference.o = ue3Preference.d == null ? null : new auc(ue3Preference) { // from class: sna
            private final Ue3Preference a;

            {
                this.a = ue3Preference;
            }

            @Override // defpackage.auc
            public final boolean a(Preference preference) {
                cjqy cjqyVar;
                Ue3Preference ue3Preference2 = this.a;
                auc aucVar = ue3Preference2.d;
                if (aucVar != null) {
                    cjtd cjtdVar = ue3Preference2.b;
                    TextView textView = ue3Preference2.c;
                    cjql e = textView == null ? null : cjqg.e(textView);
                    if (cjtdVar != null && e != null && (cjqyVar = ue3Preference2.a) != null) {
                        cjqyVar.j(e, cjtdVar);
                    }
                    return aucVar.a(preference);
                }
                return false;
            }
        };
        this.ag = ue3Preference;
        b.aj(ue3Preference);
    }

    @Override // defpackage.bszv
    public final void w() {
        dxix.a(this);
        this.ah.d = new WeakReference<>(this);
    }
}
