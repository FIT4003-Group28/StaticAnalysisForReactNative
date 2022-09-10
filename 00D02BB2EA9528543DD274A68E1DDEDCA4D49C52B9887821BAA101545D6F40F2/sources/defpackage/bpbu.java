package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpbu  reason: default package */
/* loaded from: classes3.dex */
public final class bpbu implements Runnable {
    final /* synthetic */ bpbw a;

    public bpbu(bpbw bpbwVar) {
        this.a = bpbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.a.K()) {
            this.a.q();
        }
    }
}
