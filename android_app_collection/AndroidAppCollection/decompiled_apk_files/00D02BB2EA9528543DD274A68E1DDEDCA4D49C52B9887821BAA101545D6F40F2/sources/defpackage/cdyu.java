package defpackage;
/* compiled from: PG */
/* renamed from: cdyu  reason: default package */
/* loaded from: classes4.dex */
final class cdyu implements Runnable {
    final /* synthetic */ cdyv a;
    final /* synthetic */ cdyl b;

    public cdyu(cdyv cdyvVar, cdyl cdylVar) {
        this.a = cdyvVar;
        this.b = cdylVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        this.a.s.a(this.b);
    }
}
