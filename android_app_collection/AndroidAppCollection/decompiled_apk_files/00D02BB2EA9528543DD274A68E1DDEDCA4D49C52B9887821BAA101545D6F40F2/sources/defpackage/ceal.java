package defpackage;

import android.net.Uri;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ceal  reason: default package */
/* loaded from: classes4.dex */
final class ceal extends dzvy implements dzut<dkck> {
    final /* synthetic */ ceam a;

    public ceal(ceam ceamVar) {
        this.a = ceamVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dkck a() {
        dbsk.l(this.a.e);
        dcep<String> dcepVar = this.a.b.b;
        dzvx.b(dcepVar, "mediaChanges.removals");
        ArrayList arrayList = new ArrayList(dzti.d(dcepVar, 10));
        for (String str : dcepVar) {
            dkcb bZ = dkcc.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkcc dkccVar = (dkcc) bZ.b;
            str.getClass();
            dkccVar.a = 1 | dkccVar.a;
            dkccVar.b = str;
            arrayList.add(bZ.bK());
        }
        dcdc<String> dcdcVar = this.a.b.a;
        dzvx.b(dcdcVar, "mediaChanges.additions");
        ArrayList arrayList2 = new ArrayList(dzti.d(dcdcVar, 10));
        for (String str2 : dcdcVar) {
            dkbu bZ2 = dkbz.c.bZ();
            Uri parse = Uri.parse(str2);
            dzvx.b(parse, "Uri.parse(it)");
            if (cean.a(parse)) {
                dkbx bZ3 = dkby.c.bZ();
                dzvx.b(str2, "it");
                Charset charset = dzxd.a;
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str2.getBytes(charset);
                dzvx.b(bytes, "(this as java.lang.String).getBytes(charset)");
                String uuid = UUID.nameUUIDFromBytes(bytes).toString();
                dzvx.b(uuid, "UUID.nameUUIDFromBytes(p…toByteArray()).toString()");
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dkby dkbyVar = (dkby) bZ3.b;
                uuid.getClass();
                dkbyVar.a |= 1;
                dkbyVar.b = uuid;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkbz dkbzVar = (dkbz) bZ2.b;
                dkby bK = bZ3.bK();
                bK.getClass();
                dkbzVar.b = bK;
                dkbzVar.a = 1;
            } else {
                dkbv bZ4 = dkbw.c.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dkbw dkbwVar = (dkbw) bZ4.b;
                str2.getClass();
                dkbwVar.a |= 1;
                dkbwVar.b = str2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkbz dkbzVar2 = (dkbz) bZ2.b;
                dkbw bK2 = bZ4.bK();
                bK2.getClass();
                dkbzVar2.b = bK2;
                dkbzVar2.a = 2;
            }
            arrayList2.add(bZ2.bK());
        }
        dkbt bZ5 = dkck.e.bZ();
        String str3 = this.a.i.b;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dkck dkckVar = (dkck) bZ5.b;
        str3.getClass();
        dkckVar.a |= 1;
        dkckVar.b = str3;
        dkcg bZ6 = dkch.d.bZ();
        dkce bZ7 = dkcf.d.bZ();
        dkca bZ8 = dkcd.c.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dkcd dkcdVar = (dkcd) bZ8.b;
        dsrj<dkcc> dsrjVar = dkcdVar.a;
        if (!dsrjVar.a()) {
            dkcdVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, dkcdVar.a);
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dkcd dkcdVar2 = (dkcd) bZ8.b;
        dsrj<dkbz> dsrjVar2 = dkcdVar2.b;
        if (!dsrjVar2.a()) {
            dkcdVar2.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(arrayList2, dkcdVar2.b);
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dkcf dkcfVar = (dkcf) bZ7.b;
        dkcd bK3 = bZ8.bK();
        bK3.getClass();
        dkcfVar.c = bK3;
        dkcfVar.a |= 4;
        if (this.a.a) {
            dmcb bZ9 = dmcc.i.bZ();
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
            String str4 = dmccVar.b;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dmcc dmccVar2 = (dmcc) bZ9.b;
            str4.getClass();
            dmccVar2.a |= 1;
            dmccVar2.b = str4;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dkcf dkcfVar2 = (dkcf) bZ7.b;
            dmcc bK4 = bZ9.bK();
            bK4.getClass();
            dkcfVar2.b = bK4;
            dkcfVar2.a |= 2;
        }
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dkch dkchVar = (dkch) bZ6.b;
        dkcf bK5 = bZ7.bK();
        bK5.getClass();
        dkchVar.b = bK5;
        dkchVar.a |= 1;
        dkci bZ10 = dkcj.d.bZ();
        boolean z = this.a.a;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dkcj dkcjVar = (dkcj) bZ10.b;
        int i = dkcjVar.a | 2;
        dkcjVar.a = i;
        dkcjVar.b = z;
        boolean z2 = this.a.c;
        dkcjVar.a = i | 4;
        dkcjVar.c = z2;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dkch dkchVar2 = (dkch) bZ6.b;
        dkcj bK6 = bZ10.bK();
        bK6.getClass();
        dkchVar2.c = bK6;
        dkchVar2.a |= 2;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dkck dkckVar2 = (dkck) bZ5.b;
        dkch bK7 = bZ6.bK();
        bK7.getClass();
        dkckVar2.c = bK7;
        dkckVar2.a |= 2;
        dnqh dnqhVar = this.a.k;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dkck dkckVar3 = (dkck) bZ5.b;
        dnqhVar.getClass();
        dkckVar3.d = dnqhVar;
        dkckVar3.a |= 8;
        dkck bK8 = bZ5.bK();
        dzvx.b(bK8, "UpdateUgcPostRequest.new…gParams)\n        .build()");
        return bK8;
    }
}
