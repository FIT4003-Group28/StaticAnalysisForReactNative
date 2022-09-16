package defpackage;
/* compiled from: PG */
/* renamed from: adhu  reason: default package */
/* loaded from: classes.dex */
final class adhu implements adny {
    final /* synthetic */ adhv a;

    public adhu(adhv adhvVar) {
        this.a = adhvVar;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        adhv adhvVar = this.a;
        adhvVar.b = true;
        adhvVar.b();
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        adhv adhvVar = this.a;
        adhvVar.b = false;
        adhvVar.b();
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        this.a.b = true;
    }
}
