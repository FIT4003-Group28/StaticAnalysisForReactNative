package defpackage;
/* compiled from: PG */
/* renamed from: pna  reason: default package */
/* loaded from: classes4.dex */
final class pna extends Thread {
    final /* synthetic */ pnb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pna(pnb pnbVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = pnbVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.q());
    }
}
