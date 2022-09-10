package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwb  reason: default package */
/* loaded from: classes5.dex */
public final class ctwb implements ctxf<dszi, dszk, ctfh, dxpk> {
    private final Context a;
    private final ctyy b;
    private final dxnc c;
    private final dbsg<ContactId> d;
    private final dbsg<ConversationId> e;

    public ctwb(Context context, ctyy ctyyVar, ContactId contactId) {
        this.a = context;
        this.b = ctyyVar;
        this.c = ctus.a(contactId);
        this.d = dbsg.i(contactId);
        this.e = dbpy.a;
    }

    @Override // defpackage.ctxf
    public final dehn<dszi> a(dxwi dxwiVar) {
        dszh bZ = dszi.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszi dsziVar = (dszi) bZ.b;
        dxwiVar.getClass();
        dsziVar.a = dxwiVar;
        dxnc dxncVar = this.c;
        dxncVar.getClass();
        dsziVar.b = dxncVar;
        dxoa bZ2 = dxob.b.bZ();
        String a = cstk.a(this.a);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        a.getClass();
        ((dxob) bZ2.b).a = a;
        dxob bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK.getClass();
        ((dszi) bZ.b).c = bK;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        if (this.d.a()) {
            ctxm r = ctxn.r();
            r.g(10003);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(uuid.toString());
            r.c(this.d.b());
            r.j(9);
            r.m(Integer.valueOf(dyjbVar.p.r));
            r.f(i);
            r.e(j);
            ctogVar.b(r.a());
            return;
        }
        ctxm r2 = ctxn.r();
        r2.g(10003);
        r2.n(this.b.b().e());
        r2.o(this.b.c().J());
        r2.p(uuid.toString());
        r2.d(this.e.b());
        r2.m(Integer.valueOf(dyjbVar.p.r));
        r2.j(9);
        r2.f(i);
        r2.e(j);
        ctogVar.b(r2.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfh ctfhVar, ctog ctogVar, long j) {
        ctxm r;
        if (this.d.a()) {
            r = ctxn.r();
            r.g(10003);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(uuid.toString());
        } else {
            r = ctxn.r();
            r.g(10003);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(uuid.toString());
            r.d(this.e.b());
        }
        r.j(9);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfh d(dszk dszkVar) {
        dszk dszkVar2 = dszkVar;
        ctyy ctyyVar = this.b;
        Context context = this.a;
        dxnk dxnkVar = dszkVar2.b;
        if (dxnkVar == null) {
            dxnkVar = dxnk.j;
        }
        ctog a = ctog.a(this.a);
        dxwk dxwkVar = dszkVar2.a;
        if (dxwkVar == null) {
            dxwkVar = dxwk.b;
        }
        ctqu a2 = ctuw.a(ctyyVar, context, dxnkVar, a, dxwkVar.a);
        ctfg c = ctfh.c();
        ctei cteiVar = (ctei) c;
        cteiVar.b = 2;
        cteiVar.a = dbsg.i(a2);
        return c.a();
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dszk> e(dehn<dxpk> dehnVar, dszi dsziVar) {
        final dszi dsziVar2 = dsziVar;
        return deew.g(dehnVar, new defg(dsziVar2) { // from class: ctwa
            private final dszi a;

            {
                this.a = dsziVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dszi dsziVar3 = this.a;
                dxpk dxpkVar = (dxpk) obj;
                dyeu dyeuVar = dxpkVar.a;
                dyib<dszi, dszk> dyibVar = dxpl.b;
                if (dyibVar == null) {
                    synchronized (dxpl.class) {
                        dyibVar = dxpl.b;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetLighterProfile");
                            c.e = true;
                            c.a = dyyq.b(dszi.d);
                            c.b = dyyq.b(dszk.c);
                            dyibVar = c.a();
                            dxpl.b = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxpkVar.b), dsziVar3);
            }
        }, dege.a);
    }

    public ctwb(Context context, ctyy ctyyVar, ConversationId conversationId) {
        dxnc a;
        this.a = context;
        this.b = ctyyVar;
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            dxnb bZ = dxnc.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxnc) bZ.b).a = dxov.a(6);
            String b = conversationId.d().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            b.getClass();
            ((dxnc) bZ.b).d = b;
            String a2 = conversationId.d().a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            a2.getClass();
            ((dxnc) bZ.b).b = a2;
            a = bZ.bK();
        } else {
            a = ctus.a(conversationId.e());
        }
        this.c = a;
        this.e = dbsg.i(conversationId);
        this.d = dbpy.a;
    }
}
