package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyll  reason: default package */
/* loaded from: classes6.dex */
public final class dyll extends dymf {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dyhw b;
    final /* synthetic */ dyln c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyll(dyln dylnVar, dyjb dyjbVar, dyhw dyhwVar) {
        super(dylnVar.c.d);
        this.c = dylnVar;
        this.a = dyjbVar;
        this.b = dyhwVar;
    }

    @Override // defpackage.dymf
    public final void a() {
        int i = dyzn.a;
        dyjb dyjbVar = this.a;
        dyhw dyhwVar = this.b;
        dyjb dyjbVar2 = this.c.b;
        if (dyjbVar2 != null) {
            dyhwVar = new dyhw();
            dyjbVar = dyjbVar2;
        }
        this.c.c.f = true;
        this.c.a.b(dyjbVar, dyhwVar);
        this.c.c.b();
        this.c.c.c.b(dyjbVar.i());
    }
}
