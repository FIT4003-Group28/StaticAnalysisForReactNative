package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cauo  reason: default package */
/* loaded from: classes4.dex */
public final class cauo implements btzi<djaa, djae> {
    final /* synthetic */ cauu a;

    public cauo(cauu cauuVar) {
        this.a = cauuVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djaa> btzrVar, btzy btzyVar) {
        Toast.makeText(this.a.d, (int) R.string.PLACE_QA_ERROR_MESSAGE_GENERIC, 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djaa> btzrVar, djae djaeVar) {
        djae djaeVar2 = djaeVar;
        int a = djad.a(djaeVar2.b);
        if (a == 0 || a != 2) {
            QY(btzrVar, btzy.a);
            return;
        }
        this.a.j = true;
        cqkx.p(this.a);
        anhk anhkVar = this.a.c;
        dnwb dnwbVar = djaeVar2.c;
        if (dnwbVar == null) {
            dnwbVar = dnwb.i;
        }
        anhkVar.c(dnwbVar);
        Toast.makeText(this.a.d, (int) R.string.PLACE_QA_SUCCESS_MESSAGE_ANSWER_DELETED, 0).show();
    }
}
