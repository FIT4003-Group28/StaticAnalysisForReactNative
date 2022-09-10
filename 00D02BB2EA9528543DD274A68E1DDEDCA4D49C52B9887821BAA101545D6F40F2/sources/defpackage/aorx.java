package defpackage;
/* compiled from: PG */
/* renamed from: aorx  reason: default package */
/* loaded from: classes2.dex */
final class aorx implements brlm {
    private final aorv a;

    public aorx(aorv aorvVar) {
        this.a = aorvVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        brlu brluVar = brlnVar.e;
        if (brluVar.E() != 1 || !brluVar.D(0).c()) {
            return;
        }
        this.a.a(brluVar.D(0).d().h());
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
    }
}
