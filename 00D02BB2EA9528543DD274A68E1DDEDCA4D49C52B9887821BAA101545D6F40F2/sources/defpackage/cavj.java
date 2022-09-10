package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cavj  reason: default package */
/* loaded from: classes4.dex */
final class cavj implements btzi<dwtm, dwul> {
    final /* synthetic */ cavk a;

    public cavj(cavk cavkVar) {
        this.a = cavkVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwtm> btzrVar, btzy btzyVar) {
        gga ggaVar = this.a.a;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.CONTRIBUTION_STATS_CANNOT_LOAD_ERROR_TOAST), 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwtm> btzrVar, dwul dwulVar) {
        cawy a = cawz.a(dwulVar);
        if ((a.a & 4) != 0) {
            dqwa dqwaVar = a.d;
            if (dqwaVar == null) {
                dqwaVar = dqwa.g;
            }
            if (dqwaVar.equals(dqwa.g)) {
                return;
            }
            this.a.f(a);
        }
    }
}
