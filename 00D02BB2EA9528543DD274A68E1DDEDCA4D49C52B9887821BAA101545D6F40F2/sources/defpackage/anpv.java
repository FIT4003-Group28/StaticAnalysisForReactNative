package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anpv  reason: default package */
/* loaded from: classes2.dex */
public final class anpv implements ango {
    final /* synthetic */ dnhz a;
    final /* synthetic */ anpw b;

    public anpv(anpw anpwVar, dnhz dnhzVar) {
        this.b = anpwVar;
        this.a = dnhzVar;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        Executor executor = this.b.c;
        final dnhz dnhzVar = this.a;
        executor.execute(new Runnable(this, dnhzVar) { // from class: anpt
            private final anpv a;
            private final dnhz b;

            {
                this.a = this;
                this.b = dnhzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.b.a(new eapd(this.b.d));
            }
        });
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.b.c.execute(new Runnable(this) { // from class: anpu
            private final anpv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar = this.a.b.a;
                Toast.makeText(ggaVar, ggaVar.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION), 0).show();
            }
        });
    }
}
