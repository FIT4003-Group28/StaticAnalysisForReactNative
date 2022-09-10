package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: cttz  reason: default package */
/* loaded from: classes5.dex */
public final class cttz implements cted {
    public final ctss a;
    public final Context b;
    public final ctog c;
    public final csvf d;
    public final cttm<ctfy> e = new cttm<>();
    public final Map<String, ctuk> f;

    public cttz(ctss ctssVar, Context context, Map<String, ctuk> map) {
        this.a = ctssVar;
        this.b = context;
        this.c = ctog.a(context);
        this.d = csvf.a(context);
        this.f = map;
    }

    public static dxnc d(ConversationId conversationId) {
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            return ctus.a(conversationId.e());
        }
        dxnb bZ = dxnc.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxnc) bZ.b).a = dxov.a(6);
        String a = conversationId.d().a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((dxnc) bZ.b).b = a;
        String b = conversationId.d().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxnc) bZ.b).d = b;
        return bZ.bK();
    }

    public static dxpr e(String str) {
        return (dxpr) dsqw.cr(dxpr.f, Base64.decode(str, 8), dsqa.c());
    }

    @Override // defpackage.cted
    public final dehn<Void> a(ctyy ctyyVar, ConversationId conversationId, List<String> list, ctmn ctmnVar) {
        return c(ctyyVar, conversationId, list, ctmnVar, false);
    }

    @Override // defpackage.cted
    public final dbsg<cufp> b(ctyy ctyyVar, String str) {
        try {
            dxpr e = e(str);
            dxnc dxncVar = e.a;
            if (dxncVar == null) {
                dxncVar = dxnc.e;
            }
            cufq f = ConversationId.f();
            f.c(ctyyVar.b().e());
            int b = dxov.b(dxncVar.a);
            boolean z = true;
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            boolean z2 = false;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return dbpy.a;
                    }
                    cufr c = ConversationId.GroupId.c();
                    c.c(dxncVar.b);
                    c.b(dxncVar.d);
                    f.d(c.a());
                    cufo o = cufp.o();
                    o.e(f.a());
                    o.f(-1L);
                    o.b(dcjz.s(Collections.unmodifiableMap(e.b), ctts.a));
                    o.c(z2);
                    return dbsg.i(o.a());
                }
                z = false;
            }
            f.e(ctus.c(dxncVar));
            z2 = z;
            cufo o2 = cufp.o();
            o2.e(f.a());
            o2.f(-1L);
            o2.b(dcjz.s(Collections.unmodifiableMap(e.b), ctts.a));
            o2.c(z2);
            return dbsg.i(o2.a());
        } catch (dsrm | IllegalArgumentException unused) {
            cstl.a("TyMsgClient");
            return dbpy.a;
        }
    }

    public final dehn<Void> c(ctyy ctyyVar, ConversationId conversationId, List<String> list, ctmn ctmnVar, boolean z) {
        if (list.size() <= 0) {
            return deha.a(null);
        }
        ctwi ctwiVar = new ctwi(this.b, ctyyVar, conversationId, list, d(conversationId), z);
        ctog ctogVar = this.c;
        ctxm r = ctxn.r();
        r.g(18);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(ctwiVar.a);
        r.d(conversationId);
        ctogVar.b(r.a());
        dehn<Void> a = this.a.a(UUID.randomUUID(), ctwiVar, this.a.d.d(), ctyyVar, ctmnVar, true);
        deha.q(a, new cttv(this, ctyyVar, ctwiVar, conversationId), dege.a);
        return a;
    }
}
