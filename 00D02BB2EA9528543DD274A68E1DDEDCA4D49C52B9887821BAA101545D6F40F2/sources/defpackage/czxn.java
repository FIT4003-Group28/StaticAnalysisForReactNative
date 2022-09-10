package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czxn  reason: default package */
/* loaded from: classes5.dex */
final class czxn extends ne {
    final /* synthetic */ czxs b;

    public czxn(czxs czxsVar) {
        this.b = czxsVar;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        String Rp;
        super.f(view, pcVar);
        if (this.b.g.getVisibility() == 0) {
            Rp = this.b.Rp(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            Rp = this.b.Rp(R.string.mtrl_picker_toggle_to_day_selection);
        }
        pcVar.K(Rp);
    }
}
