package defpackage;
/* compiled from: PG */
/* renamed from: aprs  reason: default package */
/* loaded from: classes2.dex */
final class aprs implements crzp<btlu> {
    final /* synthetic */ apru a;

    public aprs(apru apruVar) {
        this.a = apruVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (l == null) {
            return;
        }
        if (l.o() || l.m()) {
            this.a.k();
            apru apruVar = this.a;
            apruVar.d.a(apruVar.j);
        } else {
            btlu btluVar = this.a.j;
            if (btluVar != null && !dbsd.a(btluVar, l)) {
                this.a.k();
                apru apruVar2 = this.a;
                apruVar2.d.a(apruVar2.j);
                this.a.l(l);
                this.a.d.g(l);
            }
        }
        this.a.j = l;
    }
}
