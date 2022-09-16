package defpackage;
/* compiled from: PG */
/* renamed from: atzh  reason: default package */
/* loaded from: classes2.dex */
final class atzh implements crzp<aufb> {
    final /* synthetic */ atzk a;

    public atzh(atzk atzkVar) {
        this.a = atzkVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        aufb l = crzmVar.l();
        dbsk.s(l);
        atzk atzkVar = this.a;
        boolean z = l.c;
        if (z == atzkVar.j) {
            return;
        }
        atzkVar.j = z;
        atzkVar.k();
        atzkVar.i.a();
        atzkVar.i = new atzi(atzkVar.b.getResources(), atzkVar.k.aE(), atzkVar.j);
        atzkVar.j(atzkVar.f, atzkVar.m, atzkVar.l, false);
        atzkVar.d.d(z, atzkVar.f);
    }
}
