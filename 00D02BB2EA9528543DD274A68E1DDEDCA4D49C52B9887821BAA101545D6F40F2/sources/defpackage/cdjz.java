package defpackage;
/* compiled from: PG */
/* renamed from: cdjz  reason: default package */
/* loaded from: classes4.dex */
final class cdjz<T> implements aa<T> {
    final /* synthetic */ cdkb a;

    public cdjz(cdkb cdkbVar) {
        this.a = cdkbVar;
    }

    @Override // defpackage.aa
    public final void m(T t) {
        cdkb cdkbVar = this.a;
        cdkbVar.g = t;
        if (cdkbVar.j.h() == null) {
            this.a.g(t);
        }
        cdkb cdkbVar2 = this.a;
        cdkbVar2.h.g(Boolean.valueOf(cdkbVar2.o(cdkbVar2.h(), t)));
    }
}
