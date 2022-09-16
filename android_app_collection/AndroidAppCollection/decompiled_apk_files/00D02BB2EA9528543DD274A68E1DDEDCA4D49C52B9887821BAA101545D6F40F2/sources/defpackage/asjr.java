package defpackage;
/* compiled from: PG */
/* renamed from: asjr  reason: default package */
/* loaded from: classes2.dex */
final class asjr implements degu<vwy> {
    final /* synthetic */ asjt a;

    public asjr(asjt asjtVar) {
        this.a = asjtVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcqe dcqeVar = asjt.a;
        bvoo.h("%s", th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi vwy vwyVar) {
        vwy vwyVar2 = vwyVar;
        asjt asjtVar = this.a;
        asjtVar.c = vwyVar2;
        if (vwyVar2 == null || !asjtVar.d) {
            return;
        }
        vwyVar2.a();
    }
}
