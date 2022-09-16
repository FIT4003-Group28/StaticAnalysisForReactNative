package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aenj  reason: default package */
/* loaded from: classes.dex */
public final class aenj implements ankb {
    final /* synthetic */ aaqk a;
    final /* synthetic */ yqw b;
    final /* synthetic */ aenk c;

    public aenj(aenk aenkVar, aaqk aaqkVar, yqw yqwVar) {
        this.c = aenkVar;
        this.a = aaqkVar;
        this.b = yqwVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.c.c(this.b, this.a);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        asaj asajVar = (asaj) obj;
        aaqk aaqkVar = this.a;
        afms.a(asajVar);
        aaqkVar.qz(asajVar);
    }
}
