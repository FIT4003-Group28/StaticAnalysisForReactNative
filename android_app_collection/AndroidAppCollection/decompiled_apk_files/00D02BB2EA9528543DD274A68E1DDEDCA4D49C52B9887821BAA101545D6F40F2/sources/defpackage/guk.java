package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: guk  reason: default package */
/* loaded from: classes6.dex */
public final class guk implements arae {
    final /* synthetic */ gum a;

    public guk(gum gumVar) {
        this.a = gumVar;
    }

    @Override // defpackage.arae
    public final void a(araf arafVar) {
        if (arafVar != araf.OPTIMIZED) {
            gum gumVar = this.a;
            gumVar.a.i(cjtd.a(gumVar.d));
            this.a.c(false);
            return;
        }
        gum gumVar2 = this.a;
        gumVar2.a.i(cjtd.a(gumVar2.e));
        this.a.c(true);
    }
}
