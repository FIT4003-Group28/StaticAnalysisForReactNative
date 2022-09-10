package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axps  reason: default package */
/* loaded from: classes3.dex */
final class axps implements degu<dhyy> {
    final /* synthetic */ axpt a;

    public axps(axpt axptVar) {
        this.a = axptVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof axir)) {
            Toast.makeText(this.a.a.a(), this.a.a.a().getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT), 0).show();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dhyy dhyyVar) {
        int a = dhyx.a(dhyyVar.c);
        if (a != 0 && a == 3) {
            Toast.makeText(this.a.a.a(), this.a.a.a().getString(R.string.CANNOT_FOLLOW_ERROR), 0).show();
        }
    }
}
