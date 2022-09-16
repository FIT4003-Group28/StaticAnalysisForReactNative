package defpackage;
/* compiled from: PG */
/* renamed from: fbp  reason: default package */
/* loaded from: classes3.dex */
final class fbp implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ fbr b;

    public fbp(fbr fbrVar, String str) {
        this.b = fbrVar;
        this.a = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        zep.d("Unexpected failure on immediate future.", th);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.c((agog) obj);
        this.b.e.remove(this.a);
    }
}
