package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cewq  reason: default package */
/* loaded from: classes4.dex */
public final class cewq implements btzi<djar, djav> {
    final /* synthetic */ cexa a;

    public cewq(cexa cexaVar) {
        this.a = cexaVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djar> btzrVar, btzy btzyVar) {
        Toast.makeText(this.a.b, (int) R.string.PLACE_QA_ERROR_MESSAGE_GENERIC, 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djar> btzrVar, djav djavVar) {
        djav djavVar2 = djavVar;
        int a = djau.a(djavVar2.b);
        if (a == 0 || a != 2) {
            QY(btzrVar, btzy.a);
            return;
        }
        cexa cexaVar = this.a;
        cexaVar.h.a(cexaVar);
        anhk anhkVar = this.a.d;
        dnwb dnwbVar = djavVar2.c;
        if (dnwbVar == null) {
            dnwbVar = dnwb.i;
        }
        anhkVar.c(dnwbVar);
        Toast.makeText(this.a.b, (int) R.string.PLACE_QA_SUCCESS_MESSAGE_QUESTION_DELETED, 0).show();
    }
}
