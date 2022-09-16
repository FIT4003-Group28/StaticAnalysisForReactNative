package defpackage;

import defpackage.dssj;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anku  reason: default package */
/* loaded from: classes2.dex */
public final class anku<Request extends dssj, Response extends dssj, Metadata> {
    public static final dcqe a = dcqe.c("anku");
    public final List<anks<Request, Response, Metadata>> b = new ArrayList();
    public final Queue<ankt> c = new ConcurrentLinkedDeque();
    public dbsg<ankt> d = dbpy.a;
    private final btzp<Request, Response> e;
    private final bvrj f;
    private final anjx g;

    public anku(btzp btzpVar, anjx anjxVar, bvrj bvrjVar) {
        this.e = btzpVar;
        this.g = anjxVar;
        this.f = bvrjVar;
    }

    private final void d(Request request, dbsg<anks<Request, Response, Metadata>> dbsgVar) {
        anjx anjxVar = this.g;
        dsqw dsqwVar = (dsqw) request;
        dsqp dsqpVar = (dsqp) dsqwVar.cu(5);
        dsqpVar.bC(dsqwVar);
        duyb duybVar = (duyb) dsqpVar;
        dnwb a2 = anjxVar.a.a();
        if (duybVar.c) {
            duybVar.bF();
            duybVar.c = false;
        }
        duyc duycVar = (duyc) duybVar.b;
        duyc duycVar2 = duyc.h;
        a2.getClass();
        duycVar.e = a2;
        duycVar.a |= 4;
        duyc bK = duybVar.bK();
        this.e.a(bK, new ankr(this, bK, dbsgVar), this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(anks<Request, Response, Metadata> anksVar) {
        this.b.add(anksVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(Request request, Metadata metadata, dbsg<anks<Request, Response, Metadata>> dbsgVar) {
        for (anks<Request, Response, Metadata> anksVar : this.b) {
            anksVar.d(metadata);
        }
        ((anks) ((dbsu) dbsgVar).a).d(metadata);
        if (!this.d.a()) {
            this.d = dbsg.i(new ankt(request, dbsgVar));
            d(request, dbsgVar);
            return;
        }
        this.c.add(new ankt(request, dbsgVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c() {
        dbsg<ankt> j = dbsg.j(this.c.poll());
        this.d = j;
        if (j.a()) {
            d(this.d.b().a, this.d.b().b);
        }
    }
}
