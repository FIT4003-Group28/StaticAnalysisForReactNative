package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cprp  reason: default package */
/* loaded from: classes5.dex */
public final class cprp<D> implements cprx<D> {
    private final List<D> a = cpwi.a();

    @Override // defpackage.cprx
    public final List<cprt<D>> b(List<D> list, cpsf<D> cpsfVar, int i, cppz cppzVar, cpru<D> cpruVar, cprg<D> cprgVar, cpso<D> cpsoVar, boolean z) {
        Collection<? extends D> linkedHashSet;
        if (cpsoVar instanceof cpsp) {
            linkedHashSet = ((cpsp) cpsoVar).a.b;
        } else {
            linkedHashSet = new LinkedHashSet(list);
        }
        this.a.clear();
        this.a.addAll(linkedHashSet);
        return cprgVar.h(this.a, cpruVar.a(this.a), i, cpsoVar).b;
    }
}
