package defpackage;
/* compiled from: PG */
/* renamed from: atbk  reason: default package */
/* loaded from: classes2.dex */
final class atbk implements atdc {
    final /* synthetic */ atbq a;

    public atbk(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // defpackage.atdc
    public final void a(atlq atlqVar) {
        if (atlqVar.b()) {
            this.a.aT();
        }
    }

    @Override // defpackage.atdc
    public final void b(atlq atlqVar, atlq atlqVar2) {
        bvrj.UI_THREAD.c();
        this.a.bc.Oc(atlqVar, atlqVar2);
        if (atbq.bp(atlqVar, atlqVar2) || atbq.bq(atlqVar, atlqVar2)) {
            this.a.aT();
        }
    }
}
