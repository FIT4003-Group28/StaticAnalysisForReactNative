package defpackage;
/* compiled from: PG */
/* renamed from: ccfl  reason: default package */
/* loaded from: classes4.dex */
final class ccfl implements begr {
    final /* synthetic */ dkvn a;
    final /* synthetic */ blpk b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ilo d;
    final /* synthetic */ ccfn e;

    public ccfl(ccfn ccfnVar, dkvn dkvnVar, blpk blpkVar, boolean z, ilo iloVar) {
        this.e = ccfnVar;
        this.a = dkvnVar;
        this.b = blpkVar;
        this.c = z;
        this.d = iloVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        this.e.e(this.a, iloVar);
        this.e.h(iloVar, this.b, this.c);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        dbsl<afga> dbslVar = ccfn.a;
        this.e.e(this.a, this.d);
        this.e.h(this.d, this.b, this.c);
    }
}
