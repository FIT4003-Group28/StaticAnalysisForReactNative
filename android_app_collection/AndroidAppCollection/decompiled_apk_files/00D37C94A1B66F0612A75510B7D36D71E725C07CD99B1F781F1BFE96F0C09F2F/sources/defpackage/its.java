package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: its  reason: default package */
/* loaded from: classes3.dex */
public final class its implements ith, ynl {
    public final aawv a;
    public final etd b;
    public final Resources c;
    public final egu d;
    public final afvn e;
    public final ayor g;
    public final ydq h;
    public final boolean i;
    public ayoi j;
    public final aacz k;
    private final yni l;
    private final azqb n;
    private final GuideControllerImpl$WatchWhileLifecycleObserver o;
    private final efz p;
    private final azpx m = azpq.e().aO();
    public final azpx f = azpq.e().aO();

    public its(aawv aawvVar, yni yniVar, ayor ayorVar, etd etdVar, Resources resources, afvn afvnVar, egu eguVar, aacz aaczVar, ydq ydqVar, azqb azqbVar, GuideControllerImpl$WatchWhileLifecycleObserver guideControllerImpl$WatchWhileLifecycleObserver, efz efzVar, axxf axxfVar) {
        Boolean bool;
        aawvVar.getClass();
        this.a = aawvVar;
        this.l = yniVar;
        etdVar.getClass();
        this.b = etdVar;
        this.c = resources;
        this.d = eguVar;
        this.e = afvnVar;
        this.g = ayorVar;
        this.k = aaczVar;
        this.h = ydqVar;
        this.n = azqbVar;
        this.o = guideControllerImpl$WatchWhileLifecycleObserver;
        this.p = efzVar;
        aqxe aqxeVar = axxfVar.a.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45355325L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45355325L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45355325L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        this.i = booleanValue;
        if (!booleanValue) {
            this.j = d();
        }
    }

    public static atxn c(String str, String str2, arhr arhrVar) {
        aopa createBuilder = atxn.a.createBuilder();
        aopa createBuilder2 = atxk.a.createBuilder();
        createBuilder2.copyOnWrite();
        atxk atxkVar = (atxk) createBuilder2.instance;
        atxkVar.b |= 1;
        atxkVar.c = str;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = BrowseEndpointOuterClass.browseEndpoint;
        aopa createBuilder3 = apnv.a.createBuilder();
        createBuilder3.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder3.instance;
        apnvVar.b |= 1;
        apnvVar.c = str;
        aopcVar.e(aopgVar, (apnv) createBuilder3.mo39build());
        createBuilder2.copyOnWrite();
        atxk atxkVar2 = (atxk) createBuilder2.instance;
        apzg apzgVar = (apzg) aopcVar.mo39build();
        apzgVar.getClass();
        atxkVar2.e = apzgVar;
        atxkVar2.b |= 4;
        aopc aopcVar2 = (aopc) arhs.a.createBuilder();
        aopcVar2.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar2.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        createBuilder2.copyOnWrite();
        atxk atxkVar3 = (atxk) createBuilder2.instance;
        arhs arhsVar2 = (arhs) aopcVar2.mo39build();
        arhsVar2.getClass();
        atxkVar3.g = arhsVar2;
        atxkVar3.b |= 64;
        arag g = ajgl.g(str2);
        createBuilder2.copyOnWrite();
        atxk atxkVar4 = (atxk) createBuilder2.instance;
        g.getClass();
        atxkVar4.f = g;
        atxkVar4.b |= 16;
        createBuilder.copyOnWrite();
        atxn atxnVar = (atxn) createBuilder.instance;
        atxk atxkVar5 = (atxk) createBuilder2.mo39build();
        atxkVar5.getClass();
        atxnVar.c = atxkVar5;
        atxnVar.b = 117501096;
        return (atxn) createBuilder.mo39build();
    }

    @Override // defpackage.itg
    public final ayoi a() {
        ayoi ayoiVar = this.j;
        ayoiVar.getClass();
        return ayoiVar.R();
    }

    @Override // defpackage.ith
    public final ayoc b() {
        ayos e = e();
        this.m.c(e);
        return e.j().z();
    }

    public final ayoi d() {
        ayoi R;
        aynr b = this.p.b();
        GuideControllerImpl$WatchWhileLifecycleObserver guideControllerImpl$WatchWhileLifecycleObserver = this.o;
        azqb azqbVar = this.n;
        aveq aveqVar = this.k.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        apgx apgxVar = aveqVar.g;
        if (apgxVar == null) {
            apgxVar = apgx.a;
        }
        int b2 = aphq.b(apgxVar.k);
        if (b2 == 0 || b2 == 1) {
            R = guideControllerImpl$WatchWhileLifecycleObserver.a.R();
        } else {
            R = ((aabw) azqbVar.get()).a().E(inl.r).k();
        }
        ehr ehrVar = (ehr) this.d;
        ayoi aD = ayoi.N(R, ayoi.m(ehrVar.c, ehrVar.d, eho.l).B().I(ikb.s).V(inl.m), this.f.R(), ayoi.w(new ayoj() { // from class: itk
            @Override // defpackage.ayoj
            public final void a(azeh azehVar) {
                final its itsVar = its.this;
                final itr itrVar = new itr(azehVar);
                itsVar.h.d(itrVar);
                ayqi.f(azehVar, banl.n(new aypv() { // from class: itn
                    @Override // defpackage.aypv
                    public final void a() {
                        its itsVar2 = its.this;
                        itsVar2.h.e(itrVar);
                    }
                }));
            }
        }).aa()).aD(ayrb.a, 4);
        if (this.i) {
            aD = ayoi.m(aD, b.P(zhx.a).k(), eho.k).aa();
        }
        ayoi V = aD.V(new ayqe() { // from class: itj
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                zhx zhxVar = (zhx) obj;
                return its.this.e();
            }
        });
        if (this.i) {
            V = V.aa();
        }
        ayoi W = ayoi.W(V, this.m);
        ayoi d = ayoc.u(new itl(this)).h(new ayog() { // from class: iti
            @Override // defpackage.ayog
            public final ayof a(ayoc ayocVar) {
                its itsVar = its.this;
                asxj asxjVar = itsVar.k.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                return asxjVar.bG ? ayocVar.F(itsVar.g) : ayocVar;
            }
        }).m(ick.d).z().r(ikb.r).w(inl.l).r(ikb.q).Q(ayos.A(new itl(this, 1))).k().v(W.u(inl.p).aE().e(0)).aE().d();
        ayoi L = W.L(inl.q);
        ayoi V2 = W.L(inl.n).V(inl.t);
        yni yniVar = this.l;
        yniVar.getClass();
        ayoi V3 = L.V(inl.j);
        yni yniVar2 = this.l;
        yniVar2.getClass();
        ayoi X = L.X(this.g);
        final etd etdVar = this.b;
        ayoi V4 = W.V(inl.o);
        yni yniVar3 = this.l;
        yniVar3.getClass();
        new aypf(V2.as(new itp(yniVar, 1)), V3.as(new itp(yniVar2)), X.as(new ayqb() { // from class: ito
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                etd etdVar2 = etd.this;
                aawr aawrVar = (aawr) obj;
                aawrVar.getClass();
                etdVar2.a().e(aawrVar);
            }
        }), V4.as(new itp(yniVar3, 2)));
        return d;
    }

    public final ayos e() {
        return ayos.n(new ayou() { // from class: itm
            @Override // defpackage.ayou
            public final void a(azkm azkmVar) {
                its itsVar = its.this;
                itq itqVar = new itq(azkmVar);
                AccountIdentity accountIdentity = itsVar.e.c() instanceof AccountIdentity ? (AccountIdentity) itsVar.e.c() : null;
                boolean z = vwr.c(accountIdentity) && accountIdentity.l() == 3;
                aawv aawvVar = itsVar.a;
                ehr ehrVar = (ehr) itsVar.d;
                aawu aawuVar = new aawu(aawvVar.e, aawvVar.a.c(), aawvVar.c, eog.B(ehrVar.b) && ((ehh) ehrVar.a.get()).j(), ((ehh) ((ehr) itsVar.d).a.get()).l(), z);
                aawuVar.q(2);
                itsVar.a.b.i(aawuVar, itqVar);
            }
        }).E(inl.k).l();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                vxm vxmVar = (vxm) obj;
                this.f.c(zhx.a);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{vxm.class};
    }
}
