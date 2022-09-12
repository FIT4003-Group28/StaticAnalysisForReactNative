package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: culv  reason: default package */
/* loaded from: classes5.dex */
public final class culv implements degu<cugu> {
    final /* synthetic */ culw a;

    public culv(culw culwVar) {
        this.a = culwVar;
    }

    @Override // defpackage.degu
    public final void a(final Throwable th) {
        culw.h(new Runnable(this, th) { // from class: culu
            private final culv a;
            private final Throwable b;

            {
                this.a = this;
                this.b = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Activity activity;
                culv culvVar = this.a;
                cstl.a("PhotoLightBPresenter");
                culw culwVar = culvVar.a;
                cuss<dbsg<cugu>> cussVar = culwVar.i;
                if (cussVar == null || (activity = culwVar.h) == null) {
                    return;
                }
                dbsg<dbsg<cugu>> h = cussVar.h();
                if (!h.a() || !h.b().a()) {
                    return;
                }
                dbsg<cukp> b = cuiq.b(h.b().b());
                if (!b.a() || b.b().g() == 2) {
                    return;
                }
                Toast.makeText(activity, (int) R.string.lightbox_temporary_download_failure_toast, 0).show();
                culvVar.a.a.f();
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cugu cuguVar) {
        cstl.a("PhotoLightBPresenter");
    }
}
