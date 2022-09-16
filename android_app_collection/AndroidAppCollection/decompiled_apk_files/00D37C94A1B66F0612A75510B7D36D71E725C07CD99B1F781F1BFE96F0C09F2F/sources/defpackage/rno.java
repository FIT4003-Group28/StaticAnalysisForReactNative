package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rno  reason: default package */
/* loaded from: classes4.dex */
public final class rno implements Runnable {
    final /* synthetic */ rnm a;
    final /* synthetic */ rnm b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rns e;

    public rno(rns rnsVar, rnm rnmVar, rnm rnmVar2, long j, boolean z) {
        this.e = rnsVar;
        this.a = rnmVar;
        this.b = rnmVar2;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.q(this.a, this.b, this.c, this.d, null);
    }
}
