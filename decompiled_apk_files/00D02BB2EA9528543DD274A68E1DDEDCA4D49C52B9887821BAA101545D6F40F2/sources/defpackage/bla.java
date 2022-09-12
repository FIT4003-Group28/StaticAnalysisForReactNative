package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bla  reason: default package */
/* loaded from: classes3.dex */
public final class bla implements bkk, blb {
    public final boolean a;
    public final blc<?, Float> b;
    public final blc<?, Float> c;
    public final blc<?, Float> d;
    public final int e;
    private final List<blb> f = new ArrayList();

    public bla(bnl bnlVar, bnj bnjVar) {
        this.a = bnjVar.d;
        this.e = bnjVar.e;
        blc<Float, Float> a = bnjVar.a.a();
        this.b = a;
        blc<Float, Float> a2 = bnjVar.b.a();
        this.c = a2;
        blc<Float, Float> a3 = bnjVar.c.a();
        this.d = a3;
        bnlVar.i(a);
        bnlVar.i(a2);
        bnlVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.blb
    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            this.f.get(i).a();
        }
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(blb blbVar) {
        this.f.add(blbVar);
    }

    @Override // defpackage.bkk
    public final String g() {
        throw null;
    }
}
