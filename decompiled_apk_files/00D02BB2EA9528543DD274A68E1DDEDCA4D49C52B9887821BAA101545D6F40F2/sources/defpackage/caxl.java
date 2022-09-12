package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caxl  reason: default package */
/* loaded from: classes4.dex */
public final class caxl implements Runnable {
    final /* synthetic */ caxm a;

    public caxl(caxm caxmVar) {
        this.a = caxmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        caxm caxmVar = this.a;
        caxmVar.f.b(caxmVar.i);
    }
}
