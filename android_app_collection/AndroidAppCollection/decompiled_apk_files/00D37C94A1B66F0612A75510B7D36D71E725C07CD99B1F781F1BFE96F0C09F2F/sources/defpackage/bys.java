package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bys  reason: default package */
/* loaded from: classes2.dex */
public final class bys implements byc, byt {
    public final boolean a;
    public final byy b;
    public final byy c;
    public final byy d;
    public final int e;
    private final List f = new ArrayList();

    public bys(cbd cbdVar, cbb cbbVar) {
        this.a = cbbVar.d;
        this.e = cbbVar.e;
        byy a = cbbVar.a.a();
        this.b = a;
        byy a2 = cbbVar.b.a();
        this.c = a2;
        byy a3 = cbbVar.c.a();
        this.d = a3;
        cbdVar.h(a);
        cbdVar.h(a2);
        cbdVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(byt bytVar) {
        this.f.add(bytVar);
    }

    @Override // defpackage.byt
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((byt) this.f.get(i)).d();
        }
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
    }

    @Override // defpackage.byc
    public final String g() {
        throw null;
    }
}
