package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhtq  reason: default package */
/* loaded from: classes3.dex */
public final class bhtq implements Runnable {
    final /* synthetic */ bhtr a;

    public bhtq(bhtr bhtrVar) {
        this.a = bhtrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akqq aj = this.a.c.c().aj();
        if (aj != null) {
            alaa b = alad.b(this.a.a.n());
            b.c(aj);
            alad a = b.a();
            bhtr bhtrVar = this.a;
            bhtrVar.b.i(a, bhtrVar.c.c().n());
        }
    }
}
