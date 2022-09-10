package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mhs  reason: default package */
/* loaded from: classes7.dex */
public final class mhs implements crzp<ldm> {
    final /* synthetic */ mht a;

    public mhs(mht mhtVar) {
        this.a = mhtVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<ldm> crzmVar) {
        ldm l = crzmVar.l();
        if (l != null) {
            mht mhtVar = this.a;
            mhtVar.f = l;
            mhtVar.c.a(l, mhtVar.i, false);
            this.a.d.g(l);
            return;
        }
        mht mhtVar2 = this.a;
        if (mhtVar2.h) {
            return;
        }
        mhtVar2.h = true;
        mhtVar2.b.b();
    }
}
