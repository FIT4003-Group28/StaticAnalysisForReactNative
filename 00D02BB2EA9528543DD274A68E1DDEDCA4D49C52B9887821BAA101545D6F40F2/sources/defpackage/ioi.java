package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ioi  reason: default package */
/* loaded from: classes6.dex */
public final class ioi implements ioa, iol {
    public static final /* synthetic */ int j = 0;
    public final cjqy b;
    public final ink c;
    public final ddho d;
    public final ddho e;
    final Bitmap f;
    private final gga l;
    private final akox m;
    private final hwe n;
    private final btvo o;
    private final amfi p;
    private final dehq q;
    private final Executor r;
    private final crzb s;
    private final btrm t;
    private final boolean u;
    private final aluu w;
    static final cqrp a = cqrp.d(24.0d);
    private static final cqrp k = cqrp.d(12.0d);
    private static final dbsl<dmpn> A = ioh.a;
    private final Map<String, Bitmap> v = new HashMap();
    private dcdc<ilo> x = dcdc.e();
    private dcdc<Integer> y = dcdc.e();
    public Map<akpp, Runnable> g = dcmn.a;
    private dcdc<hwb> z = dcdc.e();
    public Map<akpp, Runnable> h = dcmn.a;
    @dzsi
    public Runnable i = null;

    public ioi(gga ggaVar, akox akoxVar, hwe hweVar, btvo btvoVar, amfi amfiVar, dehq dehqVar, Executor executor, crzb crzbVar, btrm btrmVar, cjqy cjqyVar, ink inkVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        this.l = ggaVar;
        this.m = akoxVar;
        this.n = hweVar;
        this.o = btvoVar;
        this.p = amfiVar;
        this.q = dehqVar;
        this.r = executor;
        this.s = crzbVar;
        this.t = btrmVar;
        this.b = cjqyVar;
        this.c = inkVar;
        this.u = z;
        this.d = ddhoVar;
        this.e = ddhoVar2;
        Bitmap decodeResource = BitmapFactory.decodeResource(ggaVar.getResources(), 2131233039);
        cqrp cqrpVar = k;
        int i = 1;
        this.f = Bitmap.createScaledBitmap(decodeResource, cqrpVar.e(ggaVar), cqrpVar.e(ggaVar), true);
        String str = btvoVar.getVectorMapsParameters().h;
        int a2 = dujv.a(btvoVar.getAdsParameters().b);
        this.w = new aluu(str, alxb.a(a2 != 0 ? a2 : i, ggaVar.getResources()), btvoVar.getCategoricalSearchParameters().u());
    }

    @dzsi
    private final Bitmap j(dpxe dpxeVar) {
        return k(this.w.d(dpxeVar));
    }

    @dzsi
    private final Bitmap k(String str) {
        if (this.v.containsKey(str)) {
            return this.v.get(str);
        }
        Bitmap h = this.p.h(str, iny.class.getName(), new amfq(this) { // from class: ioe
            private final ioi a;

            {
                this.a = this;
            }

            @Override // defpackage.amfq
            public final void a(amfu amfuVar) {
                ioi ioiVar = this.a;
                if (amfuVar.a()) {
                    ioiVar.i(1);
                }
            }
        }).h();
        if (h == null) {
            return null;
        }
        cqrp cqrpVar = a;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(h, cqrpVar.e(this.l), cqrpVar.e(this.l), true);
        this.v.put(str, createScaledBitmap);
        return createScaledBitmap;
    }

    @Override // defpackage.ioa
    public final void a() {
        this.s.a();
        if (this.u) {
            this.m.aj().aC().i(A);
        }
        btrm btrmVar = this.t;
        dceq a2 = dcet.a();
        a2.b(alie.class, new iok(alie.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
    }

    @Override // defpackage.ioa
    public final void b() {
        this.s.a();
        this.t.a(this);
        if (this.u) {
            this.m.aj().aC().j(A);
        }
    }

    @Override // defpackage.ioa
    public final void c() {
        f();
    }

    @Override // defpackage.ioa
    public final void d(inx inxVar, dcdc<ilo> dcdcVar, boolean z) {
        e(dcdcVar, ((inh) inxVar).a, z);
    }

    public final void e(dcdc<ilo> dcdcVar, dcdc<Integer> dcdcVar2, boolean z) {
        this.s.a();
        boolean cs = ilo.cs(this.x, dcdcVar);
        if (!dchl.m(dcdcVar2, this.y) || !cs) {
            this.y = dcdcVar2;
            this.x = dcdcVar;
            int i = 2;
            if (z && !cs) {
                i = 3;
            }
            i(i);
        }
    }

    public final void f() {
        this.s.a();
        this.n.g(this.z);
        this.z = dcdc.e();
        this.x = dcdc.e();
        this.y = dcdc.e();
        this.g = dcmn.a;
        this.h = dcmn.a;
    }

    @Override // defpackage.iol
    public final Bitmap g(ilo iloVar) {
        String str;
        dndr bj = iloVar.bj();
        Bitmap bitmap = null;
        if (bj == null && (bj = iloVar.p) == null) {
            bj = !iloVar.F.isEmpty() ? dndr.CONTACT : null;
        }
        if (bj != null) {
            int ordinal = bj.ordinal();
            if (ordinal == 1) {
                str = "home";
            } else if (ordinal == 2) {
                str = "work";
            } else if (ordinal == 3) {
                str = "contacts";
            } else if (ordinal == 4) {
                str = "nickname";
            }
            bitmap = k(MessageFormat.format("{0}icon/name=assets/icons/poi/quantum/container_background-2-medium.png,assets/icons/poi/quantum/container-2-medium.png,assets/icons/poi/quantum/{1}-2-medium.png&highlight=ffffff,db4437,ffffff&scale=4", this.o.getVectorMapsParameters().h, str));
        }
        if (bitmap != null) {
            return bitmap;
        }
        dpxe dpxeVar = iloVar.cz().e;
        if (dpxeVar == null) {
            dpxeVar = dpxe.g;
        }
        Bitmap j2 = j(dpxeVar);
        if (j2 != null) {
            return j2;
        }
        Bitmap j3 = j(dpxe.g);
        return j3 != null ? j3 : this.f;
    }

    public final void h(Iterable<akpp> iterable, boolean z, boolean z2) {
        dcdc<hwb> e = this.n.e(iterable, z ? this.z : dcdc.e(), z2);
        dccx F = dcdc.F();
        F.i(e);
        if (!z) {
            F.i(this.z);
        }
        this.z = F.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i) {
        if (!this.h.isEmpty()) {
            this.i = new Runnable(this) { // from class: iob
                private final ioi a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i(2);
                }
            };
        }
        boolean z = false;
        int i2 = 0;
        dcnk p = dcnm.p(dcaf.a(dclz.g(0, Integer.valueOf(this.x.size())), dcat.a), dcep.K(this.y));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dcpd it = ((dcng) p).iterator();
        while (it.hasNext()) {
            final ilo iloVar = this.x.get(((Integer) it.next()).intValue());
            akqq aj = iloVar.aj();
            if (aj != null) {
                linkedHashMap.put(akpp.p(aj, false, 1, this.f), new Runnable(this, iloVar) { // from class: iof
                    private final ioi a;
                    private final ilo b;

                    {
                        this.a = this;
                        this.b = iloVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ioi ioiVar = this.a;
                        ilo iloVar2 = this.b;
                        cjqy cjqyVar = ioiVar.b;
                        cjta b = cjtd.b();
                        b.d = ioiVar.d;
                        b.g = iloVar2.ai().n();
                        cjqyVar.i(b.a());
                        ioiVar.c.b(iloVar2);
                    }
                });
            }
        }
        dcdc<Integer> dcdcVar = this.y;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            final ilo iloVar2 = this.x.get(dcdcVar.get(i3).intValue());
            akqq aj2 = iloVar2.aj();
            if (aj2 != null) {
                linkedHashMap.put(akpp.p(aj2, false, 2, g(iloVar2)), new Runnable(this, iloVar2) { // from class: iog
                    private final ioi a;
                    private final ilo b;

                    {
                        this.a = this;
                        this.b = iloVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ioi ioiVar = this.a;
                        ilo iloVar3 = this.b;
                        cjqy cjqyVar = ioiVar.b;
                        cjta b = cjtd.b();
                        b.d = ioiVar.e;
                        b.g = iloVar3.ai().n();
                        cjqyVar.i(b.a());
                        ioiVar.c.a(iloVar3);
                    }
                });
            }
        }
        dcdn r = dcdn.r(linkedHashMap);
        this.h = r;
        if (i == 3) {
            this.n.g(this.z);
            this.z = dcdc.e();
            this.g = dcmn.a;
            for (final akpp akppVar : this.h.keySet()) {
                bvqd.a(this.q.d(new Runnable(this, akppVar) { // from class: ioc
                    private final ioi a;
                    private final akpp b;

                    {
                        this.a = this;
                        this.b = akppVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ioi ioiVar = this.a;
                        akpp akppVar2 = this.b;
                        if (ioiVar.h.containsKey(akppVar2)) {
                            ioiVar.h(dcdc.f(akppVar2), false, true);
                            dcdg c = dcdn.p().c(ioiVar.g);
                            c.f(akppVar2, ioiVar.h.get(akppVar2));
                            ioiVar.g = c.b();
                        }
                    }
                }, i2, TimeUnit.MILLISECONDS), this.r);
                i2 += 65;
            }
            bvqd.a(this.q.d(new Runnable(this) { // from class: iod
                private final ioi a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ioi ioiVar = this.a;
                    ioiVar.h = dcmn.a;
                    Runnable runnable = ioiVar.i;
                    if (runnable != null) {
                        runnable.run();
                        ioiVar.i = null;
                    }
                }
            }, i2, TimeUnit.MILLISECONDS), this.r);
            return;
        }
        Iterable<akpp> keySet = r.keySet();
        if (i == 2) {
            z = true;
        }
        h(keySet, true, z);
        this.g = this.h;
        this.h = dcmn.a;
    }
}
