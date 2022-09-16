package defpackage;

import java.util.AbstractList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxs  reason: default package */
/* loaded from: classes3.dex */
public final class cxs extends AbstractList {
    final List a;

    public cxs(cxd cxdVar, cvq... cvqVarArr) {
        cvx c = ((cvs) cxdVar.m).c();
        if (cxdVar.m.j(cxi.class).isEmpty()) {
            this.a = new axjo(cxdVar.n().a, c);
        } else {
            this.a = new axjq(cxdVar.n().a, c, cvqVarArr);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (axjg) this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
