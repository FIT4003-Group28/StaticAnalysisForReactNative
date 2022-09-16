package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnb  reason: default package */
/* loaded from: classes4.dex */
public final class rnb implements Runnable {
    final /* synthetic */ Boolean a;
    final /* synthetic */ rng b;

    public rnb(rng rngVar, Boolean bool) {
        this.b = rngVar;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.R(this.a, true);
    }
}
