package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ptj  reason: default package */
/* loaded from: classes7.dex */
public final class ptj {
    public final cqkf<jbk> a;
    public final vos b;
    public final jib c;
    private final jbk d;

    public ptj(gga ggaVar, cqkj cqkjVar, vot votVar, final Runnable runnable) {
        cqkf<jbk> c = cqkjVar.c(new hxj(), null);
        this.a = c;
        this.b = votVar.a(c);
        jhz a = vos.a();
        a.j = cqrt.m(R.string.BACK_TO, ggaVar.getString(R.string.SEARCH));
        a.o = cjtd.a(dtxn.dW);
        a.f(new View.OnClickListener(runnable) { // from class: pti
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        });
        this.c = a.b();
        jbk jbkVar = new jbk(this) { // from class: pth
            private final ptj a;

            {
                this.a = this;
            }

            @Override // defpackage.jbk
            public jib NC() {
                return this.a.c;
            }
        };
        this.d = jbkVar;
        c.e(jbkVar);
    }
}
