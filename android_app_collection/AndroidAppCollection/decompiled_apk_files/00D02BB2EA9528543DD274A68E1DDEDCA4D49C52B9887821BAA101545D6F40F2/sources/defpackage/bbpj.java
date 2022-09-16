package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbpj  reason: default package */
/* loaded from: classes3.dex */
final class bbpj implements degu<bbmn> {
    final /* synthetic */ bbpi a;
    final /* synthetic */ bbpk b;

    public bbpj(bbpk bbpkVar, bbpi bbpiVar) {
        this.b = bbpkVar;
        this.a = bbpiVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        Toast.makeText(this.b.c, (int) R.string.PERSONAL_SCORE_FEEDBACK_SAVE_FAILURE, 0).show();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bbmn bbmnVar) {
        bbpk bbpkVar = this.b;
        bbpkVar.d = bbmnVar;
        List<bbni> list = bbpkVar.e;
        if (list != null) {
            list.remove(this.a);
            cqkx.p(this.b);
        }
        Toast.makeText(this.b.c, (int) R.string.PERSONAL_SCORE_FEEDBACK_TOAST_SUCCESS, 0).show();
    }
}
