package defpackage;
/* compiled from: PG */
/* renamed from: cdka  reason: default package */
/* loaded from: classes4.dex */
final class cdka<T> implements aa<T> {
    final /* synthetic */ cdkb a;

    public cdka(cdkb cdkbVar) {
        this.a = cdkbVar;
    }

    @Override // defpackage.aa
    public final void m(T t) {
        cdkb cdkbVar = this.a;
        if (!cdkbVar.o(cdkbVar.h(), t)) {
            this.a.g(t);
        }
    }
}
