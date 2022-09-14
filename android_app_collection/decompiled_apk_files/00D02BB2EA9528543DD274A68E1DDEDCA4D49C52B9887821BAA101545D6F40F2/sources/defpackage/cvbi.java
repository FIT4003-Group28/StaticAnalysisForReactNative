package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cvbi  reason: default package */
/* loaded from: classes5.dex */
public final class cvbi implements cvav, cuwp, cusr {
    private static final cvau q = cvbb.a;
    public final csuk a;
    public final csuf b;
    public final ctyy c;
    public final cuwq<cvah> d;
    UUID h;
    private final csui i;
    private final csug j;
    private final dbsl<cufw> k;
    private final cvbp r;
    public cvau e = q;
    private cuss<Pair<dcdc<cufw>, Boolean>> l = null;
    private final Map<ConversationId, cvbh> m = new HashMap();
    private final Map<ContactId, cuss<cufj>> n = new HashMap();
    private int o = 0;
    private boolean p = false;
    public final AtomicInteger g = new AtomicInteger(0);
    public final Map<ContactId, cufj> f = new HashMap();

    public cvbi(cvbp cvbpVar, csui csuiVar, csuk csukVar, csug csugVar, csuf csufVar, ctyy ctyyVar, cvar cvarVar, dbsl dbslVar) {
        this.r = cvbpVar;
        this.i = csuiVar;
        this.a = csukVar;
        this.j = csugVar;
        this.b = csufVar;
        this.c = ctyyVar;
        this.k = cvbo.a(dbslVar);
        cvbpVar.setPresenter((Object) this);
        cvbpVar.setEmptyView(R.layout.configurable_curvular_layout_view);
        this.d = new cuwq<>(cvbpVar.a, this, new cvbm(this, cvarVar), 0);
        cuwq.c();
        deew.h(csuiVar.a(ctyyVar, 1), new dbrn(this) { // from class: cvaz
            private final cvbi a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cvbi cvbiVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    cvbiVar.a.n(cvbiVar.c);
                    return null;
                }
                return null;
            }
        }, dege.a);
    }

    private final void g() {
        cuss<Pair<dcdc<cufw>, Boolean>> cussVar;
        if (this.p || (cussVar = this.l) == null) {
            return;
        }
        cussVar.q(this);
        this.p = true;
    }

    private final void h() {
        cuss<Pair<dcdc<cufw>, Boolean>> cussVar;
        if (this.p && (cussVar = this.l) != null) {
            cussVar.g(this);
            this.p = false;
        }
        i();
    }

    private final void i() {
        for (cvbh cvbhVar : this.m.values()) {
            cvbhVar.b(null);
        }
    }

    @Override // defpackage.cuvu
    public final void A() {
        ctxp.a().c("ConversationListPresenter::start", this.h);
        this.r.a();
        this.d.A();
        h();
        this.a.r(new csux(this) { // from class: cvax
            private final cvbi a;

            {
                this.a = this;
            }

            @Override // defpackage.csux
            public final void L(int i) {
                this.a.c(i);
            }
        });
    }

    @Override // defpackage.cuvu
    public final void B() {
        deew.h(this.i.a(this.c, 1), new dbrn(this) { // from class: cvba
            private final cvbi a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cvbi cvbiVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    cvbiVar.a.p(cvbiVar.c);
                    return null;
                }
                return null;
            }
        }, dege.a);
    }

    @Override // defpackage.cusr
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cvbh cvbhVar;
        Pair pair = (Pair) obj;
        int i = 0;
        if (((dcdc) pair.first).isEmpty()) {
            cvbp cvbpVar = this.r;
            View view = cvbpVar.e;
            if (view != null) {
                view.setVisibility(0);
            } else {
                cvbpVar.e = cvbpVar.b.inflate();
            }
            cvbpVar.a.setVisibility(4);
        } else {
            cvbp cvbpVar2 = this.r;
            View view2 = cvbpVar2.e;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            cvbpVar2.a.setVisibility(0);
        }
        this.r.a();
        dcdc dcdcVar = (dcdc) pair.first;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        int incrementAndGet = this.g.incrementAndGet();
        i();
        if (dcdcVar.isEmpty()) {
            this.d.a(false, dcdc.e());
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(dcdcVar.size());
            AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[dcdcVar.size()];
            for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
                atomicBooleanArr[i2] = new AtomicBoolean(false);
            }
            dccx F = dcdc.F();
            int i3 = 0;
            while (i3 < dcdcVar.size()) {
                ConversationId a = ((cufw) dcdcVar.get(i3)).a();
                if (this.m.containsKey(a)) {
                    cvbhVar = this.m.get(a);
                } else {
                    cvbhVar = r3;
                    cvbh cvbhVar2 = new cvbh(this, a, this.a.u(this.c, a), this.a.e(this.c, a, 1, Integer.valueOf(i), cugt.f), ((ctct) this.a).H(this.c).aq(a), this.a.b(this.c, a));
                    this.m.put(a, cvbhVar);
                }
                cuzy cuzyVar = new cuzy();
                F.g(cuzyVar);
                dccx dccxVar = F;
                cvbhVar.b(new cvbd(this, incrementAndGet, cuzyVar, cvbhVar, atomicBooleanArr, i3, atomicInteger, booleanValue, dccxVar));
                i3++;
                dcdcVar = dcdcVar;
                F = dccxVar;
                atomicBooleanArr = atomicBooleanArr;
                i = 0;
            }
        }
        ctxp.a().c("ConversationListPresenter::start", this.h);
    }

    @Override // defpackage.cuwp
    public final void b() {
        this.o += 30;
        h();
        this.l = this.j.b(this.c, this.o, 1, this.k);
        g();
    }

    public final void c(int i) {
        if (i == 0 || i == 1) {
            this.r.d.a();
        } else if (i == 2) {
            this.r.b();
        } else if (i == 3) {
            this.r.b();
        } else if (i != 4) {
        } else {
            this.r.b();
        }
    }

    public final synchronized void d(ConversationId conversationId, Collection<cufj> collection) {
        cuss<cufj> c;
        for (cufj cufjVar : collection) {
            this.f.put(cufjVar.a(), cufjVar);
            if (!this.n.containsKey(cufjVar.a())) {
                ContactId a = cufjVar.a();
                if (conversationId.c() != ConversationId.IdType.ONE_TO_ONE || !conversationId.e().equals(a)) {
                    c = this.b.c(this.c, cufjVar.a());
                } else {
                    c = this.b.b(this.c, cufjVar.a());
                }
                this.n.put(cufjVar.a(), c);
                c.q(new cusr(this) { // from class: cvay
                    private final cvbi a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cusr
                    public final void a(Object obj) {
                        this.a.e((cufj) obj);
                    }
                });
            }
        }
    }

    public final synchronized void e(cufj cufjVar) {
        this.f.put(cufjVar.a(), cufjVar);
        for (cvbh cvbhVar : this.m.values()) {
            cusy<dcdc<cufj>> cusyVar = cvbhVar.f;
            if (cusyVar.h().a()) {
                HashSet hashSet = new HashSet();
                dcdc<cufj> b = cusyVar.h().b();
                int size = b.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    cufj cufjVar2 = b.get(i);
                    hashSet.add(cufjVar2.a());
                    if (cufjVar2.a().equals(cufjVar.a()) && !cufjVar2.equals(cufjVar)) {
                        z = true;
                    }
                }
                if (z) {
                    f(cusyVar, hashSet);
                }
            }
        }
    }

    public final void f(cusy<dcdc<cufj>> cusyVar, Set<ContactId> set) {
        dccx dccxVar = new dccx();
        for (ContactId contactId : set) {
            if (this.f.containsKey(contactId)) {
                dccxVar.g(this.f.get(contactId));
            }
        }
        cusyVar.a(dccxVar.f());
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.h = UUID.randomUUID();
        ctxp.a().b("ConversationListPresenter::start", this.h);
        this.r.c.setVisibility(0);
        this.d.z();
        g();
        this.a.q(new csux(this) { // from class: cvaw
            private final cvbi a;

            {
                this.a = this;
            }

            @Override // defpackage.csux
            public final void L(int i) {
                this.a.c(i);
            }
        });
    }
}
