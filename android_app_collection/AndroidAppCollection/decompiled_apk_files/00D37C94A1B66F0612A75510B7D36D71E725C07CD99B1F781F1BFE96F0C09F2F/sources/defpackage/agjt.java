package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agjt  reason: default package */
/* loaded from: classes.dex */
public final class agjt implements agms {
    final /* synthetic */ agjz a;

    public agjt(agjz agjzVar) {
        this.a = agjzVar;
    }

    @Override // defpackage.agms
    public final void a(agqo agqoVar) {
        String f = agqoVar.f();
        aopa createBuilder = atsj.a.createBuilder();
        createBuilder.copyOnWrite();
        atsj atsjVar = (atsj) createBuilder.instance;
        f.getClass();
        atsjVar.b |= 1;
        atsjVar.d = f;
        createBuilder.copyOnWrite();
        atsj atsjVar2 = (atsj) createBuilder.instance;
        atsjVar2.h = 11;
        atsjVar2.b |= 16;
        ((agpt) this.a.c.get()).c((atsj) createBuilder.mo39build());
    }
}
