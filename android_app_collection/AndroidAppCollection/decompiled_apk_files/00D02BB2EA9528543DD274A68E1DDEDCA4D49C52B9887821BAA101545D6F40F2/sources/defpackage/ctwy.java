package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwy  reason: default package */
/* loaded from: classes5.dex */
public final class ctwy implements ctxf<dszm, dszo, ctfy, dxpk> {
    private final Context a;
    private final ctyy b;
    private final cugu c;
    private final dxnc d;
    private final Map<String, ctuk> e;

    public ctwy(Context context, ctyy ctyyVar, cugu cuguVar, dxnc dxncVar, Map<String, ctuk> map) {
        this.a = context;
        this.b = ctyyVar;
        this.c = cuguVar;
        this.d = dxncVar;
        this.e = map;
    }

    @Override // defpackage.ctxf
    public final dehn<dszm> a(dxwi dxwiVar) {
        dszl bZ = dszm.e.bZ();
        dxnc dxncVar = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszm dszmVar = (dszm) bZ.b;
        dxncVar.getClass();
        dszmVar.b = dxncVar;
        dxwiVar.getClass();
        dszmVar.a = dxwiVar;
        dxqi j = ctuv.j(this.c, this.e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        j.getClass();
        ((dszm) bZ.b).c = j;
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
        ((dszm) bZ.b).d = bK;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(this.c.a());
        r.d(this.c.c());
        r.j(12);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, ctfy ctfyVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(this.c.a());
        r.d(this.c.c());
        r.j(12);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ ctfy d(dszo dszoVar) {
        ctey cteyVar = new ctey();
        cteyVar.b = 1;
        cteyVar.a = dbsg.i(Long.valueOf(dszoVar.a));
        cteyVar.b = 2;
        return new ctez(cteyVar.b, cteyVar.a);
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dszo> e(dehn<dxpk> dehnVar, dszm dszmVar) {
        final dszm dszmVar2 = dszmVar;
        return deew.g(dehnVar, new defg(dszmVar2) { // from class: ctwx
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
