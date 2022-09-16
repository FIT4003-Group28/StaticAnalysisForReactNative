package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: crjo  reason: default package */
/* loaded from: classes5.dex */
public final class crjo {
    public final amvh a;
    @dzsi
    public final dpfh b;
    public final cqat c;
    public final dcdc<cqzw> d;
    public final cqzw e;
    public amsx f = amsx.a(-1.0d).a();
    public int g = -1;
    public long h;

    public crjo(amvh amvhVar, @dzsi dpfh dpfhVar, cqat cqatVar, dcdc<cqzw> dcdcVar, cqzw cqzwVar) {
        dbsk.t(amvhVar, "destination");
        this.a = amvhVar;
        this.b = dpfhVar;
        this.c = cqatVar;
        dbsk.t(dcdcVar, "guiders");
        this.d = dcdcVar;
        dbsk.t(cqzwVar, "currentGuider");
        this.e = cqzwVar;
        dbsk.a(!dcdcVar.isEmpty());
        dbsk.a(dcdcVar.contains(cqzwVar));
    }

    public final amuh a() {
        ArrayList arrayList = new ArrayList(this.d.size());
        dcdc<cqzw> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(dcdcVar.get(i).g);
        }
        return amuh.f(this.d.indexOf(this.e), arrayList);
    }

    public final crqg b() {
        cray n = this.e.n();
        long e = this.c.e() - this.h;
        if ((n.a() == -1 || n.g == -1) && this.f.d() != -1.0d && this.g != -1 && e < 150000) {
            crax craxVar = new crax(n);
            craxVar.i = this.f;
            craxVar.h = this.g;
            n = craxVar.a();
        }
        return new crqg(this.a, n);
    }
}
