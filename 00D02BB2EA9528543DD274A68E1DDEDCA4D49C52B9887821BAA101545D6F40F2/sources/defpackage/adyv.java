package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adyv  reason: default package */
/* loaded from: classes2.dex */
public final class adyv {
    public final Activity a;
    public final axjh b;
    private final fd i;
    private final abfa j;
    private final absg k;
    private final akfa l;
    private final akpm m;
    private final agaw n;
    private final agal o;
    private final btvo p;
    private final advx q;
    private final advz r;
    private final advv s;
    private final adxu t;
    private final adxz u;
    private final adwb v;
    private final adwj w;
    public final List<adyu> e = new ArrayList();
    private dirb x = null;
    private cqix<advs> y = null;
    public dqab f = dqac.d.bZ();
    public boolean h = false;
    private int z = 0;
    private final View.OnAttachStateChangeListener A = new adyt(this);
    public final List<cqix<advs>> c = new ArrayList();
    public final List<dlcv> d = new ArrayList();
    public advg g = advh.h.bZ();

    public adyv(Activity activity, fd fdVar, akfa akfaVar, abfa abfaVar, akpm akpmVar, agal agalVar, agaw agawVar, axjh axjhVar, btvo btvoVar, advx advxVar, advz advzVar, advv advvVar, adxu adxuVar, adxz adxzVar, adwb adwbVar, adwj adwjVar, absg absgVar) {
        this.a = activity;
        this.i = fdVar;
        this.l = akfaVar;
        this.j = abfaVar;
        this.m = akpmVar;
        this.o = agalVar;
        this.n = agawVar;
        this.b = axjhVar;
        this.p = btvoVar;
        this.k = absgVar;
        this.q = advxVar;
        this.r = advzVar;
        this.s = advvVar;
        this.t = adxuVar;
        this.u = adxzVar;
        this.v = adwbVar;
        this.w = adwjVar;
    }

    public final void a(awwb awwbVar) {
        long b = awwbVar.b(awvv.J);
        if (b == -1 || b != ((advh) this.g.b).c) {
            for (cqix<advs> cqixVar : this.c) {
                cqixVar.b().D();
            }
            this.c.clear();
            this.e.clear();
            this.z = 0;
            this.h = false;
            this.d.clear();
            this.f = dqac.d.bZ();
            advg advgVar = this.g;
            if (advgVar.c) {
                advgVar.bF();
                advgVar.c = false;
            }
            advh advhVar = (advh) advgVar.b;
            advh advhVar2 = advh.h;
            advhVar.a &= -5;
            advhVar.d = advh.h.d;
            if (advgVar.c) {
                advgVar.bF();
                advgVar.c = false;
            }
            advh advhVar3 = (advh) advgVar.b;
            advhVar3.a &= -2;
            advhVar3.b = advh.h.b;
            if (advgVar.c) {
                advgVar.bF();
                advgVar.c = false;
            }
            advh advhVar4 = (advh) advgVar.b;
            advhVar4.a &= -3;
            advhVar4.c = 0L;
            advg advgVar2 = this.g;
            if (advgVar2.c) {
                advgVar2.bF();
                advgVar2.c = false;
            }
            advh advhVar5 = (advh) advgVar2.b;
            advhVar5.a |= 2;
            advhVar5.c = b;
            if (awwbVar.c(awvv.J).b()) {
                return;
            }
            dvhg dvhgVar = (dvhg) awwbVar.a(awvv.J).f();
            if (dvhgVar == null || dvhgVar.c.size() == 0) {
                c(dcdc.e(), null, false);
                return;
            }
            if (this.b.e() && this.b.j() && (dvhgVar.a & 2) != 0) {
                if (awwbVar.c(awvv.J) == awwa.DATA_COMPLETE_FROM_SERVER || this.p.getPeopleFollowParameters().h) {
                    axjh axjhVar = this.b;
                    dqac dqacVar = dvhgVar.d;
                    if (dqacVar == null) {
                        dqacVar = dqac.d;
                    }
                    axjhVar.B(dqacVar);
                } else {
                    axjh axjhVar2 = this.b;
                    dqac dqacVar2 = dvhgVar.d;
                    if (dqacVar2 == null) {
                        dqacVar2 = dqac.d;
                    }
                    axjhVar2.C(dqacVar2);
                }
                dqac dqacVar3 = dvhgVar.d;
                if (dqacVar3 == null) {
                    dqacVar3 = dqac.d;
                }
                f(dqacVar3);
            }
            if (awwbVar.d() != null) {
                advg advgVar3 = this.g;
                String d = awwbVar.d();
                dbsk.s(d);
                if (advgVar3.c) {
                    advgVar3.bF();
                    advgVar3.c = false;
                }
                advh advhVar6 = (advh) advgVar3.b;
                d.getClass();
                advhVar6.a |= 1;
                advhVar6.b = d;
            }
            dvhf dvhfVar = dvhgVar.c.get(0);
            c(dvhfVar.a, dvhfVar.c, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(btlu btluVar) {
        advh advhVar = (advh) this.g.b;
        String str = (advhVar.a & 1) != 0 ? advhVar.b : null;
        if (btlu.i(btluVar) != btlt.GOOGLE) {
            return dbsj.d(str) || dbsd.a(btlu.h(this.l.j()), str);
        }
        return dbsd.a(str, btlu.h(btluVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0796  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List<defpackage.dlcv> r45, defpackage.dspd r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adyv.c(java.util.List, dspd, boolean):void");
    }

    public final void d(boolean z) {
        dirb dirbVar;
        if (!this.h) {
            if (!z || (dirbVar = this.x) == null) {
                dira diraVar = (dira) dirb.l.bZ();
                advh advhVar = (advh) this.g.b;
                if ((advhVar.a & 4) != 0) {
                    dspd dspdVar = advhVar.d;
                    if (diraVar.c) {
                        diraVar.bF();
                        diraVar.c = false;
                    }
                    dirb dirbVar2 = (dirb) diraVar.b;
                    dspdVar.getClass();
                    dirbVar2.a |= 4;
                    dirbVar2.d = dspdVar;
                }
                dnqg bZ = dnqh.p.bZ();
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.l = dnmuVar.ap;
                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                if (diraVar.c) {
                    diraVar.bF();
                    diraVar.c = false;
                }
                dirb dirbVar3 = (dirb) diraVar.b;
                dnqh bK = bZ.bK();
                bK.getClass();
                dirbVar3.b = bK;
                dirbVar3.a |= 1;
                int i = this.j.a.getPassiveAssistParameters().a().S;
                if (diraVar.c) {
                    diraVar.bF();
                    diraVar.c = false;
                }
                dirb dirbVar4 = (dirb) diraVar.b;
                dirbVar4.a |= 256;
                dirbVar4.i = i;
                dhjx aa = this.m.aa();
                if (diraVar.c) {
                    diraVar.bF();
                    diraVar.c = false;
                }
                dirb dirbVar5 = (dirb) diraVar.b;
                aa.getClass();
                dirbVar5.c = aa;
                dirbVar5.a |= 2;
                dirb dirbVar6 = (dirb) diraVar.b;
                dirbVar6.k = 2;
                dirbVar6.a |= 2048;
                dirbVar = (dirb) diraVar.bK();
            }
            this.x = dirbVar;
            btlu j = this.l.j();
            if (!b(j)) {
                return;
            }
            agak b = agak.b(this.n.e(j));
            final z zVar = new z();
            this.h = true;
            bvqj.e(this.o.a(dirbVar, j, b, null), new bvqg(zVar) { // from class: adyq
                private final z a;

                {
                    this.a = zVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.f((afzy) obj);
                }
            }, dege.a);
            zVar.b(this.i, new aa(this) { // from class: adyr
                private final adyv a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    adyv adyvVar = this.a;
                    afzy afzyVar = (afzy) obj;
                    adyvVar.h = false;
                    if (afzyVar == null || adyvVar.b(afzyVar.b().c)) {
                        cqkp cqkpVar = null;
                        if (afzyVar == null) {
                            adyvVar.c(dcdc.e(), null, true);
                        } else {
                            dird a = afzyVar.a();
                            if (adyvVar.b.j() && (a.a & 32) != 0) {
                                axjh axjhVar = adyvVar.b;
                                dqac dqacVar = a.h;
                                if (dqacVar == null) {
                                    dqacVar = dqac.d;
                                }
                                axjhVar.C(dqacVar);
                                dqac dqacVar2 = a.h;
                                if (dqacVar2 == null) {
                                    dqacVar2 = dqac.d;
                                }
                                adyvVar.f(dqacVar2);
                            }
                            adyvVar.c(a.d, a.e, false);
                        }
                        View findViewById = adyvVar.a.findViewById(R.id.scrollable_card_stream_container);
                        if (findViewById != null) {
                            cqkpVar = cqkx.i(findViewById);
                        }
                        if (cqkpVar == null) {
                            return;
                        }
                        cqkx.p(cqkpVar);
                    }
                }
            });
        }
    }

    public final void e() {
        cqix<advs> cqixVar = this.y;
        if (cqixVar != null) {
            ((advs) ((cqgu) cqixVar).a).D();
            this.c.remove(this.y);
            this.y = null;
        }
    }

    public final void f(dqac dqacVar) {
        dqab dqabVar = this.f;
        dsrj<dqau> dsrjVar = dqacVar.b;
        if (dqabVar.c) {
            dqabVar.bF();
            dqabVar.c = false;
        }
        dqac dqacVar2 = (dqac) dqabVar.b;
        dsrj<dqau> dsrjVar2 = dqacVar2.b;
        if (!dsrjVar2.a()) {
            dqacVar2.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dqacVar2.b);
        if ((dqacVar.a & 1) != 0) {
            dqab dqabVar2 = this.f;
            dqas dqasVar = dqacVar.c;
            if (dqasVar == null) {
                dqasVar = dqas.c;
            }
            if (dqabVar2.c) {
                dqabVar2.bF();
                dqabVar2.c = false;
            }
            dqac dqacVar3 = (dqac) dqabVar2.b;
            dqasVar.getClass();
            dqacVar3.c = dqasVar;
            dqacVar3.a |= 1;
        }
    }
}
