package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfrf  reason: default package */
/* loaded from: classes3.dex */
public final class bfrf implements dbty<dbsg<aeqj>> {
    final /* synthetic */ bfri a;

    public bfrf(bfri bfriVar) {
        this.a = bfriVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ dbsg<aeqj> a() {
        Object bfrhVar;
        bfri bfriVar = this.a;
        dnhi dnhiVar = bfriVar.b.j;
        if (dnhiVar == null) {
            dnhiVar = dnhi.f;
        }
        int a = dnhh.a(dnhiVar.b);
        if (a != 0 && a == 2) {
            dnhi dnhiVar2 = bfriVar.b.j;
            if (dnhiVar2 == null) {
                dnhiVar2 = dnhi.f;
            }
            if (dnhiVar2.e > 0) {
                dnhi dnhiVar3 = bfriVar.b.j;
                if (dnhiVar3 == null) {
                    dnhiVar3 = dnhi.f;
                }
                if ((dnhiVar3.a & 4) != 0) {
                    bfri bfriVar2 = this.a;
                    Resources resources = bfriVar2.a;
                    dnhi dnhiVar4 = bfriVar2.b.j;
                    if (dnhiVar4 == null) {
                        dnhiVar4 = dnhi.f;
                    }
                    bfrhVar = new bfrg(resources, dnhiVar4, this.a.c);
                    return dbsg.i(bfrhVar);
                }
            }
        }
        bfri bfriVar3 = this.a;
        dnhi dnhiVar5 = bfriVar3.b.j;
        if (dnhiVar5 == null) {
            dnhiVar5 = dnhi.f;
        }
        int a2 = dnhh.a(dnhiVar5.b);
        if (a2 != 0 && a2 == 6) {
            dnhi dnhiVar6 = bfriVar3.b.j;
            if (dnhiVar6 == null) {
                dnhiVar6 = dnhi.f;
            }
            if ((dnhiVar6.a & 64) != 0) {
                dnhi dnhiVar7 = bfriVar3.b.j;
                if (dnhiVar7 == null) {
                    dnhiVar7 = dnhi.f;
                }
                if ((dnhiVar7.a & 4) != 0) {
                    bfri bfriVar4 = this.a;
                    Resources resources2 = bfriVar4.a;
                    dnhi dnhiVar8 = bfriVar4.b.j;
                    if (dnhiVar8 == null) {
                        dnhiVar8 = dnhi.f;
                    }
                    bfrhVar = new bfrh(resources2, dnhiVar8, this.a.c);
                    return dbsg.i(bfrhVar);
                }
            }
        }
        return dbpy.a;
    }
}
