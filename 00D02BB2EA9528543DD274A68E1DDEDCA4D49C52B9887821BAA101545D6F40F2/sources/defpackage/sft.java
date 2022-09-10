package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sft  reason: default package */
/* loaded from: classes7.dex */
public final class sft implements degu<dopk> {
    final /* synthetic */ degu a;
    final /* synthetic */ sfy b;

    public sft(sfy sfyVar, degu deguVar) {
        this.b = sfyVar;
        this.a = deguVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.C = false;
        degu deguVar = this.a;
        if (deguVar != null) {
            deguVar.a(th);
        }
        cqkx.p(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        this.b.C = false;
        if (dopkVar2 == null) {
            a(new NullPointerException());
            return;
        }
        degu deguVar = this.a;
        if (deguVar != null) {
            deguVar.b(dopkVar2);
        }
        cqkx.p(this.b);
    }
}
