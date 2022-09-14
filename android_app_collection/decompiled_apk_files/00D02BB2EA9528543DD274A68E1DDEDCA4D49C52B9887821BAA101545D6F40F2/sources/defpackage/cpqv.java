package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cpqv  reason: default package */
/* loaded from: classes5.dex */
public final class cpqv<T, D> {
    final List<T> a;
    final int b;
    final cprd<D> c;
    final cpso<D> d;
    final cprd<Double> e;
    final cprd<Double> f;
    final cpso<Double> g;

    public cpqv(List<T> list, int i, cprd<D> cprdVar, cpso<D> cpsoVar, cprd<Double> cprdVar2, cprd<Double> cprdVar3, cpso<Double> cpsoVar2) {
        cpwl.h(list, "data");
        cpwl.h(cprdVar, "domains");
        cpwl.h(cpsoVar, "domainScale");
        cpwl.h(cprdVar2, "measures");
        cpwl.h(cprdVar3, "measureOffsets");
        cpwl.h(cpsoVar2, "measureScale");
        boolean z = true;
        cpwl.c(i <= list.size(), "Claiming to use more data than given.");
        cpwl.c(i == cprdVar.c, "domain size doesn't match data");
        cpwl.c(i == cprdVar2.c, "measures size doesn't match data");
        cpwl.c(i != cprdVar3.c ? false : z, "measureOffsets size doesn't match data");
        this.a = list;
        this.b = i;
        this.c = cprdVar;
        this.d = cpsoVar;
        this.e = cprdVar2;
        this.f = cprdVar3;
        this.g = cpsoVar2;
    }
}
