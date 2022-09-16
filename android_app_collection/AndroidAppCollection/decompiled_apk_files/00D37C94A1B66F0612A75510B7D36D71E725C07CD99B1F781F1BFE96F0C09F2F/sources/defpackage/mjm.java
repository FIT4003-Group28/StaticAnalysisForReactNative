package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjm  reason: default package */
/* loaded from: classes3.dex */
public final class mjm extends kqs {
    private final ajrx o;
    private final ajrp p;
    private final TextView q;

    public mjm(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, R.layout.grid_narrow_radio_item, ajxzVar);
        this.o = gemVar;
        gemVar.c(this.d);
        this.p = new ajrp(aafoVar, gemVar);
        this.q = (TextView) this.d.findViewById(R.id.title);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.o).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        areo areoVar = (areo) obj;
        ajrp ajrpVar = this.p;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = areoVar.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ates atesVar = null;
        ajrsVar.a.u(new acte(areoVar.l), null);
        arag aragVar4 = areoVar.e;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        k(ajgl.b(aragVar4));
        TextView textView = this.q;
        int i = areoVar.f;
        if (i == 0) {
            i = 1;
        }
        textView.setMaxLines(i);
        if ((areoVar.b & 64) != 0) {
            aragVar = areoVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        d(ajgl.b(aragVar));
        avhn avhnVar = areoVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        g(avhnVar);
        if (m(areoVar.d)) {
            i(areoVar.d);
        } else {
            if ((areoVar.b & 32) != 0) {
                aragVar2 = areoVar.h;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            CharSequence b = ajgl.b(aragVar2);
            if ((areoVar.b & 16) != 0) {
                aragVar3 = areoVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            j(b, ajgl.b(aragVar3));
        }
        View view = ((gem) this.o).b;
        if ((areoVar.b & 512) != 0 && (atesVar = areoVar.k) == null) {
            atesVar = ates.a;
        }
        f(view, atesVar, areoVar, ajrsVar.a);
        this.o.e(ajrsVar);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.p.c();
    }
}
