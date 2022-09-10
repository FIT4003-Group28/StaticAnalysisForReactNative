package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: boxb  reason: default package */
/* loaded from: classes3.dex */
public class boxb implements Serializable {
    public final boxe a;
    public final boxd b;
    public final dbsg<String> c;
    @dzsi
    public String d;
    public int e;
    private final bvrt<bpuk> f;
    private final bvrt<dnqe> g;
    @dzsi
    private final bvrt<ditt> h;

    public boxb(bpuk bpukVar, dnqe dnqeVar, @dzsi dodb dodbVar, @dzsi ditt dittVar) {
        this.f = bvrt.b(bpukVar);
        dbsk.a(!bpukVar.a.isEmpty());
        this.g = bvrt.b(dnqeVar);
        this.c = dodbVar == null ? dbpy.a : dbsg.i(dodbVar.b);
        this.h = bvrt.a(dittVar);
        this.a = new boxe();
        this.b = new boxd();
        this.e = 1;
    }

    public final bpuk a() {
        bpuk bpukVar = (bpuk) bvrt.f(this.f, (dssr) bpuk.c.cu(7), bpuk.c);
        dbsk.s(bpukVar);
        return bpukVar;
    }

    public final dnqe b() {
        dnqe dnqeVar = (dnqe) bvrt.f(this.g, (dssr) dnqe.i.cu(7), dnqe.i);
        dbsk.s(dnqeVar);
        return dnqeVar;
    }

    @dzsi
    public final ditt c() {
        return (ditt) bvrt.f(this.h, (dssr) ditt.n.cu(7), ditt.n);
    }
}
