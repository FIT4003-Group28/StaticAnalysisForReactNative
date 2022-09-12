package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cewr  reason: default package */
/* loaded from: classes4.dex */
public final class cewr implements btzi<dkez, dkfb> {
    final /* synthetic */ cexa a;

    public cewr(cexa cexaVar) {
        this.a = cexaVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkez> btzrVar, btzy btzyVar) {
        Toast.makeText(this.a.b, (int) R.string.PLACE_QA_ERROR_MESSAGE_GENERIC, 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkez> btzrVar, dkfb dkfbVar) {
        c();
    }

    public final void c() {
        cexa cexaVar = this.a;
        cexaVar.h.a(cexaVar);
        Toast.makeText(this.a.b, bdys.PLACE_QA_SUCCESS_MESSAGE_REPLY_DELETED, 0).show();
    }
}
