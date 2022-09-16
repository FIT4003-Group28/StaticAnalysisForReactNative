package defpackage;
/* compiled from: PG */
/* renamed from: azmu  reason: default package */
/* loaded from: classes2.dex */
final class azmu implements Runnable {
    final /* synthetic */ azmv a;
    private final ayqm b;
    private final Runnable c;

    public azmu(azmv azmvVar, ayqm ayqmVar, Runnable runnable) {
        this.a = azmvVar;
        this.b = ayqmVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayqi.i(this.b, this.a.a(this.c));
    }
}
