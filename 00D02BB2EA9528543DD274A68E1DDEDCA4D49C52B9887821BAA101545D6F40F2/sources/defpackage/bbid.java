package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbid  reason: default package */
/* loaded from: classes3.dex */
final class bbid implements bqlb {
    final /* synthetic */ bbie a;

    public bbid(bbie bbieVar) {
        this.a = bbieVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
    }

    @Override // defpackage.bqlb
    public final void e() {
        Toast.makeText(this.a.d, (int) R.string.PERSONAL_SCORE_FEEDBACK_SAVE_FAILURE, 1).show();
    }
}
