package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chky  reason: default package */
/* loaded from: classes4.dex */
final class chky implements btzi<duvu, duvx> {
    final /* synthetic */ chkz a;

    public chky(chkz chkzVar) {
        this.a = chkzVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duvu> btzrVar, btzy btzyVar) {
        Toast.makeText(this.a.a, (int) R.string.CHECK_NETWORK_CONNECTION, 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duvu> btzrVar, duvx duvxVar) {
        duvx duvxVar2 = duvxVar;
        int a = dpvz.a(duvxVar2.b);
        if (a == 0 || a != 2) {
            Toast.makeText(this.a.a, duvxVar2.c, 0).show();
            return;
        }
        afha a2 = this.a.b.a();
        dqdk dqdkVar = duvxVar2.e;
        if (dqdkVar == null) {
            dqdkVar = dqdk.e;
        }
        a2.D(dqdkVar);
    }
}
