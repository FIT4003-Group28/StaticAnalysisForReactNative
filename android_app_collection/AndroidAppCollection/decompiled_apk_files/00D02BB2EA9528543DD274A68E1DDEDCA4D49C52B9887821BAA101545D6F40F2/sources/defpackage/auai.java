package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: auai  reason: default package */
/* loaded from: classes2.dex */
public class auai implements auak {
    @dzsi
    private final String a;
    private final String b;
    private final auah c;

    public auai(cqhn cqhnVar, String str, auah auahVar, String str2) {
        this.a = str;
        this.c = auahVar;
        this.b = str2;
    }

    @Override // defpackage.auak
    @dzsi
    public String a() {
        return this.a;
    }

    @Override // defpackage.auak
    public cqkl b() {
        View o = cqkx.o(this);
        if (o != null) {
            cpv.a.f(o, this.b);
        }
        atys atysVar = (atys) this.c;
        atyt atytVar = atysVar.a;
        if (atytVar.aD) {
            atytVar.J().g().f();
            atysVar.a.a.b(new crhv());
        }
        return cqkl.a;
    }

    @Override // defpackage.auak
    public cqkl c() {
        ((atys) this.c).a.J().g().e();
        return cqkl.a;
    }
}
