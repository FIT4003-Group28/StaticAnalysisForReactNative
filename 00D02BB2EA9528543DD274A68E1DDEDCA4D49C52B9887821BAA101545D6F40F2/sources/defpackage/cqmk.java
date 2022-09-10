package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmk  reason: default package */
/* loaded from: classes.dex */
public final class cqmk<T extends cqkp> extends cqmj<T> {
    public final cqmj<T> a;
    @dzsi
    final cqmm<?, T> b;
    private final boolean f;

    public cqmk(cqmj<T> cqmjVar, boolean z, @dzsi cqmm<?, T> cqmmVar, cqmp<T>[] cqmpVarArr) {
        super(cqmpVarArr);
        this.a = cqmjVar;
        this.f = z;
        this.b = cqmmVar;
    }

    @Override // defpackage.cqmj
    public final View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        cqic cqicVar = new cqic(cqkdVar.a(num, viewGroup), null);
        cqkdVar.d(viewGroup, cqicVar, z);
        cqicVar.setStubbedViewNode(this.a, this.f, this.b);
        return cqicVar;
    }

    @Override // defpackage.cqmj
    protected final cqjg d() {
        return this.a.c();
    }
}
