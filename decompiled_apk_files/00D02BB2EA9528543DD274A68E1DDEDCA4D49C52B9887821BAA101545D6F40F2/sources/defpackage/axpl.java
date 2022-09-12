package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axpl  reason: default package */
/* loaded from: classes3.dex */
final class axpl implements degu<djoq> {
    final /* synthetic */ axpr a;

    public axpl(axpr axprVar) {
        this.a = axprVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof axir)) {
            Toast.makeText(this.a.a.a(), this.a.a.a().getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT), 0).show();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djoq djoqVar) {
        cqkx.p(this.a);
    }
}
