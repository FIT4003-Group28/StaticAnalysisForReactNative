package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: atmt  reason: default package */
/* loaded from: classes2.dex */
public class atmt implements atnh {
    private static final dcqe a = dcqe.c("atmt");
    private final Context b;
    private final atmv c;
    private final List<zqy> d = new ArrayList();
    @dzsi
    private atnf e;

    public atmt(Context context, btrm btrmVar, cqat cqatVar, Resources resources, bvsx bvsxVar, bvsw bvswVar) {
        this.b = context;
        this.c = new atmv(context, btrmVar, cqatVar, resources, bvsxVar, bvswVar);
    }

    @Override // defpackage.zcb
    public List<? extends zbh> b() {
        return this.d;
    }

    public void c(atlq atlqVar, List<? extends atnf> list, boolean z, cqkp cqkpVar) {
        this.c.b(atlqVar);
        if (!list.isEmpty()) {
            this.e = list.get(0);
        } else {
            this.e = null;
            bvoo.h("Unexpected state: no header steps.", new Object[0]);
        }
        amvh[] amvhVarArr = atlqVar.m.g().a.o;
        int i = 0;
        for (atnf atnfVar : list) {
            if (atnfVar.m().booleanValue() && atnfVar.n().a == dgau.DESTINATION) {
                i++;
            }
        }
        if (i != this.d.size()) {
            this.d.clear();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        int i2 = 0;
        for (atnf atnfVar2 : list) {
            arrayList2.add(atnfVar2.i());
            if (atnfVar2.m().booleanValue() && atnfVar2.n().a == dgau.DESTINATION) {
                int i3 = i2 + 1;
                String p = amvhVarArr[i3].p();
                if (this.d.size() > i2) {
                    this.d.get(i2).k(p, arrayList2, z);
                } else {
                    zqy zqyVar = new zqy(this.b, p, i2, false, arrayList2);
                    zqyVar.h(cqkpVar);
                    this.d.add(zqyVar);
                }
                i2 = i3;
                arrayList2 = new ArrayList();
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.zcb
    /* renamed from: d */
    public atmv a() {
        return this.c;
    }

    @Override // defpackage.atnh
    @dzsi
    public atnf e() {
        return this.e;
    }

    @dzsi
    public CharSequence f() {
        return this.c.f();
    }
}
