package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhsk  reason: default package */
/* loaded from: classes3.dex */
public class bhsk {
    private final btvo a;
    private final Resources b;
    private final Boolean c;
    private bwrs<ilo> d = bwrs.a(null);

    public bhsk(btvo btvoVar, Resources resources, bvjj bvjjVar) {
        this.a = btvoVar;
        this.b = resources;
        this.c = Boolean.valueOf(bvjjVar.m(bvjk.kg, false));
    }

    public final dcdc<bhsl> a(cclp cclpVar, dgfb dgfbVar, bvqg<ccln> bvqgVar) {
        return b(cclpVar.b(dgfbVar), bvqgVar);
    }

    public final dcdc<bhsl> b(List<ccln> list, bvqg<ccln> bvqgVar) {
        dccx F = dcdc.F();
        for (int i = 0; i < list.size(); i++) {
            bwrs<ilo> bwrsVar = this.d;
            F.g(new bhsl(this.a, list.get(i), bvqgVar, this.b, i, this.c.booleanValue(), bwrsVar));
        }
        return F.f();
    }
}
