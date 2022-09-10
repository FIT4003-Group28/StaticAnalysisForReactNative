package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axis  reason: default package */
/* loaded from: classes3.dex */
public final class axis {
    public final dxio<akfa> a;
    public final anhk b;
    public final bunn c;
    public final buyq d;
    public final butx e;
    public final bujn f;
    public final buwm g;
    public final buot h;
    public final buoq i;
    public final buqi j;
    private final Executor k;
    private final buwp l;

    public axis(bunn bunnVar, buyq buyqVar, butx butxVar, bujn bujnVar, buwp buwpVar, buwm buwmVar, buot buotVar, buoq buoqVar, buqi buqiVar, dxio<akfa> dxioVar, anhk anhkVar, Executor executor) {
        this.c = bunnVar;
        this.d = buyqVar;
        this.e = butxVar;
        this.f = bujnVar;
        this.l = buwpVar;
        this.g = buwmVar;
        this.h = buotVar;
        this.i = buoqVar;
        this.j = buqiVar;
        this.a = dxioVar;
        this.b = anhkVar;
        this.k = executor;
    }

    public final dehn<djoq> a(String str) {
        deig d = deig.d();
        djon djonVar = (djon) djoo.c.bZ();
        if (djonVar.c) {
            djonVar.bF();
            djonVar.c = false;
        }
        djoo djooVar = (djoo) djonVar.b;
        str.getClass();
        djooVar.a |= 4;
        djooVar.b = str;
        buac buacVar = ((buwq) this.l).c;
        btlu j = this.a.a().j();
        dbsk.s(j);
        buacVar.e = j;
        b(((buwq) this.l).b(), (djoo) djonVar.bK(), d, axik.a);
        return d;
    }

    public final <RequestT, ResponseT> void b(btzp<RequestT, ResponseT> btzpVar, RequestT requestt, deig<ResponseT> deigVar, dbrn<ResponseT, dnwb> dbrnVar) {
        btzpVar.b(requestt, new axiq(this, deigVar, dbrnVar), this.k);
    }
}
