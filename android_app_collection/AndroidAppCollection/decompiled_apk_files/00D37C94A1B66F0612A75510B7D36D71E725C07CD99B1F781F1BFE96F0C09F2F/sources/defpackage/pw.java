package defpackage;
/* compiled from: PG */
/* renamed from: pw  reason: default package */
/* loaded from: classes4.dex */
final class pw implements Runnable {
    final /* synthetic */ pz a;

    public pw(pz pzVar) {
        this.a = pzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(true);
        this.a.invalidateSelf();
    }
}
