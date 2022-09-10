package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ceaw  reason: default package */
/* loaded from: classes4.dex */
public final class ceaw {
    public dmbc a;
    public dmbc b;
    public final z<ceam> c;
    public final z<ceap> d;
    public final v<ceao> e;
    public djgl f;
    public final akfc g;
    public final Executor h;
    public final bulj i;
    public final buzx j;
    private final bwrs<ilo> k;
    private final dwyd l;
    private final dnqh m;
    private final bbul n;
    private final bbtk o;
    private final btrm p;

    public ceaw(dmbc dmbcVar, bwrs bwrsVar, dwyd dwydVar, dnqh dnqhVar, bbul bbulVar, akfc akfcVar, bbtk bbtkVar, btrm btrmVar, bulj buljVar, buzx buzxVar, Executor executor) {
        this.k = bwrsVar;
        this.l = dwydVar;
        this.m = dnqhVar;
        this.n = bbulVar;
        this.g = akfcVar;
        this.o = bbtkVar;
        this.p = btrmVar;
        this.i = buljVar;
        this.j = buzxVar;
        this.h = executor;
        if (dmbcVar == null) {
            ilo a = a();
            dmbb bZ = dmbc.h.bZ();
            dmbr bZ2 = dmbu.i.bZ();
            akqi ai = a.ai();
            dzvx.b(ai, "placemark.featureId");
            String o = ai.o();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbu dmbuVar = (dmbu) bZ2.b;
            o.getClass();
            dmbuVar.a |= 1;
            dmbuVar.b = o;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbc dmbcVar2 = (dmbc) bZ.b;
            dmbu bK = bZ2.bK();
            bK.getClass();
            dmbcVar2.c = bK;
            dmbcVar2.a |= 2;
            dmbc bK2 = bZ.bK();
            dzvx.b(bK2, "Post.newBuilder().setMet…IdString)\n      ).build()");
            dmbcVar = bK2;
        }
        this.a = dmbcVar;
        this.b = dmbcVar;
        z<ceam> zVar = new z<>(new ceam(dmbcVar, this.b, dnqhVar));
        this.c = zVar;
        this.d = new z<>(ceap.EDITING);
        this.e = am.a(zVar, new ceay(ceaq.a));
    }

    public final ilo a() {
        ilo c = this.k.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void b(dmbc dmbcVar) {
        this.c.g(new ceam(dmbcVar, this.b, this.m));
        this.a = dmbcVar;
    }

    public final void c(dmbc dmbcVar) {
        ceap ceapVar;
        dzvx.c(dmbcVar, "value");
        ceam ceamVar = new ceam(this.a, dmbcVar, this.m);
        z<ceap> zVar = this.d;
        ceao ceaoVar = ceamVar.f;
        ceao ceaoVar2 = ceao.SAVED;
        if (ceaoVar.ordinal() == 0) {
            ceapVar = ceap.PUBLISHED;
        } else {
            ceapVar = ceap.EDITING;
        }
        zVar.g(ceapVar);
        this.c.g(ceamVar);
        this.b = dmbcVar;
    }

    public final void d() {
        this.d.g(ceap.PUBLISH_FAILURE);
        this.p.b(cdjh.e(this.k, 5));
    }

    public final void e(ceam ceamVar, btlu btluVar, List<dmba> list) {
        ilo a = a();
        dwyd dwydVar = this.l;
        bbtk bbtkVar = this.o;
        dzvx.c(btluVar, "gmmAccount");
        dzvx.c(list, "photoPlaceholders");
        bbvh e = bbvh.e(a);
        bbui k = bbuj.k();
        k.p(btluVar);
        k.h(dwydVar);
        ArrayList arrayList = new ArrayList(dzti.d(list, 10));
        for (dmba dmbaVar : list) {
            arrayList.add(dmbaVar.a);
        }
        k.k(dcdc.r(arrayList));
        dcdc<String> dcdcVar = ceamVar.b.a;
        dzvx.b(dcdcVar, "mediaChanges.additions");
        ArrayList arrayList2 = new ArrayList(dzti.d(dcdcVar, 10));
        for (String str : dcdcVar) {
            arrayList2.add(Uri.parse(str));
        }
        ArrayList<Uri> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            Uri uri = (Uri) obj;
            dzvx.b(uri, "it");
            if (cean.a(uri)) {
                arrayList3.add(obj);
            }
        }
        for (Uri uri2 : arrayList3) {
            k.n(bbtkVar.a(uri2), e);
        }
        bbuj m = k.m();
        dzvx.b(m, "PhotoUploaderRequest.bui…        }\n      }.build()");
        this.n.d(m);
        dmbg dmbgVar = this.b.d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dzvx.b(dmbgVar, "draftPost.content");
        dsrj<dmay> dsrjVar = dmbgVar.d;
        dzvx.b(dsrjVar, "draftPost.content.photoList");
        ArrayList arrayList4 = new ArrayList(dzti.d(dsrjVar, 10));
        int i = 0;
        for (dmay dmayVar : dsrjVar) {
            int i2 = i + 1;
            if (i < 0) {
                dzti.c();
            }
            dmay dmayVar2 = dmayVar;
            dzvx.b(dmayVar2, "photo");
            String str2 = dmayVar2.b;
            dzvx.b(str2, "photo.contentId");
            if (str2.length() == 0 && i < list.size()) {
                dsqp dsqpVar = (dsqp) dmayVar2.cu(5);
                dsqpVar.bC(dmayVar2);
                dmax dmaxVar = (dmax) dsqpVar;
                String str3 = list.get(i).a;
                if (dmaxVar.c) {
                    dmaxVar.bF();
                    dmaxVar.c = false;
                }
                dmay dmayVar3 = (dmay) dmaxVar.b;
                str3.getClass();
                dmayVar3.a |= 1;
                dmayVar3.b = str3;
                dmayVar2 = dmaxVar.bK();
            }
            arrayList4.add(dmayVar2);
            i = i2;
        }
        dmbc dmbcVar = this.b;
        dsqp dsqpVar2 = (dsqp) dmbcVar.cu(5);
        dsqpVar2.bC(dmbcVar);
        dmbb dmbbVar = (dmbb) dsqpVar2;
        dmbg dmbgVar2 = this.b.d;
        if (dmbgVar2 == null) {
            dmbgVar2 = dmbg.i;
        }
        dsqp dsqpVar3 = (dsqp) dmbgVar2.cu(5);
        dsqpVar3.bC(dmbgVar2);
        dmbf dmbfVar = (dmbf) dsqpVar3;
        if (dmbfVar.c) {
            dmbfVar.bF();
            dmbfVar.c = false;
        }
        ((dmbg) dmbfVar.b).d = dmbg.ck();
        dmbfVar.a(arrayList4);
        if (dmbbVar.c) {
            dmbbVar.bF();
            dmbbVar.c = false;
        }
        dmbc dmbcVar2 = (dmbc) dmbbVar.b;
        dmbg bK = dmbfVar.bK();
        bK.getClass();
        dmbcVar2.d = bK;
        dmbcVar2.a |= 4;
        dmbc bK2 = dmbbVar.bK();
        dzvx.b(bK2, "draftPost.content.photoL…))\n        .build()\n    }");
        c(bK2);
    }

    public final void f(int i) {
        dmbq d = a().bn().d();
        dsqp dsqpVar = (dsqp) d.cu(5);
        dsqpVar.bC(d);
        dzvx.b(dsqpVar, "placemark.postInfo.postInfoProto().toBuilder()");
        dmbp dmbpVar = (dmbp) dsqpVar;
        dmau dmauVar = ((dmbq) dmbpVar.b).c;
        if (dmauVar == null) {
            dmauVar = dmau.f;
        }
        dsqp dsqpVar2 = (dsqp) dmauVar.cu(5);
        dsqpVar2.bC(dmauVar);
        dzvx.b(dsqpVar2, "postInfo.ownPostInfo.toBuilder()");
        dmat dmatVar = (dmat) dsqpVar2;
        dmbv bZ = dmbw.d.bZ();
        dmbc dmbcVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbw dmbwVar = (dmbw) bZ.b;
        dmbcVar.getClass();
        dmbwVar.b = dmbcVar;
        boolean z = true;
        dmbwVar.a |= 1;
        dmbw bK = bZ.bK();
        if (dmatVar.c) {
            dmatVar.bF();
            dmatVar.c = false;
        }
        dmau dmauVar2 = (dmau) dmatVar.b;
        bK.getClass();
        dmauVar2.b = bK;
        dmauVar2.a |= 1;
        if (!dmauVar2.c) {
            dmbw dmbwVar2 = dmauVar2.b;
            if (dmbwVar2 == null) {
                dmbwVar2 = dmbw.d;
            }
            if ((dmbwVar2.a & 1) == 0) {
                z = false;
            }
        }
        if (dmatVar.c) {
            dmatVar.bF();
            dmatVar.c = false;
        }
        dmau dmauVar3 = (dmau) dmatVar.b;
        dmauVar3.a |= 2;
        dmauVar3.c = z;
        dmau bK2 = dmatVar.bK();
        if (dmbpVar.c) {
            dmbpVar.bF();
            dmbpVar.c = false;
        }
        dmbq dmbqVar = (dmbq) dmbpVar.b;
        bK2.getClass();
        dmbqVar.c = bK2;
        dmbqVar.a |= 2;
        a().bx(dmbpVar.bK());
        this.k.d(a());
        this.p.b(cdjh.e(this.k, i));
    }
}
