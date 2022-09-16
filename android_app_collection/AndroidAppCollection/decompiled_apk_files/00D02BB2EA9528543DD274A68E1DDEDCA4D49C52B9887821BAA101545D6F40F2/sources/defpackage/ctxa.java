package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctxa  reason: default package */
/* loaded from: classes5.dex */
public final class ctxa implements ctxf<dxtd, dxtf, ctga, dxta> {
    private final ctyy a;
    private final dxnc b;
    private final dxsy c;
    private final List<dxpi> d;

    public ctxa(ctyy ctyyVar, ContactId contactId, cuih cuihVar, List<Integer> list) {
        dxpi dxpiVar;
        this.a = ctyyVar;
        this.b = ctus.a(contactId);
        dxsx bZ = dxsy.b.bZ();
        boolean a = cuihVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxsy) bZ.b).a = a;
        this.c = bZ.bK();
        this.d = new ArrayList();
        for (Integer num : list) {
            int intValue = num.intValue();
            List<dxpi> list2 = this.d;
            if (intValue == 1) {
                dxpiVar = dxpi.READ_RECEIPT_OPT_IN;
            } else {
                dxpiVar = dxpi.UNKNOWN;
            }
            list2.add(dxpiVar);
        }
    }

    @Override // defpackage.ctxf
    public final dehn<dxtd> a(dxwi dxwiVar) {
        dxtc bZ = dxtd.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxtd dxtdVar = (dxtd) bZ.b;
        dxwiVar.getClass();
        dxtdVar.a = dxwiVar;
        dxnc dxncVar = this.b;
        dxncVar.getClass();
        dxtdVar.b = dxncVar;
        dxsy dxsyVar = this.c;
        dxsyVar.getClass();
        dxtdVar.c = dxsyVar;
        List<dxpi> list = this.d;
        dxtd dxtdVar2 = (dxtd) bZ.b;
        dsrf dsrfVar = dxtdVar2.d;
        if (!dsrfVar.a()) {
            dxtdVar2.d = dsqw.cg(dsrfVar);
        }
        for (dxpi dxpiVar : list) {
            dxtdVar2.d.h(dxpiVar.a());
        }
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(48);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctga ctgaVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.a.b().e());
        r.o(this.a.c().J());
        r.p(uuid.toString());
        r.j(48);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctga d(dxtf dxtfVar) {
        ctfa ctfaVar = new ctfa();
        dxsy dxsyVar = dxtfVar.a;
        if (dxsyVar == null) {
            dxsyVar = dxsy.b;
        }
        cuih a = ctut.a(dxsyVar);
        if (a != null) {
            ctfaVar.a = a;
            String str = ctfaVar.a == null ? " userProperties" : "";
            if (str.isEmpty()) {
                return new ctfb(ctfaVar.a);
            }
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null userProperties");
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dxtf> e(dehn<dxta> dehnVar, dxtd dxtdVar) {
        final dxtd dxtdVar2 = dxtdVar;
        return deew.g(dehnVar, new defg(dxtdVar2) { // from class: ctwz
            private final dxtd a;

            {
                this.a = dxtdVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dxtd dxtdVar3 = this.a;
                dxta dxtaVar = (dxta) obj;
                dyeu dyeuVar = dxtaVar.a;
                dyib<dxtd, dxtf> dyibVar = dxtb.a;
                if (dyibVar == null) {
                    synchronized (dxtb.class) {
                        dyibVar = dxtb.a;
                        if (dyibVar == null) {
                            dyhx c = dyib.c();
                            c.c = dyhz.UNARY;
                            c.d = dyib.b("google.internal.communications.instantmessaging.v1.LighterUserPropertiesService", "SetUserProperties");
                            c.e = true;
                            c.a = dyyq.b(dxtd.e);
                            c.b = dyyq.b(dxtf.b);
                            dyibVar = c.a();
                            dxtb.a = dyibVar;
                        }
                    }
                }
                return dyzf.d(dyeuVar.a(dyibVar, dxtaVar.b), dxtdVar3);
            }
        }, dege.a);
    }
}
