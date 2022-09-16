package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: byap  reason: default package */
/* loaded from: classes4.dex */
public abstract class byap<Request extends dssj, Response extends dssj> {
    static final btys a;
    @dzsi
    public final String b;
    public final bvrb c;
    public final ckhe d;
    public Request e;
    private final dzsj<? extends btzo<Request, Response>> f;

    static {
        btyr bZ = btys.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar = (btys) bZ.b;
        btysVar.a |= 2;
        btysVar.c = 4;
        a = bZ.bK();
    }

    public byap(@dzsi String str, bvrb bvrbVar, dzsj<? extends btzo<Request, Response>> dzsjVar, Request request, ckhe ckheVar) {
        this.b = str;
        this.c = bvrbVar;
        this.f = dzsjVar;
        this.e = request;
        this.d = ckheVar;
    }

    @dzsi
    public abstract btys a();

    public abstract dmag b(Request request);

    public abstract Request c(Request request, dmaf dmafVar);

    public final dehn<Response> d() {
        deig d = deig.d();
        byaj byajVar = new byaj(d);
        btzo<Request, Response> a2 = this.f.a();
        buac a3 = a2.a();
        if ((b(this.e).a & 1) == 0) {
            btys a4 = a();
            if (a4 != null) {
                a3.c(a4);
            }
        } else {
            a3.c(a);
        }
        btyp bZ = btyq.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btyq btyqVar = (btyq) bZ.b;
        btyqVar.a |= 1;
        btyqVar.b = false;
        a3.a = bZ.bK();
        a2.b().a(this.e, byajVar, bvrj.UI_THREAD);
        return d;
    }
}
