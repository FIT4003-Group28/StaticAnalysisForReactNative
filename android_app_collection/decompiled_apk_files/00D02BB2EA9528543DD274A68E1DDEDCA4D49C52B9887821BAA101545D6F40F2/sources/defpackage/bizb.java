package defpackage;
/* compiled from: PG */
/* renamed from: bizb  reason: default package */
/* loaded from: classes3.dex */
final class bizb implements cjqv {
    final /* synthetic */ bizc a;
    private boolean b = false;

    public bizb(bizc bizcVar) {
        this.a = bizcVar;
    }

    @Override // defpackage.cjqv
    public final void a(cjtd cjtdVar) {
        cjtd cjtdVar2;
        if (this.b || (cjtdVar2 = this.a.a.a) == null) {
            return;
        }
        ddho ddhoVar = cjtdVar2.g;
        dbsk.s(ddhoVar);
        if (!ddhoVar.equals(cjtdVar.g)) {
            return;
        }
        this.b = true;
        bizd bizdVar = this.a.a;
        bizdVar.c = true;
        Runnable runnable = bizdVar.b;
        if (runnable == null) {
            return;
        }
        bizdVar.f.post(runnable);
    }
}
