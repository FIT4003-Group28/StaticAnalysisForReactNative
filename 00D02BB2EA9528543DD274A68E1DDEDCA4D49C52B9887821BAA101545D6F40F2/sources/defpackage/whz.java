package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whz  reason: default package */
/* loaded from: classes7.dex */
public class whz implements jbk {
    public final Executor a;
    public final WeakReference<gga> b;
    public final cpv c;
    public boolean d = false;
    @dzsi
    public wgj e;
    private final jib f;
    private final ddho g;
    private final ddho h;
    private final wgi i;

    public whz(cqhn cqhnVar, Executor executor, gga ggaVar, cpv cpvVar, jib jibVar, ddho ddhoVar, ddho ddhoVar2, wgi wgiVar) {
        this.f = jibVar;
        this.g = ddhoVar;
        this.h = ddhoVar2;
        this.i = wgiVar;
        this.c = cpvVar;
        this.a = executor;
        this.b = new WeakReference<>(ggaVar);
        deha.q(wgiVar.a(), new whx(this), executor);
    }

    @Override // defpackage.jbk
    public jib NC() {
        if (!this.d) {
            return this.f;
        }
        jhz e = this.f.e();
        jhm jhmVar = new jhm();
        jhmVar.h = 1;
        jhmVar.c = cqrt.f(true != b() ? 2131232305 : 2131232304);
        jhmVar.d = b() ? ibm.x() : ibm.l();
        jhmVar.d(new View.OnClickListener(this) { // from class: whw
            private final whz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                whz whzVar = this.a;
                wgj wgjVar = whzVar.e;
                if (wgjVar == null) {
                    return;
                }
                deha.q(wgjVar.a() ? wgjVar.e() : wgjVar.d(), new why(whzVar), whzVar.a);
            }
        });
        jhmVar.f = cjtd.a(b() ? this.g : this.h);
        gga ggaVar = this.b.get();
        if (ggaVar != null) {
            jhmVar.b = ggaVar.getString(true != b() ? R.string.SAVED_TRIPS_PIN_BUTTON : R.string.SAVED_TRIPS_UNPIN_BUTTON);
        }
        e.c(jhmVar.c());
        return e.b();
    }

    public boolean b() {
        wgj wgjVar = this.e;
        return wgjVar != null && wgjVar.a();
    }
}
