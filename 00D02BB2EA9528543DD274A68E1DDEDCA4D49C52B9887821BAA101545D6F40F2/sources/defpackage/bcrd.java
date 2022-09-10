package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcrd  reason: default package */
/* loaded from: classes3.dex */
final class bcrd implements bbup {
    final /* synthetic */ bcrg a;

    public bcrd(bcrg bcrgVar) {
        this.a = bcrgVar;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    @Override // defpackage.bbup
    public final void j() {
        this.a.bo();
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        ff J = this.a.J();
        if (!this.a.aD || J == null) {
            return;
        }
        Toast.makeText(J, J.getString(R.string.FAILED_TO_FETCH_PHOTOS), 0).show();
    }
}
