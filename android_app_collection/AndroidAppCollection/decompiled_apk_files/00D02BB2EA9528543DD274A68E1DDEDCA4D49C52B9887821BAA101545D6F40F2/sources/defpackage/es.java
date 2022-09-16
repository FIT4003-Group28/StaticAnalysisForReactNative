package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: es  reason: default package */
/* loaded from: classes6.dex */
public final class es implements Runnable {
    final /* synthetic */ ex a;

    public es(ex exVar) {
        this.a = exVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ex exVar = this.a;
        exVar.a.onDismiss(exVar.d);
    }
}
