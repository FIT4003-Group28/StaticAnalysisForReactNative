package defpackage;
/* compiled from: PG */
/* renamed from: atto  reason: default package */
/* loaded from: classes2.dex */
final class atto implements atsn {
    final /* synthetic */ attr a;

    public atto(attr attrVar) {
        this.a = attrVar;
    }

    @Override // defpackage.atsn
    public final void a(boolean z) {
        dbsk.s(((crqb) this.a.e).a);
        dpfh j = this.a.j();
        attr attrVar = this.a;
        amuh amuhVar = ((crpt) ((crqb) attrVar.e).a).b;
        if (j == null && attrVar.h()) {
            j = amuhVar.k().z;
        }
        attr attrVar2 = this.a;
        attrVar2.c.o(attrVar2.i().a, amuhVar, j);
        crjl crjlVar = ((crqb) this.a.e).d;
        if (crjlVar != null) {
            crjlVar.a();
        }
    }
}
