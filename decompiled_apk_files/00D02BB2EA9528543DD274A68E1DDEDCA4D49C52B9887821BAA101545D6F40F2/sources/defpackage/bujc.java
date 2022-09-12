package defpackage;
/* compiled from: PG */
/* renamed from: bujc  reason: default package */
/* loaded from: classes4.dex */
final class bujc implements Runnable {
    final /* synthetic */ bujd a;

    public bujc(bujd bujdVar) {
        this.a = bujdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.k(new RuntimeException("Unexpected redirect received from Paint Server! "));
    }
}
