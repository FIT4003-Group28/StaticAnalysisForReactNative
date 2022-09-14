package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akyj  reason: default package */
/* loaded from: classes2.dex */
public final class akyj extends akyc {
    final /* synthetic */ akqq a;
    final /* synthetic */ float d;
    final /* synthetic */ alae e;

    public akyj(akqq akqqVar, float f, alae alaeVar) {
        this.a = akqqVar;
        this.d = f;
        this.e = alaeVar;
    }

    @Override // defpackage.akyc
    public final void a(akyb akybVar) {
        alaa b = alad.b(akybVar.c().p());
        b.c(this.a);
        b.c = this.d;
        b.f = this.e;
        akybVar.d(b.a(), this.b, this.c);
    }
}
