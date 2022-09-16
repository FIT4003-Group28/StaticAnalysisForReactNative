package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdlb  reason: default package */
/* loaded from: classes3.dex */
public class bdlb implements bdks, bdkm {
    public static final dcqe a = dcqe.c("bdlb");
    final afy b;
    public final Executor c;
    public final bdru d;
    public final bdrv e;
    public final bcan f;
    public final bdlr g;
    public final bdlx h;
    public final bbtk i;
    public final bbut j;
    public final cjqy k;
    public dcdn<bbtm, bdlm> l;
    public final dxio<apni> m;
    private final cqqv n;
    private final Activity o;
    private final axru p;
    private final Executor q;
    private final bbve r;
    private final bwrs<bcan> s;
    private final bdqb t;

    public bdlb(bdru bdruVar, bbve bbveVar, bwrs<bcan> bwrsVar, bdrv bdrvVar, Activity activity, cqhn cqhnVar, Executor executor, Executor executor2, axru axruVar, bdlr bdlrVar, bdlx bdlxVar, bbtk bbtkVar, bbut bbutVar, cjqy cjqyVar, bdqb bdqbVar, dxio<apni> dxioVar) {
        bdla bdlaVar = new bdla(this);
        this.b = bdlaVar;
        this.n = new cqqv(bdlaVar);
        this.l = dcmn.a;
        this.o = activity;
        this.q = executor;
        this.c = executor2;
        this.p = axruVar;
        this.d = bdruVar;
        this.r = bbveVar;
        this.e = bdrvVar;
        this.s = bwrsVar;
        bcan c = bwrsVar.c();
        dbsk.s(c);
        this.f = c;
        this.g = bdlrVar;
        this.h = bdlxVar;
        this.i = bbtkVar;
        this.j = bbutVar;
        this.k = cjqyVar;
        this.t = bdqbVar;
        this.m = dxioVar;
    }

    public static boolean k(bbtj bbtjVar) {
        boolean z = bbtjVar.r().a() && bbtjVar.s().a();
        return bbtjVar.b().equals(bbti.VIDEO) ? z && bbtjVar.t().a() : z;
    }

    @Override // defpackage.bdkm
    public void a(bbtm bbtmVar) {
        final boolean i = this.r.i();
        final boolean z = this.t.a(this.o.getPackageManager()) && this.r.j();
        List<bbtm> e = e();
        final int indexOf = e.indexOf(bbtmVar);
        if (indexOf < 0) {
            return;
        }
        final dehn<List<dwfl>> r = this.j.r(e);
        r.Pk(new Runnable(this, r, indexOf, i, z) { // from class: bdkx
            private final bdlb a;
            private final dehn b;
            private final int c;
            private final boolean d;
            private final boolean e;

            {
                this.a = this;
                this.b = r;
                this.c = indexOf;
                this.d = i;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dbsg<bbtw> i2;
                bdlb bdlbVar = this.a;
                dehn dehnVar = this.b;
                int i3 = this.c;
                boolean z2 = this.d;
                boolean z3 = this.e;
                try {
                    List list = (List) dehnVar.get();
                    bbto bbtoVar = new bbto();
                    for (bbtm bbtmVar2 : bdlbVar.f.v()) {
                        bbtoVar.a(bbtmVar2.a(), bbvk.MUTED);
                    }
                    ckni ckniVar = new ckni(list, null, bbtoVar);
                    bbut bbutVar = bdlbVar.j;
                    bbtv v = bbty.v();
                    if (bdur.b(bdlbVar.f.b)) {
                        i2 = dbpy.a;
                    } else {
                        i2 = z2 ? dbsg.i(bbtw.DONT_SEND_YET) : dbpy.a;
                    }
                    v.c(i2);
                    boolean z4 = true;
                    v.t(true);
                    v.i(z3);
                    v.n(true);
                    if (!z2 && !z3) {
                        z4 = false;
                    }
                    v.f(z4);
                    v.d(false);
                    v.e(false);
                    v.k(false);
                    v.v();
                    v.q(bbtx.CONTROL_AUDIO_TRACK_PRESENCE_FOR_UPLOAD);
                    bbutVar.o(ckniVar, i3, v.a(), bdlbVar.d);
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }, this.c);
    }

    @Override // defpackage.bdkm
    public void b(bbtj bbtjVar, boolean z) {
        this.e.d(bbtjVar, z);
    }

    @Override // defpackage.bdks
    public String c() {
        return this.o.getResources().getQuantityString(R.plurals.UPLOAD_PHOTO_PHOTOS_SELECTED, this.l.size(), Integer.valueOf(this.l.size()));
    }

    @Override // defpackage.bdks
    public List<bdlm> d() {
        dcbg b = dcbg.b(this.f.l());
        final bbtk bbtkVar = this.i;
        bbtkVar.getClass();
        dcdn<bbtm, bdlm> D = b.s(new dbrn(bbtkVar) { // from class: bdkt
            private final bbtk a;

            {
                this.a = bbtkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.b((bbtm) obj);
            }
        }).o(new dbsl(this) { // from class: bdku
            private final bdlb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.m.a().b() || bdlb.k((bbtj) obj);
            }
        }).s(new dbrn(this) { // from class: bdkv
            private final bdlb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bdlb bdlbVar = this.a;
                bbtj bbtjVar = (bbtj) obj;
                bbtm q = bbtjVar.q();
                bdlm bdlmVar = bdlbVar.l.get(q);
                if (bdlmVar != null) {
                    return bdlmVar;
                }
                bbti bbtiVar = bbti.PHOTO;
                int ordinal = bbtjVar.b().ordinal();
                if (ordinal == 0) {
                    bdlr bdlrVar = bdlbVar.g;
                    bdlr.a(bdlbVar, 1);
                    bdlr.a(q, 2);
                    bbtk a2 = bdlrVar.a.a();
                    bdlr.a(a2, 3);
                    Activity activity = (Activity) ((dxjd) bdlrVar.b).a;
                    bdlr.a(activity, 4);
                    dxio a3 = ((dxjh) bdlrVar.c).a();
                    bdlr.a(a3, 5);
                    return new bdlq(bdlbVar, q, a2, activity, a3);
                } else if (ordinal == 1) {
                    bdlx bdlxVar = bdlbVar.h;
                    bcan bcanVar = bdlbVar.f;
                    bdlx.a(bdlbVar, 1);
                    bdlx.a(q, 2);
                    bdlx.a(bcanVar, 3);
                    Activity activity2 = (Activity) ((dxjd) bdlxVar.a).a;
                    bdlx.a(activity2, 4);
                    bbtk a4 = bdlxVar.b.a();
                    bdlx.a(a4, 5);
                    apqe a5 = bdlxVar.c.a();
                    bdlx.a(a5, 6);
                    dxio a6 = ((dxjh) bdlxVar.d).a();
                    bdlx.a(a6, 7);
                    return new bdlw(bdlbVar, q, bcanVar, activity2, a4, a5, a6);
                } else {
                    throw new IllegalArgumentException("Media type was not handled.");
                }
            }
        }).D(bdkw.a);
        this.l = D;
        List<bdlm> l = dchl.l(dcdc.r(D.values()));
        int i = 0;
        for (bdlm bdlmVar : l) {
            bdlmVar.j(i);
            i++;
        }
        return l;
    }

    @Override // defpackage.bdks
    public List<bbtm> e() {
        return dchl.l(this.f.l());
    }

    @Override // defpackage.bdks
    public cqqv f() {
        return this.n;
    }

    @Override // defpackage.bdks
    public Boolean g() {
        return Boolean.valueOf(this.p.a("android.permission.READ_EXTERNAL_STORAGE"));
    }

    public void h(bbua bbuaVar) {
        List<dwfl> l = dchl.l(bbuaVar.a());
        List<bbtm> e = e();
        if (l.size() != e.size()) {
            bvoo.h("new photo descriptions size != selectedPhotos size: %d %d", Integer.valueOf(l.size()), Integer.valueOf(e.size()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (bbtm bbtmVar : e) {
            linkedHashMap.put(bbtmVar.A(), bbtmVar);
        }
        this.f.t();
        for (dwfl dwflVar : l) {
            bbtm bbtmVar2 = (bbtm) linkedHashMap.get(dwflVar.d);
            if (bbtmVar2 == null) {
                bvoo.h("Could not find selected photo corresponding to photo from lightbox: %s", dwflVar.d);
            } else {
                String str = dwflVar.g;
                this.f.u(this.f.s(this.i.b(bbtmVar2), Uri.parse(dwflVar.h), str), bbuaVar.b().contains(dwflVar));
            }
        }
        cqkx.p(this);
    }

    public void i(bbtj bbtjVar) {
        this.f.z(bbtjVar);
        cqkx.p(this);
    }

    public void j(bbtj bbtjVar) {
        this.f.H(bbtjVar);
        cqkx.p(this);
    }

    public void l(final List<bbtj> list) {
        this.q.execute(new Runnable(this, list) { // from class: bdky
            private final bdlb a;
            private final List b;

            {
                this.a = this;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbtm r;
                final bdlb bdlbVar = this.a;
                for (bbtj bbtjVar : this.b) {
                    if (bdlbVar.f.q(bbtjVar) && bdlb.k(bbtjVar) && (r = bdlbVar.f.r(bbtjVar)) != null && !bdlb.k(bdlbVar.i.b(r))) {
                        bdlbVar.f.H(bbtjVar);
                        bdlbVar.f.z(bbtjVar);
                    }
                }
                bdlbVar.c.execute(new Runnable(bdlbVar) { // from class: bdkz
                    private final bdlb a;

                    {
                        this.a = bdlbVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                });
            }
        });
    }
}
