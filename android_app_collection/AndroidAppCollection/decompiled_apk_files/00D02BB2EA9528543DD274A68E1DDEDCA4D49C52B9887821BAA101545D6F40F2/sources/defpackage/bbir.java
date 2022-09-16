package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbir  reason: default package */
/* loaded from: classes3.dex */
final class bbir implements brlm {
    final /* synthetic */ bbis a;

    public bbir(bbis bbisVar) {
        this.a = bbisVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        bbis bbisVar = this.a;
        bbisVar.o = brlnVar;
        brln brlnVar2 = bbisVar.o;
        if (brlnVar2 == null) {
            bvoo.h("(personal-score): Search succeeded without result", new Object[0]);
        } else if (bbisVar.p) {
        } else {
            bwrs<ilo> a = bwrs.a(brlnVar2.e.F());
            cjqy cjqyVar = bbisVar.j;
            cjsx i = cjsy.i();
            i.b(ddda.eF);
            cjqyVar.k(i.a());
            bbisVar.m.dismiss();
            bbisVar.l.b(a, bbisVar.n);
        }
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        this.a.m.dismiss();
        final bbis bbisVar = this.a;
        bbisVar.i.execute(new Runnable(bbisVar) { // from class: bbio
            private final bbis a;

            {
                this.a = bbisVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a.c, (int) R.string.UNKNOWN_ERROR, 1).show();
            }
        });
        bttqVar.toString();
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        this.a.m.dismiss();
    }
}
