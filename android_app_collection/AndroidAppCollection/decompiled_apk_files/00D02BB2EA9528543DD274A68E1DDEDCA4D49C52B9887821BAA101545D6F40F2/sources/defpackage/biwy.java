package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: biwy  reason: default package */
/* loaded from: classes3.dex */
public class biwy implements biwh {
    private final btvo a;
    private final Spanned b;
    private final cjtd c;
    @dzsi
    private final acpa d;

    public biwy(gga ggaVar, btvo btvoVar, dxio<anhg> dxioVar, bnhv bnhvVar, bvsx bvsxVar, ilo iloVar) {
        acpc acpcVar;
        acpc acpcVar2;
        this.a = btvoVar;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.jM;
        if (btvoVar.getPlaceSheetParameters().B()) {
            c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        cjtd a = c.a();
        this.c = a;
        dpwl dpwlVar = iloVar.h().u;
        dpwlVar = dpwlVar == null ? dpwl.d : dpwlVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dpwlVar.a);
        for (dpwk dpwkVar : dpwlVar.b) {
            int i = dpwkVar.a;
            int i2 = dpwkVar.b;
            if (i >= 0 && i <= spannableStringBuilder.length() && i2 >= 0 && i2 <= spannableStringBuilder.length() && i2 > i) {
                String substring = dpwlVar.a.substring(i, i2);
                dpsn dpsnVar = dpwkVar.c;
                spannableStringBuilder.setSpan(bnhvVar.a(substring, akqi.j(dpsnVar == null ? dpsn.d : dpsnVar), a), i, i2, 33);
            }
        }
        this.b = spannableStringBuilder;
        dpwl dpwlVar2 = iloVar.h().u;
        if (!(dpwlVar2 == null ? dpwl.d : dpwlVar2).c) {
            acpcVar2 = null;
        } else {
            String[] split = ggaVar.getString(R.string.LOCATION_HINT_DISCLOSURE_TEXT).split("LINK", -1);
            if (split.length != 3) {
                acpcVar = new acpc(dbrz.e("").h(split), ggaVar.getString(R.string.PLACE_MORE_INFO));
            } else {
                bvsv a2 = bvsxVar.a(split[0]);
                bvsv a3 = bvsxVar.a(split[1]);
                a3.k(new biwx(dxioVar));
                a2.f(a3);
                a2.g(split[2]);
                acpcVar = new acpc(a2.c(), ggaVar.getString(R.string.PLACE_MORE_INFO));
            }
            acpcVar2 = acpcVar;
        }
        this.d = acpcVar2;
    }

    @Override // defpackage.biwh
    public Spanned a() {
        return this.b;
    }

    @Override // defpackage.biwh
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.biwh
    @dzsi
    public acpa c() {
        return this.d;
    }

    @Override // defpackage.biwh
    public Integer d() {
        return Integer.valueOf(true != this.a.getPlaceSheetParameters().B() ? 0 : 8);
    }
}
