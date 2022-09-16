package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bide  reason: default package */
/* loaded from: classes3.dex */
final class bide implements axvz {
    final /* synthetic */ bidk a;

    public bide(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // defpackage.axvz
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        if (z) {
            bidk bidkVar = this.a;
            bidkVar.b.s(bidkVar.i(false));
            return;
        }
        cqkx.p(this.a);
        Toast.makeText(this.a.a, (int) R.string.CONTACT_WRITE_ERROR_MESSAGE, 0).show();
    }
}
