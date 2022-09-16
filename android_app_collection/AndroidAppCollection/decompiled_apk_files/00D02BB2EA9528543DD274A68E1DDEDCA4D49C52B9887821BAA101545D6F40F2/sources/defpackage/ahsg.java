package defpackage;
/* compiled from: PG */
/* renamed from: ahsg  reason: default package */
/* loaded from: classes2.dex */
public final class ahsg<T> extends btrh<T> {
    private final int d;

    public ahsg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ahsf ahsfVar = (ahsf) this.a;
            ahsfVar.c = ((crhp) obj).b();
            ahsfVar.f();
        } else if (i == 1) {
            ahsf ahsfVar2 = (ahsf) this.a;
            ahsfVar2.d = ((crmj) obj).b.a().h;
            ahsfVar2.f();
        } else if (i != 2) {
            ahsf ahsfVar3 = (ahsf) this.a;
            ahsfVar3.e = ((byze) obj).a();
            ahsfVar3.f();
        } else {
            ahsf ahsfVar4 = (ahsf) this.a;
            ahsfVar4.d = ((crhb) obj).a.a();
            ahsfVar4.f();
        }
    }
}
