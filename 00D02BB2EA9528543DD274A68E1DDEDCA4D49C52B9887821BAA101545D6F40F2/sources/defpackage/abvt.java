package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abvt  reason: default package */
/* loaded from: classes2.dex */
public class abvt implements abqn {
    private final String a;
    private final List<abql> b;

    public abvt(final abvr abvrVar, dqfq dqfqVar, final ddho ddhoVar, final abse abseVar) {
        this.a = dqfqVar.d;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(dcbg.b(dqfqVar.f).s(new dbrn(abvrVar, ddhoVar, abseVar) { // from class: abvs
            private final abvr a;
            private final ddho b;
            private final abse c;

            {
                this.a = abvrVar;
                this.b = ddhoVar;
                this.c = abseVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((dqfo) obj, this.b, null, null, this.c);
            }
        }).z());
        if (dqfqVar.e.isEmpty()) {
            return;
        }
        new jic(dqfqVar.e, ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.izf
    public List<abql> Pd() {
        return this.b;
    }

    @Override // defpackage.abqn
    public String b() {
        return this.a;
    }

    @Override // defpackage.abqn
    public cjtd c() {
        return cjtd.b;
    }
}
