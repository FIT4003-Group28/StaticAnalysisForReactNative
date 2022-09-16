package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnfm  reason: default package */
/* loaded from: classes3.dex */
public final class bnfm extends ibd implements bnel {
    private final List<bnfi> g;
    private final gt h;
    private final List<cqix<?>> i;

    public bnfm(bwrs<ilo> bwrsVar, gn gnVar, Activity activity, cqhn cqhnVar, cjqy cjqyVar, bwqv bwqvVar) {
        super(cqhnVar, cjqyVar);
        bnae bnaeVar = new bnae();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "PLACEMARK_REF_KEY", bwrsVar);
        bundle.putInt("INITIAL_POST_INDEX_KEY", -1);
        bnaeVar.B(bundle);
        bnal bnalVar = new bnal();
        Bundle bundle2 = new Bundle();
        bwqvVar.c(bundle2, "VisitorUpdates.Placemark", bwrsVar);
        bnalVar.B(bundle2);
        List<bnfi> a = dztd.a(new bnfi[]{new bnfi(bnaeVar, bnfl.OWNER), new bnfi(bnalVar, bnfl.VISITORS)});
        this.g = a;
        this.h = new bnfk(a, gnVar);
        ArrayList arrayList = new ArrayList(dzti.d(a, 10));
        for (bnfi bnfiVar : a) {
            arrayList.add(cqgr.fT(iaq.g().b().h(), new bnfj(activity, bnfiVar.b)));
        }
        this.i = arrayList;
    }

    @Override // defpackage.bnel
    public List<cqix<?>> d() {
        return this.i;
    }

    @Override // defpackage.bnel
    public gt e() {
        return this.h;
    }
}
