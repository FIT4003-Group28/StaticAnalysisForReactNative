package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brzj  reason: default package */
/* loaded from: classes4.dex */
public class brzj implements jbk {
    public final brzi a;
    private final String b;
    private boolean c = false;

    public brzj(cqhn cqhnVar, brzi brziVar, String str) {
        this.a = brziVar;
        this.b = str;
    }

    @Override // defpackage.jbk
    public jib NC() {
        String str = this.b;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: brzh
            private final brzj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((gen) ((brzr) this.a.a).a).aT();
            }
        };
        jhz jhzVar = new jhz();
        jhzVar.a = str;
        jhzVar.u = ibm.c();
        jhzVar.q = ibm.b();
        jhzVar.A = false;
        jhzVar.i = cqrt.g(2131232205, ibm.c());
        jhzVar.o = cjtd.a(dtxp.k);
        jhzVar.j = cqrt.l(R.string.ACCESSIBILITY_CLOSE_MENU);
        jhzVar.f(onClickListener);
        jhzVar.x = this.c;
        return jhzVar.b();
    }

    public void b(boolean z) {
        this.c = true;
        cqkx.p(this);
    }
}
