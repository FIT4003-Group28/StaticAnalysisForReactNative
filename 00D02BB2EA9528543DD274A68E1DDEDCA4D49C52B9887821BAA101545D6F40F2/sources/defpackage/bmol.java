package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmol  reason: default package */
/* loaded from: classes3.dex */
public final class bmol implements ango {
    final /* synthetic */ eapd a;
    final /* synthetic */ ilo b;
    final /* synthetic */ bwrs c;
    final /* synthetic */ eapg d;
    final /* synthetic */ Runnable e;
    final /* synthetic */ Activity f;
    final /* synthetic */ bmom g;

    public bmol(bmom bmomVar, eapd eapdVar, ilo iloVar, bwrs bwrsVar, eapg eapgVar, Runnable runnable, Activity activity) {
        this.g = bmomVar;
        this.a = eapdVar;
        this.b = iloVar;
        this.c = bwrsVar;
        this.d = eapgVar;
        this.e = runnable;
        this.f = activity;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        this.g.c.a(this.a);
        bwrs bwrsVar = this.c;
        ily g = this.b.g();
        g.l(this.a, this.d);
        bwrsVar.d(g.d());
        bvrb bvrbVar = this.g.f;
        final Runnable runnable = this.e;
        bvrbVar.b(new Runnable(runnable) { // from class: bmok
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.run();
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        ckos.a(this.f.findViewById(16908290), this.f.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION), -1).c();
    }
}
