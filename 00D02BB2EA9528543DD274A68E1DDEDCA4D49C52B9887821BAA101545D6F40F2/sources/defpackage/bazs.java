package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bazs  reason: default package */
/* loaded from: classes3.dex */
final class bazs implements axvz {
    final /* synthetic */ long a;
    final /* synthetic */ bazw b;

    public bazs(bazw bazwVar, long j) {
        this.b = bazwVar;
        this.a = j;
    }

    @Override // defpackage.axvz
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        if (z) {
            this.b.c.k(this.a);
            this.b.a.s(null);
            return;
        }
        Toast.makeText(this.b.t, (int) R.string.CONTACT_WRITE_ERROR_MESSAGE, 0).show();
    }
}
