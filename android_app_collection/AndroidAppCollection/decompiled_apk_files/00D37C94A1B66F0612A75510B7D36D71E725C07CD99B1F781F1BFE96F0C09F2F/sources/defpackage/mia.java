package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: mia  reason: default package */
/* loaded from: classes3.dex */
public final class mia extends kqs {
    private final ajrx o;
    private final ajrp p;

    public mia(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, R.layout.compact_radio_item, ajxzVar);
        this.o = gemVar;
        gemVar.c(this.d);
        this.p = new ajrp(aafoVar, gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.o).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        aqeo aqeoVar = (aqeo) obj;
        ajrp ajrpVar = this.p;
        acti actiVar = ajrsVar.a;
        arag aragVar2 = null;
        if ((aqeoVar.b & 16) != 0) {
            apzgVar = aqeoVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajrsVar.a.u(new acte(aqeoVar.k), null);
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.b.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        if ((aqeoVar.b & 4) != 0) {
            aragVar = aqeoVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        k(ajgl.b(aragVar));
        if ((aqeoVar.b & 1024) != 0 && (aragVar2 = aqeoVar.j) == null) {
            aragVar2 = arag.a;
        }
        d(ajgl.b(aragVar2));
        avhn avhnVar = aqeoVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        g(avhnVar);
        List list = aqeoVar.e;
        if (m(list)) {
            i(list);
        } else {
            arag aragVar3 = aqeoVar.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            CharSequence b = ajgl.b(aragVar3);
            arag aragVar4 = aqeoVar.h;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            j(b, ajgl.b(aragVar4));
        }
        View view = ((gem) this.o).b;
        ates atesVar = aqeoVar.g;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        f(view, atesVar, aqeoVar, ajrsVar.a);
        this.o.e(ajrsVar);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.p.c();
    }
}
