package defpackage;

import android.content.Context;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: csyb  reason: default package */
/* loaded from: classes5.dex */
public final class csyb implements csug {
    public final Context a;
    public final dehp b = cstu.b().a;
    public csuk c;
    private final ctgc d;

    public csyb(Context context, ctgc ctgcVar) {
        this.a = context;
        this.d = ctgcVar;
    }

    @Override // defpackage.csug
    public final cuss<Integer> a(ctyy ctyyVar, dbsl<cufw> dbslVar, Integer num) {
        return c(ctyyVar).n(dbslVar, num);
    }

    @Override // defpackage.csug
    public final cuss<Pair<dcdc<cufw>, Boolean>> b(final ctyy ctyyVar, int i, int i2, dbsl<cufw> dbslVar) {
        return cusl.d(c(ctyyVar).am(i, i2, dbslVar), new dbrn(this, ctyyVar) { // from class: csxy
            private final csyb a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csyb csybVar = this.a;
                ctyy ctyyVar2 = this.b;
                Pair pair = (Pair) obj;
                dcdc dcdcVar = (dcdc) pair.first;
                int size = dcdcVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    csybVar.c.b(ctyyVar2, ((cufw) dcdcVar.get(i3)).a()).l();
                }
                return pair;
            }
        });
    }

    public final cusm c(ctyy ctyyVar) {
        return this.d.a(ctyyVar);
    }
}
