package defpackage;
/* compiled from: PG */
/* renamed from: cltj  reason: default package */
/* loaded from: classes5.dex */
final class cltj extends Thread {
    final /* synthetic */ cltk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cltj(cltk cltkVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = cltkVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.g());
    }
}
