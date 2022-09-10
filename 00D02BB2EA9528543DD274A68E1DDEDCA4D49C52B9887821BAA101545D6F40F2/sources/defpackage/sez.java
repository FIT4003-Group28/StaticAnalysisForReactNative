package defpackage;

import android.app.Application;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sez  reason: default package */
/* loaded from: classes7.dex */
public final class sez implements degu<Object> {
    final /* synthetic */ Runnable a;
    final /* synthetic */ sfa b;

    public sez(sfa sfaVar, Runnable runnable) {
        this.b = sfaVar;
        this.a = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        throw new RuntimeException(th);
    }

    @Override // defpackage.degu
    public final void b(@dzsi Object obj) {
        sfa sfaVar = this.b;
        if (sfaVar.c.b()) {
            Application application = sfaVar.a;
            Toast.makeText(application, application.getResources().getString(R.string.SYNC_ERROR_TOAST), 0).show();
            sfaVar.b.a();
        } else if (sfaVar.c.c()) {
            sfaVar.b.a();
        } else {
            this.a.run();
        }
    }
}
