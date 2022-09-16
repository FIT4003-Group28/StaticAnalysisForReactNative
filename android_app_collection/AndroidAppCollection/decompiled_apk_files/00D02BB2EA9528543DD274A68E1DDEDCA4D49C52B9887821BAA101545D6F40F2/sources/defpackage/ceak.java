package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: ceak  reason: default package */
/* loaded from: classes4.dex */
final class ceak extends dzvy implements dzut<dhsg> {
    final /* synthetic */ ceam a;

    public ceak(ceam ceamVar) {
        this.a = ceamVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dhsg a() {
        dbsk.l(!this.a.e);
        dhsd bZ = dhsg.g.bZ();
        String uuid = UUID.randomUUID().toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsg dhsgVar = (dhsg) bZ.b;
        uuid.getClass();
        dhsgVar.a |= 2;
        dhsgVar.c = uuid;
        dmbu dmbuVar = this.a.i.c;
        if (dmbuVar == null) {
            dmbuVar = dmbu.i;
        }
        dzvx.b(dmbuVar, "publishedPost.metadata");
        String str = dmbuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsg dhsgVar2 = (dhsg) bZ.b;
        str.getClass();
        dhsgVar2.a |= 1;
        dhsgVar2.b = str;
        dhse bZ2 = dhsf.e.bZ();
        dmcb bZ3 = dmcc.i.bZ();
        dmbg dmbgVar = this.a.j.d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dzvx.b(dmbgVar, "draftPost.content");
        dmcc dmccVar = dmbgVar.c;
        if (dmccVar == null) {
            dmccVar = dmcc.i;
        }
        dzvx.b(dmccVar, "draftPost.content.text");
        String str2 = dmccVar.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmcc dmccVar2 = (dmcc) bZ3.b;
        str2.getClass();
        dmccVar2.a |= 1;
        dmccVar2.b = str2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhsf dhsfVar = (dhsf) bZ2.b;
        dmcc bK = bZ3.bK();
        bK.getClass();
        dhsfVar.b = bK;
        dhsfVar.a |= 2;
        int size = this.a.b.a.size();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhsf dhsfVar2 = (dhsf) bZ2.b;
        dhsfVar2.a |= 4;
        dhsfVar2.c = size;
        dmbg dmbgVar2 = this.a.j.d;
        if (dmbgVar2 == null) {
            dmbgVar2 = dmbg.i;
        }
        dzvx.b(dmbgVar2, "draftPost.content");
        dmce dmceVar = dmbgVar2.e;
        if (dmceVar == null) {
            dmceVar = dmce.d;
        }
        dzvx.b(dmceVar, "draftPost.content.visitInfo");
        drfu drfuVar = dmceVar.b;
        if (drfuVar == null) {
            drfuVar = drfu.c;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhsf dhsfVar3 = (dhsf) bZ2.b;
        drfuVar.getClass();
        dhsfVar3.d = drfuVar;
        dhsfVar3.a |= 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsg dhsgVar3 = (dhsg) bZ.b;
        dhsf bK2 = bZ2.bK();
        bK2.getClass();
        dhsgVar3.d = bK2;
        dhsgVar3.a |= 4;
        djgw a = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsg dhsgVar4 = (dhsg) bZ.b;
        a.getClass();
        dhsgVar4.f = a;
        int i = dhsgVar4.a | 32;
        dhsgVar4.a = i;
        dnqh dnqhVar = this.a.k;
        dnqhVar.getClass();
        dhsgVar4.e = dnqhVar;
        dhsgVar4.a = i | 16;
        dhsg bK3 = bZ.bK();
        dzvx.b(bK3, "CreateUgcPostRequest.new…gParams)\n        .build()");
        return bK3;
    }
}
