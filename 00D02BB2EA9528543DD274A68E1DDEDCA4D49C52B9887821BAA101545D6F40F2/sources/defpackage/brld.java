package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brld  reason: default package */
/* loaded from: classes4.dex */
public final class brld implements brdh {
    final /* synthetic */ brlh a;

    public brld(brlh brlhVar) {
        this.a = brlhVar;
    }

    @Override // defpackage.brdh
    public final void a(brcy brcyVar) {
        dhjn dhjnVar = this.a.n;
        dgba g = brcyVar.g();
        if (dhjnVar.c) {
            dhjnVar.bF();
            dhjnVar.c = false;
        }
        dhjo dhjoVar = (dhjo) dhjnVar.b;
        dhjo dhjoVar2 = dhjo.h;
        g.getClass();
        dhjoVar.f = g;
        dhjoVar.a |= 16;
        this.a.m();
    }

    @Override // defpackage.brdh
    public final void b() {
        dhjn dhjnVar = this.a.n;
        if ((((dhjo) dhjnVar.b).a & 16) != 0) {
            if (dhjnVar.c) {
                dhjnVar.bF();
                dhjnVar.c = false;
            }
            dhjo dhjoVar = (dhjo) dhjnVar.b;
            dhjoVar.f = null;
            dhjoVar.a &= -17;
            this.a.m();
        }
    }
}
