package defpackage;
/* compiled from: PG */
/* renamed from: dytq  reason: default package */
/* loaded from: classes6.dex */
final class dytq implements Runnable {
    final /* synthetic */ dytr a;

    public dytq(dytr dytrVar) {
        this.a = dytrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dytr dytrVar = this.a;
        dytrVar.b.execute(new dytp(dytrVar));
    }
}
