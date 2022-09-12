package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: basz  reason: default package */
/* loaded from: classes3.dex */
public class basz implements baqm {
    private final gga a;
    private final ges b;
    private final jib c;

    public basz(gga ggaVar, fd fdVar, final afzv afzvVar, final dxio<akfa> dxioVar, axxe axxeVar) {
        this.a = ggaVar;
        this.b = (ges) fdVar;
        cqui c = cqui.c(cquh.a(1), cquh.f(ibl.a()));
        jhz a = jhz.a();
        a.a = axxeVar.a().c;
        a.s = 0;
        a.q = ibl.a();
        a.g = ibl.b();
        a.d = c;
        a.e = c;
        a.l = ggaVar.getResources().getString(R.string.TRIP_OVERFLOW_MENU_A11Y_HINT);
        a.x = false;
        a.f(new View.OnClickListener(this) { // from class: basw
            private final basz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        final dcdc z = dcbg.b(axxeVar.b()).t(basx.a).z();
        if (!z.isEmpty()) {
            jhm a2 = jhm.a();
            a2.a = ggaVar.getResources().getString(R.string.TRIP_SEE_RELATED_EMAILS);
            a2.n = !z.isEmpty();
            a2.d(new View.OnClickListener(afzvVar, z, dxioVar) { // from class: basy
                private final afzv a;
                private final dcdc b;
                private final dxio c;

                {
                    this.a = afzvVar;
                    this.b = z;
                    this.c = dxioVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i(this.b, ((akfa) this.c.a()).j());
                }
            });
            a2.f = cjtd.a(dtyd.db);
            a.c(a2.c());
        }
        this.c = a.b();
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.c;
    }

    public void b() {
        if (this.b.aD) {
            this.a.g().e();
        }
    }
}
