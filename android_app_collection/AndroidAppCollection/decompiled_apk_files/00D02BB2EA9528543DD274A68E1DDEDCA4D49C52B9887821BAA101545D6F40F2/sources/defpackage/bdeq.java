package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdeq  reason: default package */
/* loaded from: classes3.dex */
public final class bdeq implements bdal {
    public final begg a;
    private final Activity b;

    public bdeq(Activity activity, begg beggVar) {
        this.b = activity;
        this.a = beggVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        dwfl a = bczwVar.a();
        dizh dizhVar = a.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dlwk dlwkVar = dizhVar.d;
        if (dlwkVar == null) {
            dlwkVar = dlwk.g;
        }
        String str = dlwkVar.f;
        if (str.isEmpty()) {
            str = this.b.getString(R.string.VIEW_PLACE_LINK_TITLE);
        }
        ilo c = ckob.c(a);
        final begj begjVar = new begj();
        begjVar.b(c);
        begjVar.K = true;
        jhm jhmVar = new jhm();
        jhmVar.h = 0;
        jhmVar.c = cqrt.f(2131231715);
        jhmVar.d = ibl.b();
        jhmVar.a = str;
        jhmVar.b = str;
        jhmVar.f = cjtd.a(dtxy.cF);
        jhmVar.d(new View.OnClickListener(this, begjVar) { // from class: bdep
            private final bdeq a;
            private final begj b;

            {
                this.a = this;
                this.b = begjVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bdeq bdeqVar = this.a;
                bdeqVar.a.o(this.b, false, null);
            }
        });
        return jhmVar.c();
    }
}
