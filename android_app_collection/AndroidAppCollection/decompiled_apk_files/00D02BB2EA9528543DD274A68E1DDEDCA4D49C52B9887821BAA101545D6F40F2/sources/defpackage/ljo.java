package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljo  reason: default package */
/* loaded from: classes7.dex */
public final class ljo implements Runnable {
    final /* synthetic */ lju a;

    public ljo(lju ljuVar) {
        this.a = ljuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.a();
        do {
        } while (this.a.i() != 3);
        this.a.d.b();
    }
}
