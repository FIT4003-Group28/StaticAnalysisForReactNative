package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bevq  reason: default package */
/* loaded from: classes3.dex */
public class bevq implements bevp {
    private final List<bevv> a;

    public bevq(ilo iloVar, begg beggVar, Activity activity, beuq beuqVar) {
        dnjf ad = iloVar.ad();
        dbsk.s(ad);
        this.a = new ArrayList();
        int i = 0;
        for (doex doexVar : ad.b) {
            this.a.add(new bevw(doexVar, beggVar, activity, beuqVar, i, ad.c));
            i += doexVar.c.size();
        }
    }

    @Override // defpackage.bevp
    public List<bevv> a() {
        return this.a;
    }
}
