package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awpb  reason: default package */
/* loaded from: classes3.dex */
public final class awpb implements Runnable {
    final /* synthetic */ awpf a;

    public awpb(awpf awpfVar) {
        this.a = awpfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            this.a.c = true;
        }
        awpf awpfVar = this.a;
        awpfVar.a.j.b(awpfVar.k);
    }
}
