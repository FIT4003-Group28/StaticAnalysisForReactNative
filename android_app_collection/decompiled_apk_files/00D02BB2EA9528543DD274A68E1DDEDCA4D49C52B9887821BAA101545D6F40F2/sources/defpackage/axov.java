package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axov  reason: default package */
/* loaded from: classes3.dex */
final class axov implements degu<Void> {
    final /* synthetic */ btlu a;
    final /* synthetic */ axow b;

    public axov(axow axowVar, btlu btluVar) {
        this.b = axowVar;
        this.a = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        axow axowVar = this.b;
        axowVar.e = false;
        Toast.makeText(axowVar.a.a(), this.b.a.a().getString(R.string.REQUEST_FAILURE_ERROR_TOAST_SHORT), 0).show();
        cqkx.p(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r6) {
        this.b.b.aa(bvjk.gX, this.a, TimeUnit.MILLISECONDS.toSeconds(this.b.c.b()));
        this.b.d.run();
    }
}
