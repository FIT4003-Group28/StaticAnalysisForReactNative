package defpackage;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sch  reason: default package */
/* loaded from: classes7.dex */
final class sch implements cqkn<sad> {
    final /* synthetic */ sco a;

    public sch(sco scoVar) {
        this.a = scoVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(sad sadVar, View view) {
        wbx wbxVar = this.a.m;
        if (wbxVar != null) {
            wbxVar.b();
            sca scaVar = this.a.u;
            dbsk.s(scaVar);
            scaVar.e = false;
            cqkx.p(this.a);
            Toast.makeText(this.a.n, (int) R.string.SAVED_PERSONAL_DRIVING_ROUTES_CLEARED_TOAST, 0).show();
        }
    }
}
