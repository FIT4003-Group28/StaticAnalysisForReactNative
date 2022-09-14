package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ag  reason: default package */
/* loaded from: classes2.dex */
public final class ag implements Runnable {
    final i a;
    private final o b;
    private boolean c = false;

    public ag(o oVar, i iVar) {
        this.b = oVar;
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.b.e(this.a);
            this.c = true;
        }
    }
}
