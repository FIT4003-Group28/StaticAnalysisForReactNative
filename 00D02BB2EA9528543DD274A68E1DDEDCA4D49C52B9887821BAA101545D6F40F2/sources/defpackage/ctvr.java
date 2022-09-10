package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctvr  reason: default package */
/* loaded from: classes5.dex */
public final class ctvr implements ctxf<dszm, dszo, Void, dxpk> {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final ctyy c;
    private final ConversationId d;
    private final boolean e;
    private final boolean f;
    private final dxnc g;
    private final List<Long> h;
    private final String i;

    public ctvr(Context context, ctyy ctyyVar, ConversationId conversationId, String str, boolean z, boolean z2, dxnc dxncVar, List<Long> list) {
        this.b = context;
        this.c = ctyyVar;
        this.d = conversationId;
        this.i = str;
        this.e = z;
        this.f = z2;
        this.g = dxncVar;
        this.h = list;
    }

    @Override // defpackage.ctxf
    public final dehn<dszm> a(dxwi dxwiVar) {
        dxqi e;
        String str = this.i;
        if (str == null) {
            e = ctuv.e(this.a, this.d, ctuv.a, this.e, this.f);
        } else {
            e = ctuv.e(this.a, this.d, Base64.decode(str, 8), this.e, this.f);
        }
        dszl bZ = dszm.e.bZ();
        dxnc dxncVar = this.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszm dszmVar = (dszm) bZ.b;
        dxncVar.getClass();
        dszmVar.b = dxncVar;
        dxwiVar.getClass();
        dszmVar.a = dxwiVar;
        e.getClass();
        dszmVar.c = e;
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
        r.j(16);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.h(dcdc.r(this.h));
        r.e(j);
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
        r.j(16);
        r.f(1);
        r.h(dcdc.r(this.h));
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dszo dszoVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dszo> e(dehn<dxpk> dehnVar, dszm dszmVar) {
        final dszm dszmVar2 = dszmVar;
        return deew.g(dehnVar, new defg(dszmVar2) { // from class: ctvq
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
