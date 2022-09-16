package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: dfl  reason: default package */
/* loaded from: classes3.dex */
public final class dfl extends dfi {
    private final List a;
    private final dfh b;
    private final HashSet c = new HashSet();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private dem g;

    public dfl(List list) {
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.b = new dfk(this);
    }

    @Override // defpackage.dfg
    public final void b(ArrayList arrayList) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((dfg) this.a.get(i)).b(arrayList);
        }
    }

    @Override // defpackage.dfg
    public final void d() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.g = null;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            dfg dfgVar = (dfg) this.a.get(i);
            if (dfgVar.e()) {
                dfgVar.d();
            }
        }
    }

    @Override // defpackage.dfg
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.dfg
    public final void f(dem demVar) {
        if (!this.e) {
            this.e = true;
            this.g = demVar;
            if (!j()) {
                g();
                return;
            }
            i();
            this.f = true;
            for (dfg dfgVar : this.a) {
                dfgVar.a(this.b);
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ((dfg) this.a.get(i)).f(this.g);
            }
            this.a.size();
            return;
        }
        throw new RuntimeException("Starting binding multiple times");
    }

    public final void k(dfg dfgVar) {
        if (this.c.contains(dfgVar)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        this.c.add(dfgVar);
        this.d++;
        dfgVar.c(this.b);
        if (this.d < this.a.size()) {
            return;
        }
        this.f = false;
        h();
    }
}
