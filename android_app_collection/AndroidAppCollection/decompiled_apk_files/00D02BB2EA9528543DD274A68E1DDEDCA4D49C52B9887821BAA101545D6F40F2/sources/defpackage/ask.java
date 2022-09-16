package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ask  reason: default package */
/* loaded from: classes2.dex */
public final class ask implements Runnable {
    final /* synthetic */ asm a;

    public ask(asm asmVar) {
        this.a = asmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asm asmVar = this.a;
        int size = asmVar.g.size();
        for (int i = 0; i < size; i++) {
            asmVar.g.valueAt(i).b(null, null);
        }
        asmVar.g.clear();
    }
}
