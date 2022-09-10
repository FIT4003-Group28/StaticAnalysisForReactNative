package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cprs  reason: default package */
/* loaded from: classes5.dex */
public final class cprs<D> implements cprx<D> {
    private final List<D> a;

    public cprs(List<D> list) {
        this.a = cpwi.c(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [cprg<D>, cprg] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cpso, cpso<D>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cpso] */
    /* JADX WARN: Type inference failed for: r7v2, types: [cpsk] */
    @Override // defpackage.cprx
    public final List<cprt<D>> b(List<D> list, cpsf<D> cpsfVar, int i, cppz cppzVar, cpru<D> cpruVar, cprg<D> cprgVar, cpso<D> cpsoVar, boolean z) {
        List<String> a = cpruVar.a(this.a);
        if (z) {
            cpsoVar = cpsoVar.o();
            for (D d : this.a) {
                cpsoVar.m(d);
            }
        }
        return cprgVar.h(this.a, a, i, cpsoVar).b;
    }
}
