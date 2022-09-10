package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctww  reason: default package */
/* loaded from: classes5.dex */
public final class ctww implements ctxf<dszm, dszo, Void, dxpk> {
    public final String a;
    private final Context b;
    private final ctyy c;
    private final ConversationId d;
    private final dxnc e;
    private final dbsg<String> f;
    private final String g;

    public ctww(Context context, ctyy ctyyVar, ConversationId conversationId, dxnc dxncVar, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, String str) {
        this.b = context;
        this.c = ctyyVar;
        String uuid = UUID.randomUUID().toString();
        dbsgVar2.c(uuid);
        this.a = uuid;
        this.d = conversationId;
        this.e = dxncVar;
        this.f = dbsgVar;
        this.g = str;
    }

    @Override // defpackage.ctxf
    public final dehn<dszm> a(dxwi dxwiVar) {
        dszl bZ = dszm.e.bZ();
        dxnc dxncVar = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszm dszmVar = (dszm) bZ.b;
        dxncVar.getClass();
        dszmVar.b = dxncVar;
        dxwiVar.getClass();
        dszmVar.a = dxwiVar;
        dxqi f = ctuv.f(this.a, this.d, this.f, this.g);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        f.getClass();
        ((dszm) bZ.b).c = f;
        dxoa bZ2 = dxob.b.bZ();
        String a = cstk.a(this.b);
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
        ((dszm) bZ.b).d = bK;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.c.b().e());
        r.o(this.c.c().J());
        r.p(this.a);
        r.d(this.d);
        r.j(19);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        cuii h = cuil.h();
        h.b(this.f.c(""));
        r.r(h.a());
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, Void r2, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.c.b().e());
        r.o(this.c.c().J());
        r.p(this.a);
        r.d(this.d);
        r.j(19);
        r.f(1);
        r.e(j);
        cuii h = cuil.h();
        h.b(this.f.c(""));
        r.r(h.a());
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dszo dszoVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dszo> e(dehn<dxpk> dehnVar, dszm dszmVar) {
        final dszm dszmVar2 = dszmVar;
        return deew.g(dehnVar, new defg(dszmVar2) { // from class: ctwv
            private final dszm a;

            {
                this.a = dszmVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return ((dxpk) obj).b(this.a);
            }
        }, dege.a);
    }
}
