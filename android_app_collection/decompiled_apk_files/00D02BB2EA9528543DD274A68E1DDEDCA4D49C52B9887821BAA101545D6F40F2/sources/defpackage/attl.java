package defpackage;
/* compiled from: PG */
/* renamed from: attl  reason: default package */
/* loaded from: classes2.dex */
final class attl implements atsn {
    final /* synthetic */ boolean a;
    final /* synthetic */ attm b;

    public attl(attm attmVar, boolean z) {
        this.b = attmVar;
        this.a = z;
    }

    @Override // defpackage.atsn
    public final void a(boolean z) {
        attm attmVar = this.b;
        attmVar.g.b(new crhi(this.a, attmVar.a.a));
    }
}
