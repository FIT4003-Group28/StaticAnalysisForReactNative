package defpackage;
/* compiled from: PG */
/* renamed from: aypm  reason: default package */
/* loaded from: classes3.dex */
final class aypm implements ayax {
    final /* synthetic */ aypn a;

    public aypm(aypn aypnVar) {
        this.a = aypnVar;
    }

    @Override // defpackage.ayax
    public final void a() {
        this.a.c.a(ayoo.LOADING);
    }

    @Override // defpackage.ayax
    public final void b(baad baadVar) {
        this.a.c.a(baadVar.z() ? ayoo.ALTERNATE : ayoo.INITIAL);
    }

    @Override // defpackage.ayax
    public final void c() {
        this.a.c.a(ayoo.INITIAL);
    }
}
