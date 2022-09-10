package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdbo  reason: default package */
/* loaded from: classes3.dex */
public final class bdbo implements bdal {
    public final bwqv a;
    public final gfw b;
    @dzsi
    public final ilo c;
    private final Activity d;

    public bdbo(Activity activity, bwqv bwqvVar, gfw gfwVar, @dzsi ilo iloVar) {
        this.d = activity;
        this.a = bwqvVar;
        this.b = gfwVar;
        this.c = iloVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        final dwfl a = bczwVar.a();
        dghi dghiVar = a.v;
        if (dghiVar == null) {
            dghiVar = dghi.d;
        }
        if (dghiVar.b) {
            String string = this.d.getString(R.string.DELETE_BUTTON);
            jhm a2 = jhm.a();
            a2.c = cqrt.f(2131232600);
            a2.d = ibl.b();
            a2.h = 2;
            a2.a = string;
            a2.b = string;
            a2.f = cjtd.a(dtxy.fo);
            a2.d(new View.OnClickListener(this, a) { // from class: bdbn
                private final bdbo a;
                private final dwfl b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bdbo bdboVar = this.a;
                    dwfl dwflVar = this.b;
                    if (cknv.i(dwflVar)) {
                        bdboVar.b.Qn(new bdgu(true, cknv.j(dwflVar)));
                        return;
                    }
                    bwqv bwqvVar = bdboVar.a;
                    dizh dizhVar = dwflVar.p;
                    if (dizhVar == null) {
                        dizhVar = dizh.j;
                    }
                    dggg dgggVar = dizhVar.b;
                    if (dgggVar == null) {
                        dgggVar = dggg.d;
                    }
                    bdboVar.b.aZ(bdgj.q(bwqvVar, dgggVar, cknv.j(dwflVar), bdboVar.c));
                }
            });
            return a2.c();
        }
        return null;
    }
}
