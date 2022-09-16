package defpackage;
/* compiled from: PG */
/* renamed from: abxu  reason: default package */
/* loaded from: classes2.dex */
final class abxu<T> {
    @dzsi
    public cryz<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cryz<T> a(bvqg<T> bvqgVar, bvqg<Throwable> bvqgVar2) {
        bvrj.UI_THREAD.c();
        cryz<T> cryzVar = this.a;
        if (cryzVar != null) {
            cryzVar.c();
        }
        cryz<T> cryzVar2 = new cryz<>(new abxt(bvqgVar, bvqgVar2));
        this.a = cryzVar2;
        return cryzVar2;
    }
}
