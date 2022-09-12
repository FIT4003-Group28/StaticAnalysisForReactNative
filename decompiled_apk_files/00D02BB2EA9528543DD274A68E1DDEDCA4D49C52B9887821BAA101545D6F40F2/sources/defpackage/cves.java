package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cves  reason: default package */
/* loaded from: classes5.dex */
public final class cves implements cveg, cuwp, cvee {
    private final cusr<dcdc<ContactId>> A;
    private final dcdc<cvdu> B;
    private final Executor C;
    private cuss<dcdc<ContactId>> D;
    public final ConversationId a;
    public final ctyy b;
    public final csuk c;
    public final csuf d;
    public final cuwq<cved> e;
    public final cusr<cusv> f;
    public final cvdt h;
    public final cuvx i;
    public final cvfc j;
    public final dcdc<cvdv> k;
    public cuss<dcdc<cugu>> l;
    public cusw m;
    public boolean p;
    public dcdc<cugu> r;
    public boolean s;
    public cvef u;
    public final MessageListView v;
    public cuxq w;
    public cuxr x;
    public cuxt y;
    private final cusr<dcdc<cugu>> z;
    public final Map<ContactId, cuss<cufj>> g = new HashMap();
    public int n = 0;
    public boolean o = false;
    public boolean q = false;
    public final Map<ContactId, cufj> t = new HashMap();

    public cves(MessageListView messageListView, ConversationId conversationId, ctyy ctyyVar, csuk csukVar, csuf csufVar, csuy csuyVar, cvdt cvdtVar, dcdc dcdcVar, cuvx cuvxVar) {
        if (!ctyyVar.b().f().contains(conversationId.a())) {
            String a = conversationId.a().a();
            String a2 = ctyyVar.b().e().a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 81 + String.valueOf(a2).length());
            sb.append("Conversation owner (");
            sb.append(a);
            sb.append(") doesn't belong to the account context (primary: ");
            sb.append(a2);
            sb.append(") passed in");
            throw new IllegalArgumentException(sb.toString());
        }
        this.v = messageListView;
        this.a = conversationId;
        this.b = ctyyVar;
        this.c = csukVar;
        this.d = csufVar;
        this.h = cvdtVar;
        this.i = cuvxVar;
        this.z = new cusr(this) { // from class: cvei
            private final cves a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cves cvesVar = this.a;
                dcdc dcdcVar2 = (dcdc) obj;
                if (dcdcVar2.isEmpty()) {
                    ((cuzv) cvesVar.i).j(102);
                }
                cusw cuswVar = cvesVar.m;
                if (cuswVar != null) {
                    cuswVar.g(cvesVar.f);
                    cvesVar.m = null;
                }
                int size = dcdcVar2.size();
                for (int i = 0; i < size; i++) {
                    cugu cuguVar = (cugu) dcdcVar2.get(i);
                    if (!cvesVar.g.containsKey(cuguVar.b())) {
                        cvesVar.g.put(cuguVar.b(), cvesVar.d.b(cvesVar.b, cuguVar.b()));
                    }
                }
                cvesVar.m = cusw.e(cvesVar.g.values());
                cvesVar.m.q(cvesVar.f);
            }
        };
        this.f = new cusr(this) { // from class: cvej
            private final cves a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cves cvesVar = this.a;
                cusv cusvVar = (cusv) obj;
                if (cvesVar.m == null || !cvesVar.o || !cvesVar.l.h().a()) {
                    return;
                }
                cvesVar.r = cvesVar.l.h().b();
                if (cvesVar.p) {
                    cvesVar.c.h(cvesVar.b, cvesVar.a);
                }
                int size = cvesVar.r.size();
                int i = cvesVar.n;
                boolean z = size > i;
                cvesVar.s = z;
                if (z) {
                    cvesVar.r = cvesVar.r.subList(0, i);
                }
                for (cuss<cufj> cussVar : cvesVar.g.values()) {
                    cufj cufjVar = (cufj) cusvVar.a(cussVar);
                    if (cufjVar != null) {
                        cvesVar.t.put(cufjVar.a(), cufjVar);
                    }
                }
                cvesVar.a();
            }
        };
        this.A = new cusr(this) { // from class: cvek
            private final cves a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cves cvesVar = this.a;
                boolean z = cvesVar.q;
                boolean z2 = !((dcdc) obj).isEmpty();
                cvesVar.q = z2;
                if (z != z2) {
                    cvesVar.a();
                }
            }
        };
        messageListView.setPresenter((Object) this);
        this.D = csuyVar.a(conversationId);
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(((cvdw) dcdcVar.get(i)).a());
        }
        dcdc<cvdu> f = F.f();
        this.B = f;
        cvfc cvfcVar = new cvfc(cvdtVar, f, messageListView.V, new cvel(this), new cvef(this) { // from class: cvem
            private final cves a;

            {
                this.a = this;
            }

            @Override // defpackage.cvef
            public final void a(cugu cuguVar) {
                cvef cvefVar = this.a.u;
                if (cvefVar != null) {
                    ((cuxs) cvefVar).a.h(cuguVar);
                }
            }
        }, ctyyVar, conversationId, csufVar, csuyVar);
        this.j = cvfcVar;
        this.e = new cuwq<>(messageListView, this, cvfcVar, 1);
        this.C = dehx.b(cstj.b().a);
        dccx F2 = dcdc.F();
        int size2 = dcdcVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cvdw cvdwVar = (cvdw) dcdcVar.get(i2);
            if (cvdwVar.b().a()) {
                F2.g(cvdwVar.b().b());
            }
        }
        dcdc<cvdv> f2 = F2.f();
        this.k = f2;
        int size3 = f2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cvdv cvdvVar = f2.get(i3);
            cvdvVar.h(this);
            cvdvVar.i(this.c, this.a, this.b);
        }
    }

    private final void f() {
        cuss<dcdc<cugu>> cussVar;
        if (this.o || (cussVar = this.l) == null) {
            return;
        }
        cussVar.q(this.z);
        this.o = true;
    }

    private final void g() {
        cuss<dcdc<cugu>> cussVar;
        if (!this.o || (cussVar = this.l) == null) {
            return;
        }
        cussVar.g(this.z);
        cusw cuswVar = this.m;
        if (cuswVar != null) {
            cuswVar.g(this.f);
            this.m = null;
        }
        this.o = false;
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.p = false;
        this.e.A();
        g();
        this.D.g(this.A);
        this.v.setViewContentsChangedListener(null);
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvee
    public final void a() {
        dcdc<cugu> dcdcVar = this.r;
        if (dcdcVar == null) {
            return;
        }
        new cveb(dcdcVar, this.t, this.s, this.j.g, new cveo(this)).executeOnExecutor(this.C, new Void[0]);
    }

    @Override // defpackage.cuwp
    public final void b() {
        this.n += 30;
        g();
        this.l = this.c.e(this.b, this.a, Integer.valueOf(this.n + 1), 0, cugt.g);
        f();
    }

    @Override // defpackage.cvee
    public final void c(String str) {
        ((cuxb) this.y.a.c).a.setHintText(str);
    }

    @Override // defpackage.cveg
    public final void d(cvec cvecVar) {
        cvfc cvfcVar = this.j;
        if (cvfcVar.g.containsKey(cvecVar)) {
            cvfcVar.g.remove(cvecVar);
            cvfcVar.C();
        }
    }

    public final dcdc<cved> e(dcdc<cved> dcdcVar) {
        if (this.q) {
            dccx dccxVar = new dccx();
            dccxVar.g(cvdp.a);
            dccxVar.i(dcdcVar);
            return dccxVar.f();
        }
        return dcdcVar;
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.p = true;
        this.c.h(this.b, this.a);
        cuwq.c();
        this.e.z();
        f();
        this.D.q(this.A);
        this.v.setViewContentsChangedListener(new cuwv(this) { // from class: cven
            private final cves a;

            {
                this.a = this;
            }

            @Override // defpackage.cuwv
            public final void a() {
                cves cvesVar = this.a;
                final cuxq cuxqVar = cvesVar.w;
                if (cuxqVar != null) {
                    MessageListView messageListView = cvesVar.v;
                    cuxqVar.getClass();
                    messageListView.post(new Runnable(cuxqVar) { // from class: cveq
                        private final cuxq a;

                        {
                            this.a = cuxqVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cuzo cuzoVar = this.a.a;
                            cuzoVar.a.a();
                            cuzoVar.o().k(new cusr(cuzoVar) { // from class: cuyj
                                private final cuzo a;

                                {
                                    this.a = cuzoVar;
                                }

                                @Override // defpackage.cusr
                                public final void a(Object obj) {
                                    cuzo cuzoVar2 = this.a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        cuzoVar2.x.a();
                                    }
                                }
                            });
                        }
                    });
                }
            }
        });
    }
}
