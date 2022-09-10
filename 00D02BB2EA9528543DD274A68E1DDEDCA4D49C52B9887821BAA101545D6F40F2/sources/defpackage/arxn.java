package defpackage;

import defpackage.cqkp;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: arxn  reason: default package */
/* loaded from: classes2.dex */
public final class arxn<T extends cqkp> {
    private final bvjj a;

    public arxn(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    public final void a(dcdc<arxl<T>> dcdcVar, arxo<T> arxoVar) {
        arxp arxpVar = new arxp(this.a, dcdcVar, arxoVar);
        dccx F = dcdc.F();
        int i = 0;
        if (arxpVar.a.m(bvjk.jk, false)) {
            dcdc<arxl<T>> dcdcVar2 = arxpVar.b;
            int size = dcdcVar2.size();
            while (i < size) {
                F.g(dcdcVar2.get(i).b());
                i++;
            }
            arxpVar.c.a(F.f());
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(arxpVar.b.size());
        if (atomicInteger.get() == 0) {
            arxpVar.c.a(F.f());
            return;
        }
        dcdc<arxl<T>> dcdcVar3 = arxpVar.b;
        int size2 = dcdcVar3.size();
        while (i < size2) {
            arxl<T> arxlVar = dcdcVar3.get(i);
            arxlVar.c().a(new arxm(arxpVar, F, arxlVar, atomicInteger));
            i++;
        }
    }
}
