package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cauq  reason: default package */
/* loaded from: classes4.dex */
public final class cauq implements btzi<dkez, dkfb> {
    final /* synthetic */ cauu a;

    public cauq(cauu cauuVar) {
        this.a = cauuVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkez> btzrVar, btzy btzyVar) {
        Toast.makeText(this.a.d, (int) R.string.PLACE_QA_ERROR_MESSAGE_GENERIC, 0).show();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkez> btzrVar, dkfb dkfbVar) {
        c();
    }

    public final void c() {
        this.a.j = true;
        cqkx.p(this.a);
        Toast.makeText(this.a.d, bdys.PLACE_QA_SUCCESS_MESSAGE_REPLY_DELETED, 0).show();
    }
}