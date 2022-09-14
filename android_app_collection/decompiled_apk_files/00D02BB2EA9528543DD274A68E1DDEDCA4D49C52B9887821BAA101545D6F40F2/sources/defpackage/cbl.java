package defpackage;
/* compiled from: PG */
/* renamed from: cbl  reason: default package */
/* loaded from: classes4.dex */
final class cbl<Model> implements buj<Model> {
    private final Model a;

    public cbl(Model model) {
        this.a = model;
    }

    @Override // defpackage.buj
    public final void a(bro broVar, bui<? super Model> buiVar) {
        buiVar.f((Model) this.a);
    }

    @Override // defpackage.buj
    public final void b() {
    }

    @Override // defpackage.buj
    public final void c() {
    }

    @Override // defpackage.buj
    public final Class<Model> d() {
        return (Class<Model>) this.a.getClass();
    }

    @Override // defpackage.buj
    public final int e() {
        return 1;
    }
}
