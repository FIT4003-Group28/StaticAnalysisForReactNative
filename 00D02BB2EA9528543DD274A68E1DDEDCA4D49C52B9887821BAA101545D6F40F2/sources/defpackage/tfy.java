package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tfy  reason: default package */
/* loaded from: classes7.dex */
public class tfy implements tfr {
    private final jib a;

    public tfy(final gga ggaVar) {
        jhz a = jhz.a();
        a.q = ibm.a();
        a.x = false;
        a.A = false;
        a.d = ibq.E();
        a.j = cqrt.l(R.string.BACK_BUTTON);
        a.f(new View.OnClickListener(ggaVar) { // from class: tfx
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s();
            }
        });
        a.e = cquj.c(cqup.a(cquo.a(cqrt.f(2131231689))), cqup.a(cquo.a(ibo.f())));
        this.a = a.b();
    }

    @Override // defpackage.tfr
    public jib a() {
        return this.a;
    }
}
