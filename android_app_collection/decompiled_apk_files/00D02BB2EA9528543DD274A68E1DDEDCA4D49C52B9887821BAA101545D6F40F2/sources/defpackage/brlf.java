package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brlf  reason: default package */
/* loaded from: classes4.dex */
public final class brlf implements crzp<dbsg<String>> {
    final /* synthetic */ brlh a;

    public brlf(brlh brlhVar) {
        this.a = brlhVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dbsg<String>> crzmVar) {
        brlh brlhVar = this.a;
        dhjn dhjnVar = brlhVar.n;
        String a = brlhVar.f.a();
        if (dhjnVar.c) {
            dhjnVar.bF();
            dhjnVar.c = false;
        }
        dhjo dhjoVar = (dhjo) dhjnVar.b;
        dhjo dhjoVar2 = dhjo.h;
        a.getClass();
        dhjoVar.a |= 8;
        dhjoVar.e = a;
        this.a.m();
    }
}
