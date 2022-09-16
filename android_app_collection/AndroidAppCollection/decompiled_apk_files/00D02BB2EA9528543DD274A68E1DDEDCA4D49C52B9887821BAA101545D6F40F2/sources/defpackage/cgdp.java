package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgdp  reason: default package */
/* loaded from: classes4.dex */
public final class cgdp implements Runnable {
    final /* synthetic */ cgdv a;

    public cgdp(cgdv cgdvVar) {
        this.a = cgdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.d(false);
        this.a.d = null;
    }
}
